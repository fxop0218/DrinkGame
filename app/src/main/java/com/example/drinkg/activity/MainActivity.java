package com.example.drinkg.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drinkg.R;

public class MainActivity extends AppCompatActivity {

    private Button bClassic, bVoR, bQEM, bSendSugestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bClassic = findViewById(R.id.bClassic);
        bVoR = findViewById(R.id.bVerdadReto);
        bQEM = findViewById(R.id.bQEM);
        bSendSugestions = findViewById(R.id.bSend);

        /**
         * Boton que inicia el modo clasico de juego
         */

        bClassic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), ClassicGameActivity.class);
                startActivity(i);
            }
        });

        /**
         *
         * Boton que inicia el modo de verdad o reto
         *
         */

        bVoR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), TruthChallengeActivity.class);
                startActivity(i);
            }
        });

        /**
         *
         * Boton que inicial el modo de juego Quien es mas
         *
         */

        bQEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), QuienEsMasActivity.class);
                startActivity(i);
            }
        });

        /**
         *
         * Boton que inicia la acividad que permite enviar sugerencias
         *
         */

        bSendSugestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SuggestionsActivity.class);
            }
        });
    }
}