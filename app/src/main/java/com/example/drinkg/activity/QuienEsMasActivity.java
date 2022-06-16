package com.example.drinkg.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.drinkg.R;

public class QuienEsMasActivity extends AppCompatActivity {
    Button bClassic, bAnonimo, bOnline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quien_es_mas);

        bClassic = findViewById(R.id.bQeMClassic);
        bAnonimo = findViewById(R.id.bQeMAnonimo);
        bOnline = findViewById(R.id.bQeMOnline);

        /**
         * Inicia la actividad Quien es mas clasico
         */
        bClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                final Spinner selectPlayer = new Spinner(getApplicationContext());
                //TODO crear una lista para selecionar el numero de jugadores que van a participar
                Intent i = new Intent(getApplicationContext(), QuienEsMasClassicActivity.class);
                startActivity(i);
            }
        });

        /**
         * Inicia la actividad Quien es mas Anonimo
         */
        bAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        /**
         * Salta un toast diciendo que proximamente se añadira esta funcionalidad
         */
        bOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Proximamente", Toast.LENGTH_SHORT).show();
            }
        });

    }
}