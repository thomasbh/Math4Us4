package com.example.brendaperez.divisiones;

import android.os.Bundle;

import com.example.brendaperez.math4us.R;

public class NivelDiviFacil extends NivelDivi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_nivel_divi1);
        setMinMax(2, 20);
        super.onCreate(savedInstanceState);
    }
}