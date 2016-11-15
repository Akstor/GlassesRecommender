package com.javier.glassesrecommender;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VistaAbout extends AppCompatActivity {

    private ProgressDialog pdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_about);

        pdialog = ProgressDialog.show(this, "Javier Sancho Tarrago", "Glasses Recommender AR", true, false);
        Thread thread = new Thread(String.valueOf(this));
        thread.start();
    }
}
