package com.example.javierocana_examen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Encuesta extends AppCompatActivity {

    EditText etPregunta1;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2,cb3;
    TextView tvNombre;
    String Pagocuota, nombre, usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
                etPregunta1=findViewById(R.id.etRespu);
                cb1=findViewById(R.id.cbBasquet);
                cb2=findViewById(R.id.cbFutbol);
                cb3=findViewById(R.id.cbGimnasia);
                tvNombre=findViewById(R.id.etNombre);
                rb1 = findViewById(R.id.rb1);
                rb2 = findViewById(R.id.rb2);
                nombre = getIntent().getStringExtra("nombreenviado");
                usuario = getIntent().getStringExtra("usuarioenviado");
                Pagocuota = getIntent().getStringExtra("Pagocuotaenviada");



            }

            public void enviarDatos(View v){

                Intent inttento = new Intent(Encuesta.this, Resumen.class);
                inttento.putExtra("dato",etPregunta1.getText().toString());
                String enviar1 = cb1.getText().toString();
                String enviar2 = cb2.getText().toString();
                String enviar3 = cb3.getText().toString();

                inttento.putExtra("dato2",enviar1+" ;"+enviar2+" ;"+enviar3);

                String radio1=rb1.getText().toString();
                String radio2=rb2.getText().toString();


                if(cb1.isChecked()==true){
                    inttento.putExtra("dato2",enviar1);
                }
                else{
                    inttento.putExtra("dato2",enviar2);
                }
                if(cb3.isChecked()==true){
                    inttento.putExtra("dato2",enviar3);
                }


                //Radio CONDICIONES
                if(rb1.isChecked()==true){
                    inttento.putExtra("dato3",radio1);
                }

                if(rb2.isChecked()==true){
                    inttento.putExtra("dato3",radio2);
                }






                startActivity(inttento);
            }


        }


