package com.example.drinkg.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drinkg.R;

public class QuienEsMasAnonimoActivity extends AppCompatActivity {
    Button bStart, bNext;
    ImageView ivPersona1, ivPersona2, ivPersona3, ivPersona4, ivPhone, ivChange;
    TextView tvQuestion, tvExpl1, tvExpl2;

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

    }
}