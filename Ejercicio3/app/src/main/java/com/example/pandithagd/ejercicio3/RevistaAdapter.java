package com.example.pandithagd.ejercicio3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PandithaGD on 08/09/2016.
 */
public class RevistaAdapter extends ArrayAdapter<Revista> {

    public RevistaAdapter(Context context,
                          ArrayList<Revista>revistas){
        super (context,0,revistas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            Revista revista=getItem(position);

            if(convertView==null){
                convertView= LayoutInflater.from(getContext())
                        .inflate(R.layout.revista_layout, parent,false);
            }
            TextView txvRevista=(TextView)
                    convertView.findViewById(R.id.txv_revista);
            txvRevista.setText(revista.getNumero());

            return convertView;
        }
    }

