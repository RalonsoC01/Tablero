package com.example.tablero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Victoria extends AppCompatActivity {
    Bundle datos;
    TextView tv_score;
    String nTiradas;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victoria);
        datos=getIntent().getExtras();
        score=datos.getInt("score");
        tv_score=(TextView) findViewById(R.id.tvNpuntuacion);

        this.nTiradas= String.valueOf(this.score);
        tv_score.setText(nTiradas);
    }


    public void volver(View view)
    {
        Intent i= new Intent(this,Juego.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {

    }
}