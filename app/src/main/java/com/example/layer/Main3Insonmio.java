package com.example.layer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.layer.Entities.ListContador;

public class Main3Insonmio extends AppCompatActivity {
    int contadorInsonmio;
    private CheckBox ch1;
    private CheckBox ch2;
    private CheckBox ch3;
    private CheckBox ch4;
    private CheckBox ch5;
    private CheckBox ch6;
    private CheckBox ch7;
    private CheckBox ch8;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_insonmio);
        instanciarObjetos();
    }
    public void instanciarObjetos(){
        ch1 = findViewById(R.id.checkBox1);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);
        ch5 = findViewById(R.id.checkBox5);
        ch6 = findViewById(R.id.checkBox6);
        ch7 = findViewById(R.id.checkBox7);
        ch8 = findViewById(R.id.checkBox8);
    }
    public void botonSiguiente2(View view) {
        if (ch1.isChecked()==true){
            contadorInsonmio++;
        }if(ch2.isChecked()==true){
            contadorInsonmio++;
        }if(ch3.isChecked()==true){
            contadorInsonmio++;
        }if(ch4.isChecked()==true){
            contadorInsonmio++;
        }if(ch5.isChecked()==true){
            contadorInsonmio++;
        }if(ch6.isChecked()==true){
            contadorInsonmio++;
        }if(ch7.isChecked()==true){
            contadorInsonmio++;
        }if(ch8.isChecked()==true){
            contadorInsonmio++;
        }
        ListContador.getInstancia().setLista(contadorInsonmio);
        startActivity(new Intent(this, Main4Apnea.class));
    }
}
