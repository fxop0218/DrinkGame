package com.example.drinkg.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drinkg.R;

import java.util.ArrayList;

public class TruthChallengeActivity extends AppCompatActivity {
    Button bContinue, bTruth, bChallange, bChange, bNext;
    TextView tvInformation1, tvInformation2, tvTruth, tvChallange, tvQuestion, tvTitle;
    ImageView ivPersona, ivChange;
    ArrayList<String> truthArrayList;
    ArrayList<String> challangeArrayList;
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
        tvQuestion = findViewById(R.id.tvTruthChallangeQuestion);
        tvTitle = findViewById(R.id.tvTruthChallengeTitleAct);
        tvChallange = findViewById(R.id.tvReto);
        ivPersona = findViewById(R.id.ivPersonaTruth);
        ivChange = findViewById(R.id.ivChangeTruth);
        bTruth = findViewById(R.id.bTruthTruth);
        bChallange = findViewById(R.id.bTruthChallange);
        bChange = findViewById(R.id.bTruthChange);
        bNext = findViewById(R.id.bTruthContinue);

        truthArrayList = ListFunctions.getTruthString(getApplicationContext());
        challangeArrayList = ListFunctions.getChallangeString(getApplicationContext());

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
                tvQuestion.setVisibility(View.VISIBLE);
            }
        });

        bChallange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isTruth = false;
                setChangeButtons();
                setChallangeText();
            }
        });

        bTruth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isTruth = true;
                setChangeButtons();
                setTruthText();
            }
        });

        bChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bChange.setEnabled(false);
                if (!isUsed) {
                    if (isTruth) {
                        setChallangeText();
                    } else {
                        setTruthText();
                    }
                    isUsed = true;
                }
            }
        });

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChallangeTruth();
                tvTitle.setText(getResources().getString(R.string.verdad_o_reto_title));
                bChange.setEnabled(true);
                tvQuestion.setText(getResources().getString(R.string.truthChallangeInformation));
                isUsed = false;
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

    private void setChallangeText() {
        if (challangeArrayList.size() != 0) {
            tvTitle.setText(getResources().getString(R.string.reto));
            tvQuestion.setText(challangeArrayList.remove(0));
        } else {
            tvQuestion.setText(getResources().getString(R.string.no_more));
        }
    }

    private void setTruthText() {
        if (truthArrayList.size() != 0) {
            tvTitle.setText(getResources().getString(R.string.verdad));
            tvQuestion.setText(truthArrayList.remove(0));
        } else {
            tvQuestion.setText(getResources().getString(R.string.no_more));
        }
    }
}