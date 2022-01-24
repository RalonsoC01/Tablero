package com.example.tablero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Registro (View view)
    {
        Intent i= new Intent(this,Registro.class);
        startActivity(i);
        overridePendingTransition(R.anim.deslizar_derecha, R.anim.deslizar_hacia_izquierda);
    }
}