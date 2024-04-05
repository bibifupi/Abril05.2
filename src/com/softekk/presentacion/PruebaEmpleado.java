package com.softekk.presentacion;

import com.softtek.modelo.Empleado;
import com.softtek.modelo.Gerente;
import com.softtek.modelo.Operador;
import com.softtek.modelo.Vendedor;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado trabajadore = new Empleado("Lola", 2000, 0.75);
        Gerente trabajadorg = new Gerente("Patricia", 2000, 0.75, 200);
        Vendedor trabajadorv = new Vendedor("Eva", 2000, 0.75, 80, 1.05);
        Operador trabajadoro = new Operador ("Carmen", 2000, 0.75, 50, 30);

        System.out.println("Empleado: "+trabajadore.calcularNomina());
        System.out.println("Gerente: "+trabajadorg.calcularNomina());
        System.out.println("Vendedor: "+trabajadorv.calcularNomina());
        System.out.println("Operador: "+trabajadoro.calcularNomina());
    }
}
