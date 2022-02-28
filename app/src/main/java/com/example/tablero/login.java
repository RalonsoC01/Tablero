package com.example.tablero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_login);

        Usuario = (EditText) findViewById(R.id.txtEmail);
        contrasena = (EditText) findViewById(R.id.txtContrasena);

        play = (Button) findViewById(R.id.btnPlay);
        play.setEnabled(false);
        play.setTextColor(Color.parseColor("#9E9E9E"));

    }

    public void jugar(View view)
    {
        Intent i= new Intent(this,Juego.class);
        startActivity(i);
    }

    public void registrarme(View view)
    {
        Intent i= new Intent(this,Registro.class);
        startActivity(i);
    }


    //Este metodo comprobará si el logueo es correcto y en caso que así sea invoco el método loginuser
    public void acceso(View view) {

        usuarioStr = Usuario.getText().toString();
        contrsenaStr = contrasena.getText().toString();

        if(!usuarioStr.isEmpty() && !contrsenaStr.isEmpty()){

            loginuser();
        }
        else{
            Toast.makeText(login.this, "Completa los campos", Toast.LENGTH_SHORT).show();
        }
    }

    //Este método logueará al usuario y en caso de que no ocurra ningun problema activará el botón para poder jugar
    private void loginuser(){

        mAuth.signInWithEmailAndPassword(usuarioStr, contrsenaStr).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    //En caso de no error habilitamos el boton de play
                    play.setEnabled(true);
                    play.setTextColor(Color.parseColor("#ffffff"));


                }
                //En caso de error lanzo el toast indicando lo sucedido
                else {
                    Toast.makeText(login.this, "No se pudo iniciar sesion, compruebe los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    //Impido que el usuario pueda volver a la anterior Activity
    @Override
    public void onBackPressed() {

    }
    @Override
    public void onClick(View v) {

    }
}