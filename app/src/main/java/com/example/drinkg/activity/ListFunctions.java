package com.example.drinkg.activity;

import android.content.Context;

import com.example.drinkg.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListFunctions {
    public static ArrayList<String> getClassicGame(Context context){
        ArrayList<String> classicString = new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.classicGame)));
        Collections.shuffle(classicString);
        return classicString;
    }

    public static ArrayList<String> getQuienEsMasString(Context context) {
        ArrayList<String> QEMString = new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.QEMGame)));
        Collections.shuffle(QEMString);
        return QEMString;
    }

    public static ArrayList<String> getTruthString (Context context) {
        ArrayList<String> truthString = new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.verdadGame)));
        Collections.shuffle(truthString);
        return truthString;
    }

    public static ArrayList<String> getChallangeString (Context context) {
        ArrayList<String> challangeString = new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.retoGame)));
        Collections.shuffle(challangeString);
        return challangeString;
    }
}
