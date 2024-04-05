package com.softtek.modelo;

public class Bateria extends InstrumentoMusical {
    //Atributos
    private int noPlatillos;
    //Metodos

    @Override
    public String emitirSonido() {
        return "badumtchss";
    }

    //Constructor

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    public Bateria() {

    }
    //Getters y Setters

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatillos=" + noPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }
}
