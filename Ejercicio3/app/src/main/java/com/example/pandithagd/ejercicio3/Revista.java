package com.example.pandithagd.ejercicio3;

/**
 * Created by PandithaGD on 08/09/2016.
 */
public class Revista implements Clonable {
    private int numero;

    public Revista(){}

    public Revista(int numero){
        this.numero=numero;
    }

    public Clonable clonar(){
        Revista clon=
                new Revista(numero);
        return clon;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

