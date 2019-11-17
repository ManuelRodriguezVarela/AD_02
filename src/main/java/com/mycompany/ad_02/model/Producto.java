package com.mycompany.ad_02.model;

import java.io.Serializable;

public class Producto implements Serializable {
    private long identificador;
    private String descripcion;
    private double prezo;
    private int cantidade;

    public Producto(long identificador, String descripcion, double prezo, int cantidade) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.prezo = prezo;
        this.cantidade = cantidade;
    }

    public Producto() {
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    @Override
    public String toString() {
        return "Producto: " + "identificador=" + identificador + 
                ", Descripción: " + descripcion + ", Prezo: " + prezo + 
                ", Cantidade: " + cantidade + '\n';
    }
    
    
}
