package com.softtek.modelo;

public class Empleado {
    //Atributos
    protected String nombre;
    protected double sueldo;
    protected double PORCENTAJE;
    //Métodos

    public double calcularNomina() {
        return sueldo*PORCENTAJE;
    }

    //Constructor

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo, double PORCENTAJE) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.PORCENTAJE = PORCENTAJE;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPORCENTAJE() {
        return PORCENTAJE;
    }

    public void setPORCENTAJE(double PORCENTAJE) {
        this.PORCENTAJE = PORCENTAJE;
    }
}
