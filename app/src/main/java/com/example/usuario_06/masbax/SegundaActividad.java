package com.example.usuario_06.masbax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        Bundle bulto=getIntent().getExtras();
        String nombre;
        nombre=bulto.getString("Nombre");
        Log.e("Nombre Recibido",nombre);

    }
}
