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


        //Asigno al botón registrar el siguiente método en el que recopilamos los datos introducidos por el usuario y en caso de que no haya problemas invvocamos al método registeruser
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

    //Método en el que mediante los datos introducidos por el usuario estos son registrados en el firebase
    private void registerUser(){

        mAuth.createUserWithEmailAndPassword(emailStr,contrasenaStr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){

                    //si no hay ningun error se ejecutará lo siguiente y te llevará a la activity login
                    startActivity(new Intent(Registro.this , login.class));
                    finish();
                    // creamos un hash map para guardar los campos en la base de datos de firebase
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




    @Override
    public void onClick(View v) {

    }
}
