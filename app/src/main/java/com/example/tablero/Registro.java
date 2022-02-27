package com.example.tablero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;
import java.util.Map;

public class Registro extends AppCompatActivity implements View.OnClickListener {
    /**private EditText nombre;
    private EditText email;
    private EditText contrasena;
    private FirebaseAuth mAuth;
    private ProgressDialog progressDialog;**/
    private EditText nombre;
    private EditText email;
    private EditText contrsena;
    private FirebaseAuth mAuth;
    DatabaseReference mDatabase;
    private ProgressDialog progressDialog;
    private Button registrar;
    private String nombreStr;
    private String emailStr;
    private String contrasenaStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        /**mAuth = FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();**/
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        nombre=(EditText) findViewById(R.id.txtNombreRegistro);
        email=(EditText) findViewById(R.id.txtEmailRegistro);
        contrsena=(EditText)findViewById(R.id.editTextTextPassword);
        registrar = (Button) findViewById(R.id.btnRegistro);


        progressDialog=new ProgressDialog(this);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // asiganamos las variables para que sean rellenadas
                nombreStr = nombre.getText().toString();
                emailStr = email.getText().toString();
                contrasenaStr = contrsena.getText().toString();

                //hacemos un if para que en caso de que los campos esten completos se lanze el metodo registeruser
                if (!nombreStr.isEmpty() && !emailStr.isEmpty() && !contrasenaStr.isEmpty()){

                    if(contrasenaStr.length()>=6){
                        registerUser();

                    }
                    //un else para que cuando la contraseña no tenga mas de 6 caracteres salte un toast
                    else{
                        Toast.makeText(Registro.this, "La contraseña debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show();
                    }


                }
                // salta un toast si los campos no estan completos
                else {
                    Toast.makeText(Registro.this, "Campos incompletos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void registerUser(){

        mAuth.createUserWithEmailAndPassword(emailStr,contrasenaStr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){

                    //si la tarea es buena se lanza
                    startActivity(new Intent(Registro.this , login.class));
                    finish();
                    // creamos un hash map para guardar los campos
                    Map<String, Object> map = new HashMap<>();
                    map.put("nombre",nombreStr);
                    map.put("email",emailStr);

                    String id= mAuth.getCurrentUser().getUid();

                    mDatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()){
                                progressDialog.setMessage("Registrando...");
                                progressDialog.show();
                                startActivity(new Intent(Registro.this , login.class));
                                finish();
                            }
                            else{
                                Toast.makeText(Registro.this, "No se han podido crear los datos correctamente", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                }
                else{
                    Toast.makeText(Registro.this, "No se pudo registrar este usuario", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    /**public void registrousuario(View view) {

        String txtEmail = email.getText().toString().trim();
        String txtNombre = nombre.getText().toString().trim();
        String txtContrasena = contrsena.getText().toString().trim();


        if (TextUtils.isEmpty(txtEmail)) {
            Toast.makeText(this, "Se debe ingresar un correo", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(txtContrasena)) {
            Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(txtNombre)) {
            Toast.makeText(this, "Falta ingresar el nombre", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Registrando...");
        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(txtEmail, txtContrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Registro.this, "Se ha registrado el usuario con el email: " + txtEmail, Toast.LENGTH_SHORT).show();

                } else {
                    if (task.getException() instanceof FirebaseAuthUserCollisionException) {
                        Toast.makeText(getApplicationContext(), "El usuario ya existe", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "No se pudo registrar al usuario", Toast.LENGTH_SHORT).show();
                    }
                }
                progressDialog.dismiss();

                //Lanzo toast
                Context context = getApplicationContext();
                CharSequence text = "Prueba";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                //Cambio de Activity a login
                Intent intent = new Intent(Registro.this, login.class);
                startActivity(intent);
            }
        });
    }**/


    @Override
    public void onClick(View v) {

    }
}
