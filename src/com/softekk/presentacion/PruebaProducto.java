package com.softekk.presentacion;

import com.softtek.modelo.Producto;
import com.softtek.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("lápiz", 8, 2);
        ProductoPerecedero p2 = new ProductoPerecedero("manzana", 2, 1, LocalDate.of(2024, 4, 11), LocalDate.of(2024, 4, 5) );

        System.out.println(p1.cantidadAPagar());
        System.out.println((p2.tiempoConsumicion()));


    }
}
