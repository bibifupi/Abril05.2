package com.softtek.modelo;

public class Operador extends Empleado {
    //Atributos
    private int piezas;
    private double incentivo;
    //Métodos

    @Override
    public double calcularNomina() {
        return ((piezas * incentivo) + sueldo) * PORCENTAJE;
    }

    //Constructor

    public Operador(String nombre, double sueldo, double PORCENTAJE, int piezas, double incentivo) {
        super(nombre, sueldo, PORCENTAJE);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }
    public Operador() {
    }

    //Getters y Setters

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
