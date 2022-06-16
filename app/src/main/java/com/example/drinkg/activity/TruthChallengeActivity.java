package com.example.drinkg.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drinkg.R;

public class TruthChallengeActivity extends AppCompatActivity {
    Button bContinue, bTruth, bChallange, bChange, bNext;
    TextView tvInformation1, tvInformation2, tvTruth, tvChallange;
    ImageView ivPersona, ivChange;
    private boolean isUsed = false;
    private boolean isTruth = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truth_challenge);
        bContinue = findViewById(R.id.bContinuarTruth);
        tvInformation1 = findViewById(R.id.tvInfoTruth);
        tvInformation2 = findViewById(R.id.tvInfoTruth2);
        tvTruth = findViewById(R.id.tvVerdad);
        tvChallange = findViewById(R.id.tvReto);
        ivPersona = findViewById(R.id.ivPersonaTruth);
        ivChange = findViewById(R.id.ivChangeTruth);
        bTruth = findViewById(R.id.bTruthTruth);
        bChallange = findViewById(R.id.bTruthChallange);
        bChange = findViewById(R.id.bTruthChange);
        bNext = findViewById(R.id.bTruthContinue);

        /**
         * Pone los objetos en gone para que no se vean
         * TODO Intentar poner un alguna animacion cuando lo quitamos
         */
        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bContinue.setVisibility(View.GONE);
                tvInformation1.setVisibility(View.GONE);
                tvInformation2.setVisibility(View.GONE);
                tvTruth.setVisibility(View.GONE);
                tvChallange.setVisibility(View.GONE);
                ivPersona.setVisibility(View.GONE);
                ivChange.setVisibility(View.GONE);
                bTruth.setVisibility(View.VISIBLE);
                bChallange.setVisibility(View.VISIBLE);
            }
        });

        bChallange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isTruth = false;
                setChangeButtons();
                //TODO hacer que te muestre una reto
                //TODO si es la primera ves que te muestre la otra opción
            }
        });

        bTruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isTruth = true;
                setChangeButtons();
                //TODO hacer que te muestre una pregunta para responder
                //TODO si es la primera ves que te muestre la otra opción
            }
        });

        bChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bChange.setVisibility(View.INVISIBLE);
                if (!isUsed) {
                    if (isTruth) {
                        //TODO poner texto de challange
                    } else {
                        //TODO poner texto de verdad
                    }
                    isUsed = true;
                }
            }
        });

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChallangeTruth();
                isUsed = false;
                //TODO volver a poner los dos botones correspondientes y eliminar las preguntas anteriores de la cola.
            }
        });
    }

    private void setChallangeTruth(){
        bNext.setVisibility(View.INVISIBLE);
        bChange.setVisibility(View.INVISIBLE);
        bChallange.setVisibility(View.VISIBLE);
        bTruth.setVisibility(View.VISIBLE);
    }

    private void setChangeButtons() {
        bNext.setVisibility(View.VISIBLE);
        bChange.setVisibility(View.VISIBLE);
        bChallange.setVisibility(View.INVISIBLE);
        bTruth.setVisibility(View.INVISIBLE);
    }
}