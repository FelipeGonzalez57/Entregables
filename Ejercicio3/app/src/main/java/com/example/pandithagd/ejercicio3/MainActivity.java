package com.example.pandithagd.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private EditText edtNumero;
        private Button btnClonar;
        private GridView grvRevista;

        private ArrayList<Revista> revistas;
        private Revista revista;
        private RevistaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = (EditText) findViewById(R.id.edt_numero);
        btnClonar = (Button) findViewById(R.id.btn_clonar);
        grvRevista = (GridView) findViewById(R.id.grv_revistas);

        revistas = new ArrayList<Revista>();
        revista = new Revista();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                revista.setNumero(
                        Integer.parseInt(
                                edtNumero.getText().toString()));


                Revista clon = (Revista) revista.clonar();
                revistas.add(clon);
                adapter = new RevistaAdapter(MainActivity.this,(ArrayList) revistas);
                grvRevista.setAdapter(adapter);
            }
        });


    }
}


