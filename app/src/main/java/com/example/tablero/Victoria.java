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
    int record;
    String nRecord;
    TextView tv_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victoria);
        //Recogo los datos de el numero de tiradas y los records hechos
        datos=getIntent().getExtras();
        record=datos.getInt("record");
        score=datos.getInt("score");
        tv_score=(TextView) findViewById(R.id.tvNpuntuacion);
        tv_record=(TextView) findViewById(R.id.tvNrecord);

        //Muestro en el textView el numero de tiradas de la partida
        this.nTiradas= String.valueOf(this.score);
        tv_score.setText(nTiradas);
        //Muestro en el Textview el record de tiradas de las partidas
        this.nRecord=String.valueOf(this.record);
        tv_record.setText(nRecord);
    }


    //Método para volver a el juego
    public void volver(View view)
    {
        Intent i= new Intent(this,Juego.class);
        startActivity(i);
    }

    //Impido que el usuario pueda volver a la anterior activity
    @Override
    public void onBackPressed() {

    }
}