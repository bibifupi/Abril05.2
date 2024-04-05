package com.softtek.modelo;

public class Flauta extends InstrumentoMusical {
    //Atributos
    private String material;
    //Metodos

    @Override
    public String emitirSonido() {
        return "fiufiu";
    }

    //Constructor

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public Flauta() {
    }
//Getters y Setters

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Flauta{" +
                "material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
