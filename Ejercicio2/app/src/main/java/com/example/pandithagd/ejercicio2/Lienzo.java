package com.example.pandithagd.ejercicio2;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by PandithaGD on 08/09/2016.
 */
public class Lienzo extends View{
    private Figura figura;

    public Lienzo(Context context,Figura figura){
        super(context);
        this.figura=figura;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(figura!=null) {
            super.onDraw(canvas);
        }
    }
    public Figura getFigura(){
        return  figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }
}
