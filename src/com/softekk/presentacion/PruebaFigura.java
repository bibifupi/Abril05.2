package com.softekk.presentacion;

import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;

public class PruebaFigura {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(5);
        Cuadrado cMediano = new Cuadrado(7);
        Triangulo tPeque = new Triangulo();
        tPeque.setAltura(2);
        tPeque.setBase(4);
        Triangulo tMediano = new Triangulo(3, 5);

        Figura[] figuras = new Figura[4];
        figuras[0] = cPeque;
        figuras[1] = cMediano;
        figuras[2] = tPeque;
        figuras[3] = tMediano;
        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());

        }
    }
}
