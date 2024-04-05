package com.softtek.modelo;

import java.time.LocalDate;
import java.time.Period;

public class ProductoPerecedero extends Producto {
    //Atributos
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    //Métodos

    public double tiempoConsumicion() {
        Period between = Period.between(fFabricacion, fCaducidad);
        long dias = between.getDays();
        return (double) dias;
    }

    //Constructor

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    public ProductoPerecedero() {
    }
}
