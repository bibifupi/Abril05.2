package com.softekk.presentacion;

import com.softtek.modelo.*;

public class PruebaInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("guido", "");
        Bateria bateria = new Bateria("bataca", 0);
        Flauta flauta = new Flauta("ham", "");

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = guitarra;
        instrumentos[1] = bateria;
        instrumentos[2] = flauta;
        for (int i = 0; i <= instrumentos.length - 1; i++) {
            System.out.println("Sonido: " + instrumentos[i].toString() + " " + instrumentos[i].emitirSonido());

        }
    }
}
