package com.example.drinkg;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassicGameActivity extends AppCompatActivity {
    private TextView tvExp1, tvExp2, tvQuestion;
    private Button bContinue, bNext, bExit;
    private ImageView ivPersona1, ivPersona2, ivGlass1, ivGlass2, ivCorrect, ivNegative;
    //TODO poner una array o una lista con todas las pregutas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_game);

        tvExp1 = findViewById(R.id.tvClassic1);
        tvExp2 = findViewById(R.id.tvClassic2);
        tvQuestion = findViewById(R.id.tvQuestion);

        bContinue = findViewById(R.id.bContinueClassic);
        bExit = findViewById(R.id.bExitClassic);
        bNext = findViewById(R.id.bNextClassic);

        ivPersona1 = findViewById(R.id.ivPerosna);
        ivPersona2 = findViewById(R.id.ivPersonaN);
        ivGlass1 = findViewById(R.id.ivDrink);
        ivGlass2 = findViewById(R.id.ivDrink2);
        ivCorrect = findViewById(R.id.ivPositive);
        ivNegative = findViewById(R.id.ivNegative);

        bContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objetos que se dejan de ver en el layout despues de darle al boton
                tvExp1.setVisibility(View.GONE);
                tvExp2.setVisibility(View.GONE);
                bContinue.setVisibility(View.GONE);
                ivPersona1.setVisibility(View.GONE);
                ivGlass1.setVisibility(View.GONE);
                ivGlass2.setVisibility(View.GONE);
                ivCorrect.setVisibility(View.GONE);
                ivNegative.setVisibility(View.GONE);
                //Objetos que se ven en el layout despues de darle al boton
                tvQuestion.setVisibility(View.VISIBLE);
                bNext.setVisibility(View.VISIBLE);
                bExit.setVisibility(View.VISIBLE);
            }
        });

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}