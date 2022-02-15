package com.example.tablero;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Juego extends AppCompatActivity {

    int chest=0;
    int rowchest=0;
    int colchest=0;
    int tiradas=0;
    String nTiradas;
    private TextView tv_tiradas;
    int dados=0;
    ImageButton botondado;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        tv_tiradas = findViewById(R.id.tvNumeroTiradas);
        botondado = (ImageButton) findViewById(R.id.btnDado);

        mp = MediaPlayer.create(this, R.raw.sonidodados);



        int[][] tablero = new int[15][15];

        for(int row1 = 0; row1 < tablero.length; row1++){
            for(int col1 = 0; col1 < tablero[row1].length; col1++)

                tablero[row1][col1]=0;

        }

        if(chest==0){
            rowchest = (int) (Math.random()*14+0);
            colchest = (int) (Math.random()*14+0);

            tablero[rowchest][colchest]=1;
            chest++;
        }
    }



    public void LanzarDados(View view){
        dados = (int) (Math.random()*6+1);
        tiradas++;
        this.nTiradas= String.valueOf(this.tiradas);
        tv_tiradas.setText(nTiradas);

        mp.start();

       switch (dados){
           case 1:
               botondado.setImageResource(R.drawable.dado_1);
               break;
           case 2:
               botondado.setImageResource(R.drawable.dado_2);
               break;
           case 3:
               botondado.setImageResource(R.drawable.dado_3);
               break;
           case 4:
               botondado.setImageResource(R.drawable.dado_4);
               break;
           case 5:
               botondado.setImageResource(R.drawable.dado_5);
               break;
           case 6:
               botondado.setImageResource(R.drawable.dado_6);
       }


    }




}