package com.example.tablero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth mAuth;
    private EditText Usuario;
    private EditText contrasena;
    private String usuarioStr;
    private String contrsenaStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_login);

        Usuario = (EditText) findViewById(R.id.txtEmail);
        contrasena = (EditText) findViewById(R.id.txtContrasena);

    }

    public void registrarme(View view)
    {
        Intent i= new Intent(this,Registro.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_arriba, R.anim.deslizar_hacia_abajo);
    }
    /**public void prueba(View view)
    {
        Intent i= new Intent(this,inicio.class);
        startActivity(i);
    }**/

    public void pasarIndex(View view){

        usuarioStr= Usuario.getText().toString();
        contrsenaStr = contrasena.getText().toString();
        if (!usuarioStr.isEmpty() && !contrsenaStr.isEmpty()){

            loginUser();
        }else{
            Toast.makeText(login.this, "El correo o la contraseña no existe.", Toast.LENGTH_SHORT).show();
        }
    }

    private void loginUser() {
        mAuth.signInWithEmailAndPassword(usuarioStr, contrsenaStr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(login.this, Juego.class);
                    startActivity(intent);
                    //Finalizar Activity
                    finish();
                }else{
                    Toast.makeText(login.this, "El correo o la contraseña no existe.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onClick(View v) {

    }
}