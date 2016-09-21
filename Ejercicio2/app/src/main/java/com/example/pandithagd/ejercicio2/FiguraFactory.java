package com.example.pandithagd.ejercicio2;

/**
 * Created by PandithaGD on 08/09/2016.
 */
public class FiguraFactory {
    private Figura figura;

    public Figura crearFigura(String tipo){
        if(tipo==null){
            if(tipo.equalsIgnoreCase("circulo")){
                figura=new Circulo();
            }else if(tipo.equalsIgnoreCase("rectangulo")){
                figura=new Rectangulo();
            }else{
                return null;
            }
        }
        return figura;
    }
}
