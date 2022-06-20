package com.example.drinkg.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drinkg.R;

import java.util.ArrayList;

public class QuienEsMasClassicActivity extends AppCompatActivity {
    TextView tvExplicacion1, tvExplicacion2, tvQuestion;
    Button bContinuar, bEmpezar;
    ImageView ivQEMClassPersona, ivPersona1, ivPersona2, ivPersona3, ivPersona4;
    ArrayList<String> quienEsMasArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quien_es_mas_classic);
        bContinuar = findViewById(R.id.bQEMCcontinue);
        bEmpezar = findViewById(R.id.bQEMComenzar);

        tvExplicacion1 = findViewById(R.id.tvQEMclassExplicacion1);
        tvExplicacion2 = findViewById(R.id.tvQEMclassExplicacion2);
        tvQuestion = findViewById(R.id.tvQMCquesstion);

        ivQEMClassPersona = findViewById(R.id.ivQEMClassPersona);
        ivPersona1 = findViewById(R.id.ivQEMClassPersona1);
        ivPersona2 = findViewById(R.id.ivQEMClassPersona2);
        ivPersona3= findViewById(R.id.ivQEMClassPersona3);
        ivPersona4 = findViewById(R.id.ivQEMClassPersona4);
        quienEsMasArrayList = ListFunctions.getQuienEsMasString(getApplicationContext());

        /**
         * Siguiente Quien es mas, cambiando la pregunta y sacando de la lista la preguta ya realizada
         */

        bContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quienEsMasArrayList.size() != 0) {
                    tvQuestion.setText(quienEsMasArrayList.remove(0));
                } else {
                    tvQuestion.setText(getResources().getString(R.string.no_more));
                }
            }
        });

        /**
         * Empieza el juego poniendo en invisible los imageView y textView inecesarios
         */

        bEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivQEMClassPersona.setVisibility(View.GONE);
                ivPersona1.setVisibility(View.GONE);
                ivPersona2.setVisibility(View.GONE);
                ivPersona3.setVisibility(View.GONE);
                ivPersona4.setVisibility(View.GONE);
                tvExplicacion1.setVisibility(View.GONE);
                tvExplicacion2.setVisibility(View.GONE);
                bEmpezar.setVisibility(View.GONE);

                tvQuestion.setVisibility(View.VISIBLE);
                bContinuar.setVisibility(View.VISIBLE);

                tvQuestion.setText(quienEsMasArrayList.remove(0));
            }
        });
    }
}