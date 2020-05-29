package com.example.javierocana_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etusuario, etcontrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusuario = findViewById(R.id.edUsuario);
        etcontrase = findViewById(R.id.edContraseña);
    }

    public void Ingresar(View v){
        if(etusuario.getText().toString().equals("estudiante2020") && etcontrase.getText().toString().equals("uisrael2020")){
            Intent intentEnviar = new Intent(MainActivity.this, Encuesta.class);
            intentEnviar.putExtra("usuarioenviado",etusuario.getText().toString());
            startActivity(intentEnviar);
        }else{
            Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrecta", Toast.LENGTH_LONG).show();
        }
    }
}


