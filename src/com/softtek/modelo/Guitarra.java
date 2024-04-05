package com.softtek.modelo;

public class Guitarra extends InstrumentoMusical {
    //Atributos
    private String tipoCuerdas;
    //Metodos

    @Override
    public String emitirSonido() {
        return "guitarra";
    }

    //Constructor

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public Guitarra() {

    }
//Getters y Setters

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "tipoCuerdas='" + tipoCuerdas + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
