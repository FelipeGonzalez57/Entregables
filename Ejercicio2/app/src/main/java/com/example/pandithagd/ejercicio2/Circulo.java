package com.example.pandithagd.ejercicio2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by PandithaGD on 08/09/2016.
 */
public class Circulo implements Figura {

    @Override
    public void dibujar(Canvas canvas) {
        Paint paint=new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);

        float mitadX= canvas.getWidth()/2;
        float mitadY=canvas.getHeight()/2;

        canvas.drawCircle(mitadX,mitadY,200,paint);
    }
}
