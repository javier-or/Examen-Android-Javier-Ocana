package com.example.javierocana_examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {
    Bundle usuariologin;
    EditText etr1, etr2, etr3;
    TextView tvConexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
       etr1 = findViewById(R.id.etNombre);
        etr2 = findViewById(R.id.etMontoInicial);
        etr3 = findViewById(R.id.etPagoCuota);
        tvConexion=findViewById(R.id.etConexion);

        usuariologin = getIntent().getExtras();
        String usuarioConect = usuariologin.getString("usuarioenviado");
        tvConexion.setText("Conexion Exitosa: "+usuarioConect);

    }

    public void Calcular(View v) {

        double cuotainicial, cuotamensual;

        if(etr2.getText().toString().isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Ingrese el monto inicial", Toast.LENGTH_LONG).show();
        }else
            {
            cuotainicial = Double.parseDouble(etr2.getText().toString());
            cuotamensual = (1800-cuotainicial)/3 * 0.05 + (1800-cuotainicial)/3;
            etr3.setText(String.valueOf(cuotamensual));
        }

    }
    public void Guardar(View v){
        if(etr3.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "Calcular la cuota", Toast.LENGTH_LONG).show();
        }else
            {
            Intent intentEnviar = new Intent(Registro.this, Encuesta.class);
            intentEnviar.putExtra("nombreenviado", etr1.getText().toString());
            intentEnviar.putExtra("cuotaenviada", etr3.getText().toString());
            intentEnviar.putExtra("usuarioenviado", tvConexion.getText().toString());
       startActivity(intentEnviar);
        }
    }
}
