package com.softtek.modelo;

public class Gerente extends Empleado{
    //Atributos
    private double bono;
    //Métodos

    @Override
    public double calcularNomina() {
        return (bono+sueldo)*PORCENTAJE;
    }

    //Constructor

    public Gerente(String nombre, double sueldo, double PORCENTAJE, double bono) {
        super(nombre, sueldo, PORCENTAJE);
        this.bono = bono;
    }
    public Gerente() {
    }

    //Getters y Setters


    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}

