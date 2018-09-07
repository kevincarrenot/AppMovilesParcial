package com.example.layer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.layer.Entities.ListContador;

public class Main5Reflujo extends AppCompatActivity {
    int contadorReflujo;
    private CheckBox ch17;
    private CheckBox ch18;
    private CheckBox ch19;
    private CheckBox ch20;
    private CheckBox ch21;
    private CheckBox ch22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_reflujo);
        instanciarObjetos();
    }
    public void instanciarObjetos() {
        ch17 = findViewById(R.id.checkBox17);
        ch18 = findViewById(R.id.checkBox18);
        ch19 = findViewById(R.id.checkBox19);
        ch20 = findViewById(R.id.checkBox20);
        ch21 = findViewById(R.id.checkBox21);
        ch22 = findViewById(R.id.checkBox22);
    }
    public void botonSiguiente4(View view){
            if (ch17.isChecked()==true){
                contadorReflujo++;
            }if(ch18.isChecked()==true){
                contadorReflujo++;
            }if(ch19.isChecked()==true){
                contadorReflujo++;
            }if(ch20.isChecked()==true){
                contadorReflujo++;
            }if(ch21.isChecked()==true){
                contadorReflujo++;
            }if(ch22.isChecked()==true){
                contadorReflujo++;
            }
            ListContador.getInstancia().setLista(contadorReflujo);
            startActivity(new Intent(this, Main6Narcolepsia.class));

        }
}
