package com.example.layer.BAL;

import com.example.layer.Entities.ListContador;
import com.example.layer.Entities.ListTraumas;
public class Trauma {
    private int cont1;
    private int cont2;
    private int cont3;
    private int cont4;
    private String insonmio;
    private String apnea;
    private String reflujo;
    private String narcolepsia;

    public void ObtenerTrauma(){
        cont1 = ListContador.getInstancia().getList().get(0);
        cont2 = ListContador.getInstancia().getList().get(1);
        cont3 = ListContador.getInstancia().getList().get(2);
        cont4 = ListContador.getInstancia().getList().get(3);
        if (cont1 > 2){
            insonmio="El usuario posee Trauma de Insonmio, Intenta no dormir en el día, tambien intenta no tomar cafeina";
        }else{
            insonmio="El usuario no posee Trauma de Insonmio";
        }
        ListTraumas.getInstancia2().setLista(insonmio);
        if (cont2 > 2){
            apnea="El usuario posee Trauma de Apnea del sueño, Intenta acurdir a tu medico, estos problemas respiratorios se deben por el alto peso, no comas tanto ";
        }else{
            apnea="El usuario no posee Trauma de Apnea del sueño";
        }
        ListTraumas.getInstancia2().setLista(apnea);
        if (cont3 > 2){
            reflujo="El usuario posee Trauma de Reflujo, Intenta no comer muy antes de dormir y no uses prendas muy ajustadas";
        }else{
            reflujo="El usuario no posee Trauma de Reflujo";
        }
        ListTraumas.getInstancia2().setLista(reflujo);
        if (cont4 > 2){
            narcolepsia="El usuario posee Trauma de Narcolepsia, Intenta descansar bien y comer bien, duchate antes de dormir para estar relajado";
        }else{
            narcolepsia="El usuario no posee Trauma de Narcolepsia";
        }
        ListTraumas.getInstancia2().setLista(narcolepsia);
    }
}
