package com.example.layer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.layer.Entities.ListTraumas;
import com.example.layer.BAL.Trauma;

public class Main7Resultados extends AppCompatActivity {
    Trauma trauma = new Trauma();
    private TextView tinsonmio;
    private TextView tapnea;
    private TextView treflujo;
    private TextView tnarcolepsia;
    private TextView tmensaje;
    private String insonmio;
    private String apnea;
    private String reflujo;
    private String narcolepsia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7_resultados);
        instanciarObjetos();
    }
    public void instanciarObjetos() {
        //contador = findViewById(R.id.tvContador);
        tinsonmio = findViewById(R.id.txtInsonmio);
        tapnea = findViewById(R.id.txtApnea);
        treflujo = findViewById(R.id.txtReflujo);
        tnarcolepsia= findViewById(R.id.txtNarco);
        tmensaje = findViewById(R.id.txtMensaje);
    }
    public void generarResultados(View view) {
        trauma.ObtenerTrauma();
        tmensaje.setVisibility(TextView.VISIBLE);
        insonmio=ListTraumas.getInstancia2().getList().get(0);
        tinsonmio.setText(insonmio);
        apnea=ListTraumas.getInstancia2().getList().get(1);
        tapnea.setText(apnea);
        reflujo=ListTraumas.getInstancia2().getList().get(2);
        treflujo.setText(reflujo);
        narcolepsia=ListTraumas.getInstancia2().getList().get(3);
        tnarcolepsia.setText(narcolepsia);
    }
    public void salir(View view) {
        finish();
        System.exit(0);
    }



}
