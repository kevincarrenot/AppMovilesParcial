package com.example.layer.Entities;

import java.util.ArrayList;
import java.util.List;

public class ListTraumas {
    private static ListTraumas lista;
    private ArrayList<String> listaTraumas = null;
    public static ListTraumas getInstancia2() {
        if(lista == null)
            lista = new ListTraumas();
        return lista;
    }
    ListTraumas() {
        listaTraumas = new ArrayList<String>();
    }

    public ArrayList<String> getList() {
        return this.listaTraumas;
    }
    //Add element to array
    public void setLista(String cont) {
        listaTraumas.add(cont);
    }
}
