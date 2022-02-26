package com.example.tablero;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

    int xdado=0;
    int ydado=0;

    int xmover=0;
    int ymover=0;

    int xmover2=0;
    int ymover2=0;


    ImageButton btn0x0;
    ImageButton btn1x0;
    ImageButton btn2x0;
    ImageButton btn3x0;
    ImageButton btn4x0;
    ImageButton btn5x0;
    ImageButton btn6x0;
    ImageButton btn7x0;
    ImageButton btn8x0;
    ImageButton btn9x0;


    ImageButton btn0x1;
    ImageButton btn1x1;
    ImageButton btn2x1;
    ImageButton btn3x1;
    ImageButton btn4x1;
    ImageButton btn5x1;
    ImageButton btn6x1;
    ImageButton btn7x1;
    ImageButton btn8x1;
    ImageButton btn9x1;


    ImageButton btn0x2;
    ImageButton btn1x2;
    ImageButton btn2x2;
    ImageButton btn3x2;
    ImageButton btn4x2;
    ImageButton btn5x2;
    ImageButton btn6x2;
    ImageButton btn7x2;
    ImageButton btn8x2;
    ImageButton btn9x2;


    ImageButton btn0x3;
    ImageButton btn1x3;
    ImageButton btn2x3;
    ImageButton btn3x3;
    ImageButton btn4x3;
    ImageButton btn5x3;
    ImageButton btn6x3;
    ImageButton btn7x3;
    ImageButton btn8x3;
    ImageButton btn9x3;


    ImageButton btn0x4;
    ImageButton btn1x4;
    ImageButton btn2x4;
    ImageButton btn3x4;
    ImageButton btn4x4;
    ImageButton btn5x4;
    ImageButton btn6x4;
    ImageButton btn7x4;
    ImageButton btn8x4;
    ImageButton btn9x4;


    ImageButton btn0x5;
    ImageButton btn1x5;
    ImageButton btn2x5;
    ImageButton btn3x5;
    ImageButton btn4x5;
    ImageButton btn5x5;
    ImageButton btn6x5;
    ImageButton btn7x5;
    ImageButton btn8x5;
    ImageButton btn9x5;


    ImageButton btn0x6;
    ImageButton btn1x6;
    ImageButton btn2x6;
    ImageButton btn3x6;
    ImageButton btn4x6;
    ImageButton btn5x6;
    ImageButton btn6x6;
    ImageButton btn7x6;
    ImageButton btn8x6;
    ImageButton btn9x6;


    ImageButton btn0x7;
    ImageButton btn1x7;
    ImageButton btn2x7;
    ImageButton btn3x7;
    ImageButton btn4x7;
    ImageButton btn5x7;
    ImageButton btn6x7;
    ImageButton btn7x7;
    ImageButton btn8x7;
    ImageButton btn9x7;


    ImageButton btn0x8;
    ImageButton btn1x8;
    ImageButton btn2x8;
    ImageButton btn3x8;
    ImageButton btn4x8;
    ImageButton btn5x8;
    ImageButton btn6x8;
    ImageButton btn7x8;
    ImageButton btn8x8;
    ImageButton btn9x8;


    ImageButton btn0x9;
    ImageButton btn1x9;
    ImageButton btn2x9;
    ImageButton btn3x9;
    ImageButton btn4x9;
    ImageButton btn5x9;
    ImageButton btn6x9;
    ImageButton btn7x9;
    ImageButton btn8x9;
    ImageButton btn9x9;


    int[][] tablero = new int[10][10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        tv_tiradas = findViewById(R.id.tvNumeroTiradas);
        botondado = (ImageButton) findViewById(R.id.btnDado);

        //Sincronizo los imagenbutton y los desactivo
        btn0x0=(ImageButton) findViewById(R.id.btn0x0);
        btn0x0.setEnabled(false);
        btn1x0=(ImageButton) findViewById(R.id.btn1x0);
        btn1x0.setEnabled(false);
        btn2x0=(ImageButton) findViewById(R.id.btn2x0);
        btn2x0.setEnabled(false);
        btn3x0=(ImageButton) findViewById(R.id.btn3x0);
        btn3x0.setEnabled(false);
        btn4x0=(ImageButton) findViewById(R.id.btn4x0);
        btn4x0.setEnabled(false);
        btn5x0=(ImageButton) findViewById(R.id.btn5x0);
        btn5x0.setEnabled(false);
        btn6x0=(ImageButton) findViewById(R.id.btn6x0);
        btn6x0.setEnabled(false);
        btn7x0=(ImageButton) findViewById(R.id.btn7x0);
        btn7x0.setEnabled(false);
        btn8x0=(ImageButton) findViewById(R.id.btn8x0);
        btn8x0.setEnabled(false);
        btn9x0=(ImageButton) findViewById(R.id.btn9x0);
        btn9x0.setEnabled(false);



        btn0x1=(ImageButton) findViewById(R.id.btn0x1);
        btn0x1.setEnabled(false);
        btn1x1=(ImageButton) findViewById(R.id.btn1x1);
        btn1x1.setEnabled(false);
        btn2x1=(ImageButton) findViewById(R.id.btn2x1);
        btn2x1.setEnabled(false);
        btn3x1=(ImageButton) findViewById(R.id.btn3x1);
        btn3x1.setEnabled(false);
        btn4x1=(ImageButton) findViewById(R.id.btn4x1);
        btn4x1.setEnabled(false);
        btn5x1=(ImageButton) findViewById(R.id.btn5x1);
        btn5x1.setEnabled(false);
        btn6x1=(ImageButton) findViewById(R.id.btn6x1);
        btn6x1.setEnabled(false);
        btn7x1=(ImageButton) findViewById(R.id.btn7x1);
        btn7x1.setEnabled(false);
        btn8x1=(ImageButton) findViewById(R.id.btn8x1);
        btn8x1.setEnabled(false);
        btn9x1=(ImageButton) findViewById(R.id.btn9x1);
        btn9x1.setEnabled(false);



        btn0x2=(ImageButton) findViewById(R.id.btn0x2);
        btn0x2.setEnabled(false);
        btn1x2=(ImageButton) findViewById(R.id.btn1x2);
        btn1x2.setEnabled(false);
        btn2x2=(ImageButton) findViewById(R.id.btn2x2);
        btn2x2.setEnabled(false);
        btn3x2=(ImageButton) findViewById(R.id.btn3x2);
        btn3x2.setEnabled(false);
        btn4x2=(ImageButton) findViewById(R.id.btn4x2);
        btn4x2.setEnabled(false);
        btn5x2=(ImageButton) findViewById(R.id.btn5x2);
        btn5x2.setEnabled(false);
        btn6x2=(ImageButton) findViewById(R.id.btn6x2);
        btn6x2.setEnabled(false);
        btn7x2=(ImageButton) findViewById(R.id.btn7x2);
        btn7x2.setEnabled(false);
        btn8x2=(ImageButton) findViewById(R.id.btn8x2);
        btn8x2.setEnabled(false);
        btn9x2=(ImageButton) findViewById(R.id.btn9x2);
        btn9x2.setEnabled(false);



        btn0x3=(ImageButton) findViewById(R.id.btn0x3);
        btn0x3.setEnabled(false);
        btn1x3=(ImageButton) findViewById(R.id.btn1x3);
        btn1x3.setEnabled(false);
        btn2x3=(ImageButton) findViewById(R.id.btn2x3);
        btn2x3.setEnabled(false);
        btn3x3=(ImageButton) findViewById(R.id.btn3x3);
        btn3x3.setEnabled(false);
        btn4x3=(ImageButton) findViewById(R.id.btn4x3);
        btn4x3.setEnabled(false);
        btn5x3=(ImageButton) findViewById(R.id.btn5x3);
        btn5x3.setEnabled(false);
        btn6x3=(ImageButton) findViewById(R.id.btn6x3);
        btn6x3.setEnabled(false);
        btn7x3=(ImageButton) findViewById(R.id.btn7x3);
        btn7x3.setEnabled(false);
        btn8x3=(ImageButton) findViewById(R.id.btn8x3);
        btn8x3.setEnabled(false);
        btn9x3=(ImageButton) findViewById(R.id.btn9x3);
        btn9x3.setEnabled(false);



        btn0x4=(ImageButton) findViewById(R.id.btn0x4);
        btn0x4.setEnabled(false);
        btn1x4=(ImageButton) findViewById(R.id.btn1x4);
        btn1x4.setEnabled(false);
        btn2x4=(ImageButton) findViewById(R.id.btn2x4);
        btn2x4.setEnabled(false);
        btn3x4=(ImageButton) findViewById(R.id.btn3x4);
        btn3x4.setEnabled(false);
        btn4x4=(ImageButton) findViewById(R.id.btn4x4);
        btn4x4.setEnabled(false);
        btn5x4=(ImageButton) findViewById(R.id.btn5x4);
        btn5x4.setEnabled(false);
        btn6x4=(ImageButton) findViewById(R.id.btn6x4);
        btn6x4.setEnabled(false);
        btn7x4=(ImageButton) findViewById(R.id.btn7x4);
        btn7x4.setEnabled(false);
        btn8x4=(ImageButton) findViewById(R.id.btn8x4);
        btn8x4.setEnabled(false);
        btn9x4=(ImageButton) findViewById(R.id.btn9x4);
        btn9x4.setEnabled(false);



        btn0x5=(ImageButton) findViewById(R.id.btn0x5);
        btn0x5.setEnabled(false);
        btn1x5=(ImageButton) findViewById(R.id.btn1x5);
        btn1x5.setEnabled(false);
        btn2x5=(ImageButton) findViewById(R.id.btn2x5);
        btn2x5.setEnabled(false);
        btn3x5=(ImageButton) findViewById(R.id.btn3x5);
        btn3x5.setEnabled(false);
        btn4x5=(ImageButton) findViewById(R.id.btn4x5);
        btn4x5.setEnabled(false);
        btn5x5=(ImageButton) findViewById(R.id.btn5x5);
        btn5x5.setEnabled(false);
        btn6x5=(ImageButton) findViewById(R.id.btn6x5);
        btn6x5.setEnabled(false);
        btn7x5=(ImageButton) findViewById(R.id.btn7x5);
        btn7x5.setEnabled(false);
        btn8x5=(ImageButton) findViewById(R.id.btn8x5);
        btn8x5.setEnabled(false);
        btn9x5=(ImageButton) findViewById(R.id.btn9x5);
        btn9x5.setEnabled(false);



        btn0x6=(ImageButton) findViewById(R.id.btn0x6);
        btn0x6.setEnabled(false);
        btn1x6=(ImageButton) findViewById(R.id.btn1x6);
        btn1x6.setEnabled(false);
        btn2x6=(ImageButton) findViewById(R.id.btn2x6);
        btn2x6.setEnabled(false);
        btn3x6=(ImageButton) findViewById(R.id.btn3x6);
        btn3x6.setEnabled(false);
        btn4x6=(ImageButton) findViewById(R.id.btn4x6);
        btn4x6.setEnabled(false);
        btn5x6=(ImageButton) findViewById(R.id.btn5x6);
        btn5x6.setEnabled(false);
        btn6x6=(ImageButton) findViewById(R.id.btn6x6);
        btn6x6.setEnabled(false);
        btn7x6=(ImageButton) findViewById(R.id.btn7x6);
        btn7x6.setEnabled(false);
        btn8x6=(ImageButton) findViewById(R.id.btn8x6);
        btn8x6.setEnabled(false);
        btn9x6=(ImageButton) findViewById(R.id.btn9x6);
        btn9x6.setEnabled(false);



        btn0x7=(ImageButton) findViewById(R.id.btn0x7);
        btn0x7.setEnabled(false);
        btn1x7=(ImageButton) findViewById(R.id.btn1x7);
        btn1x7.setEnabled(false);
        btn2x7=(ImageButton) findViewById(R.id.btn2x7);
        btn2x7.setEnabled(false);
        btn3x7=(ImageButton) findViewById(R.id.btn3x7);
        btn3x7.setEnabled(false);
        btn4x7=(ImageButton) findViewById(R.id.btn4x7);
        btn4x7.setEnabled(false);
        btn5x7=(ImageButton) findViewById(R.id.btn5x7);
        btn5x7.setEnabled(false);
        btn6x7=(ImageButton) findViewById(R.id.btn6x7);
        btn6x7.setEnabled(false);
        btn7x7=(ImageButton) findViewById(R.id.btn7x7);
        btn7x7.setEnabled(false);
        btn8x7=(ImageButton) findViewById(R.id.btn8x7);
        btn8x7.setEnabled(false);
        btn9x7=(ImageButton) findViewById(R.id.btn9x7);
        btn9x7.setEnabled(false);



        btn0x8=(ImageButton) findViewById(R.id.btn0x8);
        btn0x8.setEnabled(false);
        btn1x8=(ImageButton) findViewById(R.id.btn1x8);
        btn1x8.setEnabled(false);
        btn2x8=(ImageButton) findViewById(R.id.btn2x8);
        btn2x8.setEnabled(false);
        btn3x8=(ImageButton) findViewById(R.id.btn3x8);
        btn3x8.setEnabled(false);
        btn4x8=(ImageButton) findViewById(R.id.btn4x8);
        btn4x8.setEnabled(false);
        btn5x8=(ImageButton) findViewById(R.id.btn5x8);
        btn5x8.setEnabled(false);
        btn6x8=(ImageButton) findViewById(R.id.btn6x8);
        btn6x8.setEnabled(false);
        btn7x8=(ImageButton) findViewById(R.id.btn7x8);
        btn7x8.setEnabled(false);
        btn8x8=(ImageButton) findViewById(R.id.btn8x8);
        btn8x8.setEnabled(false);
        btn9x8=(ImageButton) findViewById(R.id.btn9x8);
        btn9x8.setEnabled(false);



        btn0x9=(ImageButton) findViewById(R.id.btn0x9);
        btn0x9.setEnabled(false);
        btn1x9=(ImageButton) findViewById(R.id.btn1x9);
        btn1x9.setEnabled(false);
        btn2x9=(ImageButton) findViewById(R.id.btn2x9);
        btn2x9.setEnabled(false);
        btn3x9=(ImageButton) findViewById(R.id.btn3x9);
        btn3x9.setEnabled(false);
        btn4x9=(ImageButton) findViewById(R.id.btn4x9);
        btn4x9.setEnabled(false);
        btn5x9=(ImageButton) findViewById(R.id.btn5x9);
        btn5x9.setEnabled(false);
        btn6x9=(ImageButton) findViewById(R.id.btn6x9);
        btn6x9.setEnabled(false);
        btn7x9=(ImageButton) findViewById(R.id.btn7x9);
        btn7x9.setEnabled(false);
        btn8x9=(ImageButton) findViewById(R.id.btn8x9);
        btn8x9.setEnabled(false);
        btn9x9=(ImageButton) findViewById(R.id.btn9x9);
        btn9x9.setEnabled(false);


        mp = MediaPlayer.create(this, R.raw.sonidodados);


        for (int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){
                tablero[i][j]=0;
            }
        }
        tablero[9][9]=1;
        tablero[0][0]=2;

    }
    public void casilla0x0(View view){

        //Muevo el pirata a la posición seleccionada
        btn0x0.setImageResource(R.drawable.pirate);

        //Actualizo a X y la Y del array
        xdado=0;
        ydado=0;

        //Compruebo que el cofre no esté en esta casilla
        if(tablero[xdado][ydado]==1){
            Toast.makeText(Juego.this, "¡Felicidades! ¡has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn1x0.setImageResource(R.drawable.square__2_);
        btn2x0.setImageResource(R.drawable.square__2_);
        btn3x0.setImageResource(R.drawable.square__2_);
        btn4x0.setImageResource(R.drawable.square__2_);
        btn5x0.setImageResource(R.drawable.square__2_);
        btn6x0.setImageResource(R.drawable.square__2_);
        btn7x0.setImageResource(R.drawable.square__2_);
        btn8x0.setImageResource(R.drawable.square__2_);
        btn9x0.setImageResource(R.drawable.square__2_);

        btn0x1.setImageResource(R.drawable.square__2_);
        btn1x1.setImageResource(R.drawable.square__2_);
        btn2x1.setImageResource(R.drawable.square__2_);
        btn3x1.setImageResource(R.drawable.square__2_);
        btn4x1.setImageResource(R.drawable.square__2_);
        btn5x1.setImageResource(R.drawable.square__2_);
        btn6x1.setImageResource(R.drawable.square__2_);
        btn7x1.setImageResource(R.drawable.square__2_);
        btn8x1.setImageResource(R.drawable.square__2_);
        btn9x1.setImageResource(R.drawable.square__2_);

        btn0x2.setImageResource(R.drawable.square__2_);
        btn1x2.setImageResource(R.drawable.square__2_);
        btn2x2.setImageResource(R.drawable.square__2_);
        btn3x2.setImageResource(R.drawable.square__2_);
        btn4x2.setImageResource(R.drawable.square__2_);
        btn5x2.setImageResource(R.drawable.square__2_);
        btn6x2.setImageResource(R.drawable.square__2_);
        btn7x2.setImageResource(R.drawable.square__2_);
        btn8x2.setImageResource(R.drawable.square__2_);
        btn9x2.setImageResource(R.drawable.square__2_);

        btn0x3.setImageResource(R.drawable.square__2_);
        btn1x3.setImageResource(R.drawable.square__2_);
        btn2x3.setImageResource(R.drawable.square__2_);
        btn3x3.setImageResource(R.drawable.square__2_);
        btn4x3.setImageResource(R.drawable.square__2_);
        btn5x3.setImageResource(R.drawable.square__2_);
        btn6x3.setImageResource(R.drawable.square__2_);
        btn7x3.setImageResource(R.drawable.square__2_);
        btn8x3.setImageResource(R.drawable.square__2_);
        btn9x3.setImageResource(R.drawable.square__2_);

        btn0x4.setImageResource(R.drawable.square__2_);
        btn1x4.setImageResource(R.drawable.square__2_);
        btn2x4.setImageResource(R.drawable.square__2_);
        btn3x4.setImageResource(R.drawable.square__2_);
        btn4x4.setImageResource(R.drawable.square__2_);
        btn5x4.setImageResource(R.drawable.square__2_);
        btn6x4.setImageResource(R.drawable.square__2_);
        btn7x4.setImageResource(R.drawable.square__2_);
        btn8x4.setImageResource(R.drawable.square__2_);
        btn9x4.setImageResource(R.drawable.square__2_);

        btn0x5.setImageResource(R.drawable.square__2_);
        btn1x5.setImageResource(R.drawable.square__2_);
        btn2x5.setImageResource(R.drawable.square__2_);
        btn3x5.setImageResource(R.drawable.square__2_);
        btn4x5.setImageResource(R.drawable.square__2_);
        btn5x5.setImageResource(R.drawable.square__2_);
        btn6x5.setImageResource(R.drawable.square__2_);
        btn7x5.setImageResource(R.drawable.square__2_);
        btn8x5.setImageResource(R.drawable.square__2_);
        btn9x5.setImageResource(R.drawable.square__2_);

        btn0x6.setImageResource(R.drawable.square__2_);
        btn1x6.setImageResource(R.drawable.square__2_);
        btn2x6.setImageResource(R.drawable.square__2_);
        btn3x6.setImageResource(R.drawable.square__2_);
        btn4x6.setImageResource(R.drawable.square__2_);
        btn5x6.setImageResource(R.drawable.square__2_);
        btn6x6.setImageResource(R.drawable.square__2_);
        btn7x6.setImageResource(R.drawable.square__2_);
        btn8x6.setImageResource(R.drawable.square__2_);
        btn9x6.setImageResource(R.drawable.square__2_);

        btn0x7.setImageResource(R.drawable.square__2_);
        btn1x7.setImageResource(R.drawable.square__2_);
        btn2x7.setImageResource(R.drawable.square__2_);
        btn3x7.setImageResource(R.drawable.square__2_);
        btn4x7.setImageResource(R.drawable.square__2_);
        btn5x7.setImageResource(R.drawable.square__2_);
        btn6x7.setImageResource(R.drawable.square__2_);
        btn7x7.setImageResource(R.drawable.square__2_);
        btn8x7.setImageResource(R.drawable.square__2_);
        btn9x7.setImageResource(R.drawable.square__2_);

        btn0x8.setImageResource(R.drawable.square__2_);
        btn1x8.setImageResource(R.drawable.square__2_);
        btn2x8.setImageResource(R.drawable.square__2_);
        btn3x8.setImageResource(R.drawable.square__2_);
        btn4x8.setImageResource(R.drawable.square__2_);
        btn5x8.setImageResource(R.drawable.square__2_);
        btn6x8.setImageResource(R.drawable.square__2_);
        btn7x8.setImageResource(R.drawable.square__2_);
        btn8x8.setImageResource(R.drawable.square__2_);
        btn9x8.setImageResource(R.drawable.square__2_);

        btn0x9.setImageResource(R.drawable.square__2_);
        btn1x9.setImageResource(R.drawable.square__2_);
        btn2x9.setImageResource(R.drawable.square__2_);
        btn3x9.setImageResource(R.drawable.square__2_);
        btn4x9.setImageResource(R.drawable.square__2_);
        btn5x9.setImageResource(R.drawable.square__2_);
        btn6x9.setImageResource(R.drawable.square__2_);
        btn7x9.setImageResource(R.drawable.square__2_);
        btn8x9.setImageResource(R.drawable.square__2_);
        btn9x9.setImageResource(R.drawable.square__2_);

        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);
    }

    public void casilla1x0(View view){

        //Muevo el pirata a la posición seleccionada
        btn1x0.setImageResource(R.drawable.pirate);

        //Actualizo a X y la Y del array
        xdado=1;
        ydado=0;

        //Compruebo que el cofre no esté en esta casilla
        if(tablero[xdado][ydado]==1){
            Toast.makeText(Juego.this, "¡Felicidades! ¡has encontrado el cofre!", Toast.LENGTH_SHORT).show();
        }

        //Actulizo la imagen de todas las demas casillas
        btn0x0.setImageResource(R.drawable.square__2_);
        btn2x0.setImageResource(R.drawable.square__2_);
        btn3x0.setImageResource(R.drawable.square__2_);
        btn4x0.setImageResource(R.drawable.square__2_);
        btn5x0.setImageResource(R.drawable.square__2_);
        btn6x0.setImageResource(R.drawable.square__2_);
        btn7x0.setImageResource(R.drawable.square__2_);
        btn8x0.setImageResource(R.drawable.square__2_);
        btn9x0.setImageResource(R.drawable.square__2_);

        btn0x1.setImageResource(R.drawable.square__2_);
        btn1x1.setImageResource(R.drawable.square__2_);
        btn2x1.setImageResource(R.drawable.square__2_);
        btn3x1.setImageResource(R.drawable.square__2_);
        btn4x1.setImageResource(R.drawable.square__2_);
        btn5x1.setImageResource(R.drawable.square__2_);
        btn6x1.setImageResource(R.drawable.square__2_);
        btn7x1.setImageResource(R.drawable.square__2_);
        btn8x1.setImageResource(R.drawable.square__2_);
        btn9x1.setImageResource(R.drawable.square__2_);

        btn0x2.setImageResource(R.drawable.square__2_);
        btn1x2.setImageResource(R.drawable.square__2_);
        btn2x2.setImageResource(R.drawable.square__2_);
        btn3x2.setImageResource(R.drawable.square__2_);
        btn4x2.setImageResource(R.drawable.square__2_);
        btn5x2.setImageResource(R.drawable.square__2_);
        btn6x2.setImageResource(R.drawable.square__2_);
        btn7x2.setImageResource(R.drawable.square__2_);
        btn8x2.setImageResource(R.drawable.square__2_);
        btn9x2.setImageResource(R.drawable.square__2_);

        btn0x3.setImageResource(R.drawable.square__2_);
        btn1x3.setImageResource(R.drawable.square__2_);
        btn2x3.setImageResource(R.drawable.square__2_);
        btn3x3.setImageResource(R.drawable.square__2_);
        btn4x3.setImageResource(R.drawable.square__2_);
        btn5x3.setImageResource(R.drawable.square__2_);
        btn6x3.setImageResource(R.drawable.square__2_);
        btn7x3.setImageResource(R.drawable.square__2_);
        btn8x3.setImageResource(R.drawable.square__2_);
        btn9x3.setImageResource(R.drawable.square__2_);

        btn0x4.setImageResource(R.drawable.square__2_);
        btn1x4.setImageResource(R.drawable.square__2_);
        btn2x4.setImageResource(R.drawable.square__2_);
        btn3x4.setImageResource(R.drawable.square__2_);
        btn4x4.setImageResource(R.drawable.square__2_);
        btn5x4.setImageResource(R.drawable.square__2_);
        btn6x4.setImageResource(R.drawable.square__2_);
        btn7x4.setImageResource(R.drawable.square__2_);
        btn8x4.setImageResource(R.drawable.square__2_);
        btn9x4.setImageResource(R.drawable.square__2_);

        btn0x5.setImageResource(R.drawable.square__2_);
        btn1x5.setImageResource(R.drawable.square__2_);
        btn2x5.setImageResource(R.drawable.square__2_);
        btn3x5.setImageResource(R.drawable.square__2_);
        btn4x5.setImageResource(R.drawable.square__2_);
        btn5x5.setImageResource(R.drawable.square__2_);
        btn6x5.setImageResource(R.drawable.square__2_);
        btn7x5.setImageResource(R.drawable.square__2_);
        btn8x5.setImageResource(R.drawable.square__2_);
        btn9x5.setImageResource(R.drawable.square__2_);

        btn0x6.setImageResource(R.drawable.square__2_);
        btn1x6.setImageResource(R.drawable.square__2_);
        btn2x6.setImageResource(R.drawable.square__2_);
        btn3x6.setImageResource(R.drawable.square__2_);
        btn4x6.setImageResource(R.drawable.square__2_);
        btn5x6.setImageResource(R.drawable.square__2_);
        btn6x6.setImageResource(R.drawable.square__2_);
        btn7x6.setImageResource(R.drawable.square__2_);
        btn8x6.setImageResource(R.drawable.square__2_);
        btn9x6.setImageResource(R.drawable.square__2_);

        btn0x7.setImageResource(R.drawable.square__2_);
        btn1x7.setImageResource(R.drawable.square__2_);
        btn2x7.setImageResource(R.drawable.square__2_);
        btn3x7.setImageResource(R.drawable.square__2_);
        btn4x7.setImageResource(R.drawable.square__2_);
        btn5x7.setImageResource(R.drawable.square__2_);
        btn6x7.setImageResource(R.drawable.square__2_);
        btn7x7.setImageResource(R.drawable.square__2_);
        btn8x7.setImageResource(R.drawable.square__2_);
        btn9x7.setImageResource(R.drawable.square__2_);

        btn0x8.setImageResource(R.drawable.square__2_);
        btn1x8.setImageResource(R.drawable.square__2_);
        btn2x8.setImageResource(R.drawable.square__2_);
        btn3x8.setImageResource(R.drawable.square__2_);
        btn4x8.setImageResource(R.drawable.square__2_);
        btn5x8.setImageResource(R.drawable.square__2_);
        btn6x8.setImageResource(R.drawable.square__2_);
        btn7x8.setImageResource(R.drawable.square__2_);
        btn8x8.setImageResource(R.drawable.square__2_);
        btn9x8.setImageResource(R.drawable.square__2_);

        btn0x9.setImageResource(R.drawable.square__2_);
        btn1x9.setImageResource(R.drawable.square__2_);
        btn2x9.setImageResource(R.drawable.square__2_);
        btn3x9.setImageResource(R.drawable.square__2_);
        btn4x9.setImageResource(R.drawable.square__2_);
        btn5x9.setImageResource(R.drawable.square__2_);
        btn6x9.setImageResource(R.drawable.square__2_);
        btn7x9.setImageResource(R.drawable.square__2_);
        btn8x9.setImageResource(R.drawable.square__2_);
        btn9x9.setImageResource(R.drawable.square__2_);

        //Bloqueo los botones de todos las casillas
        btn0x0.setEnabled(false);
        btn1x0.setEnabled(false);
        btn2x0.setEnabled(false);
        btn3x0.setEnabled(false);
        btn4x0.setEnabled(false);
        btn5x0.setEnabled(false);
        btn6x0.setEnabled(false);
        btn7x0.setEnabled(false);
        btn8x0.setEnabled(false);
        btn9x0.setEnabled(false);

        btn0x1.setEnabled(false);
        btn1x1.setEnabled(false);
        btn2x1.setEnabled(false);
        btn3x1.setEnabled(false);
        btn4x1.setEnabled(false);
        btn5x1.setEnabled(false);
        btn6x1.setEnabled(false);
        btn7x1.setEnabled(false);
        btn8x1.setEnabled(false);
        btn9x1.setEnabled(false);

        btn0x2.setEnabled(false);
        btn1x2.setEnabled(false);
        btn2x2.setEnabled(false);
        btn3x2.setEnabled(false);
        btn4x2.setEnabled(false);
        btn5x2.setEnabled(false);
        btn6x2.setEnabled(false);
        btn7x2.setEnabled(false);
        btn8x2.setEnabled(false);
        btn9x2.setEnabled(false);

        btn0x3.setEnabled(false);
        btn1x3.setEnabled(false);
        btn2x3.setEnabled(false);
        btn3x3.setEnabled(false);
        btn4x3.setEnabled(false);
        btn5x3.setEnabled(false);
        btn6x3.setEnabled(false);
        btn7x3.setEnabled(false);
        btn8x3.setEnabled(false);
        btn9x3.setEnabled(false);

        btn0x4.setEnabled(false);
        btn1x4.setEnabled(false);
        btn2x4.setEnabled(false);
        btn3x4.setEnabled(false);
        btn4x4.setEnabled(false);
        btn5x4.setEnabled(false);
        btn6x4.setEnabled(false);
        btn7x4.setEnabled(false);
        btn8x4.setEnabled(false);
        btn9x4.setEnabled(false);

        btn0x5.setEnabled(false);
        btn1x5.setEnabled(false);
        btn2x5.setEnabled(false);
        btn3x5.setEnabled(false);
        btn4x5.setEnabled(false);
        btn5x5.setEnabled(false);
        btn6x5.setEnabled(false);
        btn7x5.setEnabled(false);
        btn8x5.setEnabled(false);
        btn9x5.setEnabled(false);

        btn0x6.setEnabled(false);
        btn1x6.setEnabled(false);
        btn2x6.setEnabled(false);
        btn3x6.setEnabled(false);
        btn4x6.setEnabled(false);
        btn5x6.setEnabled(false);
        btn6x6.setEnabled(false);
        btn7x6.setEnabled(false);
        btn8x6.setEnabled(false);
        btn9x6.setEnabled(false);

        btn0x7.setEnabled(false);
        btn1x7.setEnabled(false);
        btn2x7.setEnabled(false);
        btn3x7.setEnabled(false);
        btn4x7.setEnabled(false);
        btn5x7.setEnabled(false);
        btn6x7.setEnabled(false);
        btn7x7.setEnabled(false);
        btn8x7.setEnabled(false);
        btn9x7.setEnabled(false);

        btn0x8.setEnabled(false);
        btn1x8.setEnabled(false);
        btn2x8.setEnabled(false);
        btn3x8.setEnabled(false);
        btn4x8.setEnabled(false);
        btn5x8.setEnabled(false);
        btn6x8.setEnabled(false);
        btn7x8.setEnabled(false);
        btn8x8.setEnabled(false);
        btn9x8.setEnabled(false);

        btn0x9.setEnabled(false);
        btn1x9.setEnabled(false);
        btn2x9.setEnabled(false);
        btn3x9.setEnabled(false);
        btn4x9.setEnabled(false);
        btn5x9.setEnabled(false);
        btn6x9.setEnabled(false);
        btn7x9.setEnabled(false);
        btn8x9.setEnabled(false);
        btn9x9.setEnabled(false);
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


       xmover=xdado+dados;
       ymover=ydado+dados;

       xmover2=xdado-dados;
       ymover2=ydado-dados;


       //Si el movimiento te permite acceder a la posición x se activará los botones correspondientes
        if(xmover<=9 && ydado==0 && xmover==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
       if(xmover<=9 && ydado==0 && xmover==1){
           btn1x0.setEnabled(true);
           btn1x0.setImageResource(R.drawable.square_red);
       }
        if(xmover<=9 && ydado==0 && xmover2==1){
            btn1x0.setEnabled(true);
            btn1x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==2){
            btn2x0.setEnabled(true);
            btn2x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==2){
            btn2x0.setEnabled(true);
            btn2x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==3) {
            btn3x0.setEnabled(true);
            btn3x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==3){
            btn3x0.setEnabled(true);
            btn3x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==4) {
            btn4x0.setEnabled(true);
            btn4x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==4){
            btn4x0.setEnabled(true);
            btn4x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==5) {
            btn5x0.setEnabled(true);
            btn5x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==5){
            btn5x0.setEnabled(true);
            btn5x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==6) {
            btn6x0.setEnabled(true);
            btn6x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==6){
            btn6x0.setEnabled(true);
            btn6x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==7) {
            btn7x0.setEnabled(true);
            btn7x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==7){
            btn7x0.setEnabled(true);
            btn7x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==8) {
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==8){
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover==9) {
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }
        if(xmover<=9 && ydado==0 && xmover2==9){
            btn8x0.setEnabled(true);
            btn8x0.setImageResource(R.drawable.square_red);
        }

        //Si el movimiento te permite acceder a la posición 2x0 o 0x2 se activará lo siguiente

        if(ymover<=9 && xdado==0 && ymover==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover2==0){
            btn0x0.setEnabled(true);
            btn0x0.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover==1){
            btn0x1.setEnabled(true);
            btn0x1.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover2==1){
            btn0x1.setEnabled(true);
            btn0x1.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover==2){
            btn0x2.setEnabled(true);
            btn0x2.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover2==2){
            btn2x0.setEnabled(true);
            btn0x2.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover==3){
            btn0x3.setEnabled(true);
            btn0x3.setImageResource(R.drawable.square_red);
        }
        if(ymover<=9 && xdado==0 && ymover2==3){
            btn0x3.setEnabled(true);
            btn0x3.setImageResource(R.drawable.square_red);
        }
    }




}