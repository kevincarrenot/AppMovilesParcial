package com.example.layer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.layer.Entities.ListContador;

public class Main4Apnea extends AppCompatActivity {
    int contadorApnea;
    private CheckBox ch9;
    private CheckBox ch10;
    private CheckBox ch11;
    private CheckBox ch12;
    private CheckBox ch13;
    private CheckBox ch14;
    private CheckBox ch15;
    private CheckBox ch16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_apnea);
        instanciarObjetos();
    }
    public void instanciarObjetos(){
        ch9 = findViewById(R.id.checkBox9);
        ch10 = findViewById(R.id.checkBox10);
        ch11= findViewById(R.id.checkBox11);
        ch12 = findViewById(R.id.checkBox12);
        ch13 = findViewById(R.id.checkBox13);
        ch14 = findViewById(R.id.checkBox14);
        ch15= findViewById(R.id.checkBox15);
        ch16 = findViewById(R.id.checkBox16);
    }
    public void botonSiguiente3(View view) {
        if (ch9.isChecked()==true){
            contadorApnea++;
        }if(ch10.isChecked()==true){
            contadorApnea++;
        }if(ch11.isChecked()==true){
            contadorApnea++;
        }if(ch12.isChecked()==true){
            contadorApnea++;
        }if(ch13.isChecked()==true){
            contadorApnea++;
        }if(ch14.isChecked()==true){
            contadorApnea++;
        }if(ch15.isChecked()==true){
            contadorApnea++;
        }if(ch16.isChecked()==true){
            contadorApnea++;
        }
        ListContador.getInstancia().setLista(contadorApnea);
        startActivity(new Intent(this, Main5Reflujo.class));
    }
}
