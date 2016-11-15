package com.javier.glassesrecommender;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import sqlite.GlassesRecommenderOpenHelper;

public class VistaPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button boton_camara;
    private Button boton_menu;
    private Button boton_volver;
    private Button boton_about;
    private Camera mCamera = null;
    //private CameraView mCameraView = null;
    private GlassesRecommenderOpenHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mydb = new GlassesRecommenderOpenHelper(this, "");

        setContentView(R.layout.activity_vista_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        boton_camara = (Button) findViewById(R.id.boton_camara);
        boton_camara.setOnClickListener(VistaPrincipal.this);

        boton_menu = (Button) findViewById(R.id.boton_menu);
        boton_menu.setOnClickListener(VistaPrincipal.this);

        boton_volver = (Button) findViewById(R.id.boton_volver);
        boton_volver.setOnClickListener(VistaPrincipal.this);

        boton_about = (Button) findViewById(R.id.boton_about);
        boton_about.setOnClickListener(VistaPrincipal.this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vista_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        //comprobar que boton se ha pulsado
        switch (v.getId()){
            //en el caso del boton de la camara ir a VistaEspera
            case R.id.boton_camara:
                startActivity(new Intent(VistaPrincipal.this, vista_espera.class));
                break;
            //en el caso del boton volver, salir de la aplicacion
            case R.id.boton_volver:
                finish();
                System.exit(0);
                break;
            //en el caso del menu desplegar las opciones del menu
            case R.id.boton_menu:
                //ToDo: conseguir convertir boton en menu y meter boton_about en el
                break;
            //en el caso del boton about, abrir la VistaAbout
            case R.id.boton_about:
                startActivity(new Intent(VistaPrincipal.this, VistaAbout.class));
                break;
            //este caso para comprobar que todos los botones funcionen y no haya ningun problema entre ellos
            default:
                throw new RuntimeException("Id del boton sin identificar");
        }
    }
}
