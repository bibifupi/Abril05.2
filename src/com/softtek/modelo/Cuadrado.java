package com.softtek.modelo;

public class Cuadrado extends Figura{
    //Atributos
private double lado;
    //Metodos

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    //Constructor

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public Cuadrado() {
    }

    //Getters y Setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
