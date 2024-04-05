package com.softtek.modelo;

import java.util.PrimitiveIterator;

public class Vendedor extends Empleado {
    //Atributos
    private double ventas;
    private double comision;
    //Métodos

    @Override
    public double calcularNomina() {
        return ((ventas * comision) + sueldo) * PORCENTAJE;
    }

    //Constructor

    public Vendedor(String nombre, double sueldo, double PORCENTAJE, double ventas, double comision) {
        super(nombre, sueldo, PORCENTAJE);
        this.ventas = ventas;
        this.comision = comision;
    }

    public Vendedor() {
    }
    //Getters y Setters

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
