package com.javier.glassesrecommender;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import sqlite.GlassesRecommenderOpenHelper;

public class VistaResultados extends AppCompatActivity implements View.OnClickListener {

    Button boton_volver_resultados;
    Button boton_menu_resultados;
    Button boton_about_resultados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_resultados);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        boton_volver_resultados = (Button) findViewById(R.id.boton_volver_resultados);
        boton_volver_resultados.setOnClickListener(VistaResultados.this);

        boton_about_resultados = (Button) findViewById(R.id.boton_about_resultados);
        boton_about_resultados.setOnClickListener(VistaResultados.this);

        boton_menu_resultados = (Button) findViewById(R.id.boton_menu_resultados);
        boton_about_resultados.setOnClickListener(VistaResultados.this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton_volver_resultados:
                VistaPrincipal vp = new VistaPrincipal();
                        break;
            case R.id.boton_menu_resultados:
                //funcion menu desplegable
                break;
            case R.id.boton_about_resultados:
                startActivity(new Intent(VistaResultados.this, VistaAbout.class));
                break;
        }
    }
}
