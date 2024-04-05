package com.softtek.modelo;

public class InstrumentoMusical {
    //Atributos
    protected String marca;
    //Metodos
public String emitirSonido(){
    String ruido="";
    return ruido;
}
    //Constructor

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public InstrumentoMusical() {
    }
//Getters y Setters


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
