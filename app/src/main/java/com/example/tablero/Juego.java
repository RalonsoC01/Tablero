package com.example.tablero;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
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
    ImageView imgdado;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        tv_tiradas = findViewById(R.id.tvNumeroTiradas);
        imgdado = findViewById(R.id.imgDado);

        imgdado.hasOnClickListeners(new View.OnClickListener())


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

       switch (dados){
           case 1:
               imgdado.setImageResource(R.drawable.dado_1);
               break;
           case 2:
               imgdado.setImageResource(R.drawable.dado_2);
               break;
           case 3:
               imgdado.setImageResource(R.drawable.dado_3);
               break;
           case 4:
               imgdado.setImageResource(R.drawable.dado_4);
               break;
           case 5:
               imgdado.setImageResource(R.drawable.dado_5);
               break;
           case 6:
               imgdado.setImageResource(R.drawable.dado_6);
       }

    }




}