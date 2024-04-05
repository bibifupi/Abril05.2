package com.softtek.modelo;

public class Figura {
    //Atributos
    protected String x;
    protected String y;
    //Metodos
    public double calcularArea(){
        double area=0;
        return area;
    }
    public String mostrarPosicion(){
        String pos="";
        return pos;
    }
    //Constructor

    public Figura(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public Figura() {
    }
//Getters y Setters

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
