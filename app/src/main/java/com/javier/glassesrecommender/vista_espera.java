package com.javier.glassesrecommender;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

public class vista_espera extends AppCompatActivity {

    private ProgressBar spinner;
    private ProgressDialog pDialog;

   @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_vista_espera);
       spinner = (ProgressBar) findViewById(R.id.spinner);
       spinner.setVisibility(View.VISIBLE);
       pDialog = ProgressDialog.show(this, "Por favor, espere...", "Buscando...", true, false);
       Thread thread = new Thread(String.valueOf(this));
       thread.start();
   }



    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            pDialog.dismiss();
        }
    };

}
