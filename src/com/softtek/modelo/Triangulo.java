package com.softtek.modelo;

public class Triangulo extends Figura{
    //Atributos
private double base;
private double altura;
    //Metodos
    @Override
public double calcularArea(){
    double area = (base * altura) / 2;
    return area;
}
    //Constructor

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//Getters y Setters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
