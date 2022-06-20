package com.example.drinkg.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.drinkg.R;

import java.util.ArrayList;
import java.util.List;

public class QuienEsMasAnonimoActivity extends AppCompatActivity {
    Button bStart, bNext;
    ImageView ivPersona1, ivPersona2, ivPersona3, ivPersona4, ivPhone, ivChange;
    TextView tvQuestion, tvExpl1, tvExpl2;
    private int totalPlayers = 2;
    private String[] nombreJugadores;
    private int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quien_es_mas_anonimo);
        bStart = findViewById(R.id.bQEManonimoStart);
        bNext = findViewById(R.id.bQEManonimoNext);

        ivPersona1 = findViewById(R.id.ivAnonimoPersona1);
        ivPersona2 = findViewById(R.id.ivAnonimoPersona2);
        ivPersona3 = findViewById(R.id.ivAnonimoPersona3);
        ivPersona4 = findViewById(R.id.ivAnonimoPersona4);
        ivPhone = findViewById(R.id.ivAnonimoPhone);
        ivChange = findViewById(R.id.ivAnonimoChange);

        tvExpl1 = findViewById(R.id.tvQeMAnEx1);
        tvExpl2 = findViewById(R.id.tvQeMAnEx2);
        tvQuestion = findViewById(R.id.tvQeMAnonimoQuestion);

        showNumeroJugadores();
        //setNombreJugadores();

    }

    private void showNumeroJugadores() {
        AlertDialog.Builder builder = new AlertDialog.Builder(QuienEsMasAnonimoActivity.this);
        final EditText etJugadores = new EditText(getApplicationContext());
        etJugadores.setInputType(InputType.TYPE_CLASS_NUMBER);
        etJugadores.setFilters(new InputFilter[] {new InputFilter.LengthFilter(2)});
        builder.setTitle("Seleciona el numero de jugadores");
        builder.setView(etJugadores);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (Integer.parseInt(etJugadores.getText().toString()) <= 10 && Integer.parseInt(etJugadores.getText().toString()) >= 2) {
                        totalPlayers = Integer.parseInt(etJugadores.getText().toString());
                        nombreJugadores = new String[totalPlayers];
                        setNombreJugadores();
                    } else {
                        etJugadores.setError("Numero de jugadores entre 2 y 10");
                    }
                } catch (Exception e) {
                    etJugadores.setError("Pon un numero entre el 2 y el 10");
                }

            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Cancelado", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    private void setNombreJugadores() {
        for (x = 0; x < totalPlayers; x++) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(QuienEsMasAnonimoActivity.this);
            alertDialog.setTitle("Nombre de el jugador " + x);
            EditText etNombre = new EditText(QuienEsMasAnonimoActivity.this);
            alertDialog.setView(etNombre);
            alertDialog.setPositiveButton("Siguiente", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    nombreJugadores[x] = etNombre.getText().toString();
                }
            });
            alertDialog.show();
        }
    }
}