package com.mx.tecmn.chihuahua2.lanzardado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageview_lado;
    TextView textview_resultado;
    Button button_lanzar;
    TextView textview_lado1;
    TextView textview_lado2;
    TextView textview_lado3;
    TextView textview_lado4;
    TextView textview_lado5;
    TextView textview_lado6;
    TextView textview_lado1Procentaje;
    TextView textview_lado2Procentaje;
    TextView textview_lado3Procentaje;
    TextView textview_lado4Procentaje;
    TextView textview_lado5Procentaje;
    TextView textview_lado6Procentaje;
    ProgressBar progressBar_lado1;
    ProgressBar progressBar_lado2;
    ProgressBar progressBar_lado3;
    ProgressBar progressBar_lado4;
    ProgressBar progressBar_lado5;
    ProgressBar progressBar_lado6;
    int lado1;
    int lado2;
    int lado3;
    int lado4;
    int lado5;
    int lado6;
    int totales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview_lado = findViewById(R.id.imageView_lado);
        textview_resultado = findViewById(R.id.textView_resultado);
        button_lanzar = findViewById(R.id.button_lanzar);
        textview_lado1 = findViewById(R.id.textView_lado1);
        textview_lado2 = findViewById(R.id.textView_lado2);
        textview_lado3 = findViewById(R.id.textView_lado3);
        textview_lado4 = findViewById(R.id.textView_lado4);
        textview_lado5 = findViewById(R.id.textView_lado5);
        textview_lado6 = findViewById(R.id.textView_lado6);
        textview_lado1Procentaje = findViewById(R.id.textView_lado1Porcentaje);
        textview_lado2Procentaje = findViewById(R.id.textView_lado2Porcentaje);
        textview_lado3Procentaje = findViewById(R.id.textView_lado3Procentaje);
        textview_lado4Procentaje = findViewById(R.id.textView_lado4Porcentaje);
        textview_lado5Procentaje = findViewById(R.id.textView_lado5Porcentaje);
        textview_lado6Procentaje = findViewById(R.id.textView_lado6Porcentaje);

        progressBar_lado1 = findViewById(R.id.progressBar_lado1);
        progressBar_lado2 = findViewById(R.id.progressBar_lado2);
        progressBar_lado3 = findViewById(R.id.progressBar_lado3);
        progressBar_lado4 = findViewById(R.id.progressBar_lado4);
        progressBar_lado5 = findViewById(R.id.progressBar_lado5);
        progressBar_lado6 = findViewById(R.id.progressBar_lado6);

        totales=0;
        agregarEscucharBoton();
    }
    public void agregarEscucharBoton(){
        button_lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random aleatoria = new Random();
                int numero = aleatoria.nextInt(6)+1;

                String update_str;
                update_str = getResources().getString(R.string.textView_resultado);
                textview_resultado.setText(update_str + numero);

                totales++;
                switch (numero){
                    case 1 :
                        imageview_lado.setImageResource(R.drawable.dado1);
                        lado1++;
                        break;
                    case 2 :
                        imageview_lado.setImageResource(R.drawable.dado2);
                        lado2++;
                        break;
                    case 3 :
                        imageview_lado.setImageResource(R.drawable.dado3);
                        lado3++;
                        break;
                    case 4 :
                        imageview_lado.setImageResource(R.drawable.dado4);
                        lado4++;
                        break;
                    case 5 :
                        imageview_lado.setImageResource(R.drawable.dado5);
                        lado5++;
                        break;
                    case 6 :
                        imageview_lado.setImageResource(R.drawable.dado6);
                        lado6++;
                        break;
                }

            }
        });
    }
    public void mostrarEstadisticas(){
        String str_lado1;
        str_lado1 = getResources().getString(R.string.textView_lado1);
        textview_lado1.setText(str_lado1 + lado1);
        String str_lado2;
        str_lado2 = getResources().getString(R.string.textView_lado2);
        textview_lado2.setText(str_lado1 + lado2);
        String str_lado3;
        str_lado3 = getResources().getString(R.string.textView_lado3);
        textview_lado3.setText(str_lado1 + lado3);
        String str_lado4;
        str_lado4 = getResources().getString(R.string.textView_lado4);
        textview_lado4.setText(str_lado1 + lado4);
        String str_lado5;
        str_lado5 = getResources().getString(R.string.textView_lado5);
        textview_lado5.setText(str_lado1 + lado5);
        String str_lado6;
        str_lado6 = getResources().getString(R.string.textView_lado6);
        textview_lado6.setText(str_lado1 + lado6);


        String str_lado1_porcentaje;
        str_lado1_porcentaje  = "%";
        int lado1_polrcentaje = (lado1+100)/totales;
        textview_lado1Procentaje.setText(lado1_polrcentaje + str_lado1_porcentaje);
        progressBar_lado1.setProgress(lado1_polrcentaje);
    }

}