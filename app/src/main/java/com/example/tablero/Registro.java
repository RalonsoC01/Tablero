package com.example.tablero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        mAuth = FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        nombre=(EditText) findViewById(R.id.txtNombreRegistro);
        email=(EditText) findViewById(R.id.txtEmailRegistro);
        contrsena=(EditText)findViewById(R.id.editTextTextPassword);


        progressDialog=new ProgressDialog(this);
    }

    public void registrousuario(View view) {

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
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
