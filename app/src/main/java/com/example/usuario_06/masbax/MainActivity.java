package com.example.usuario_06.masbax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    CheckBox chkCasado;
    Button btnEnviar;
    RadioButton rbMasculino;
    RadioButton rbFemenino;
    Spinner spinIdiomas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkCasado=(CheckBox)findViewById(R.id.chkCasado);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        rbMasculino=(RadioButton)findViewById(R.id.rbMasculino);
        rbFemenino=(RadioButton)findViewById(R.id.rbFemenino);
        spinIdiomas=(Spinner)findViewById(R.id.spinIdiomas);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chkCasado.isChecked()){
                    Log.e("Cheeck baxxxxx: ",  "Eres casado");
                }else{
                    Log.i("cheeck baxxxxx: ","eres feliz");
                }
                if(rbMasculino.isChecked()){
                    Log.e("Genero ",  "Masculino");
                }else{
                    Log.e("Genero ", "Femenino");
                }
                Log.e("Idioma: ",spinIdiomas.getSelectedItem().toString());

            }
        });

    }
}
