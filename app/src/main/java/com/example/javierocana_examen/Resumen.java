package com.example.javierocana_examen;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resumen extends AppCompatActivity {
    TextView etConexion, etnombre, etPagocuota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        etConexion = findViewById(R.id.etConexion1);
        etnombre = findViewById(R.id.etNombre);
        etPagocuota = findViewById(R.id.etPagoCuota);


        String usuario = getIntent().getStringExtra("usuarioenviado");
        String cuota = getIntent().getStringExtra("cuotaenviada");
        String nombre = getIntent().getStringExtra("nombreenviado");


        etConexion.setText(usuario);
        etnombre.setText(nombre);
        etPagocuota.setText(cuota);

    }
    }

