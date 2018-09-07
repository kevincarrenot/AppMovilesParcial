package com.example.layer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.layer.Entities.ListContador;

public class Main6Narcolepsia extends AppCompatActivity {
    int contadorNarcolepsia;
    private CheckBox ch23;
    private CheckBox ch24;
    private CheckBox ch25;
    private CheckBox ch26;
    private CheckBox ch27;
    private CheckBox ch28;
    private CheckBox ch29;
    private CheckBox ch30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_narcolepsia);
        instanciarObjetos();
    }
    public void instanciarObjetos() {
        //contador = findViewById(R.id.tvContador);
        ch23 = findViewById(R.id.checkBox23);
        ch24 = findViewById(R.id.checkBox24);
        ch25 = findViewById(R.id.checkBox25);
        ch26 = findViewById(R.id.checkBox26);
        ch27 = findViewById(R.id.checkBox27);
        ch28 = findViewById(R.id.checkBox28);
        ch29 = findViewById(R.id.checkBox29);
        ch30 = findViewById(R.id.checkBox30);
    }
    public void botonSiguiente5(View view) {
        if (ch23.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch24.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch25.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch26.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch27.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch28.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch29.isChecked()==true){
            contadorNarcolepsia++;
        }if(ch30.isChecked()==true){
            contadorNarcolepsia++;
        }
        ListContador.getInstancia().setLista((contadorNarcolepsia));
        startActivity(new Intent(this, Main7Resultados.class));


    }
}
