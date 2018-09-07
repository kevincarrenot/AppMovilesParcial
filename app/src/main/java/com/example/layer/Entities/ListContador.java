package com.example.layer.Entities;

import java.util.ArrayList;

public class ListContador {
    private static ListContador lista;
    private ArrayList<Integer> listaContadores = null;
    public static ListContador getInstancia() {
        if(lista == null)
            lista = new ListContador();
        return lista;
    }

    ListContador() {
        listaContadores = new ArrayList<Integer>();
    }
    // retrieve array from anywhere
    public ArrayList<Integer> getList() {
        return this.listaContadores;
    }
    //Add element to array
    public void setLista(int cont) {
        listaContadores.add(cont);
    }




}

