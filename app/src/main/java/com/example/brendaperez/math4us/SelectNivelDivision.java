package com.example.brendaperez.math4us;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.brendaperez.divisiones.NivelDiviDificil;
import com.example.brendaperez.divisiones.NivelDiviFacil;
import com.example.brendaperez.divisiones.NivelDiviMedio;

public class SelectNivelDivision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectniveldivision);
    }

    public void goNivelDiviFacil(View view) {

        Intent objI = new Intent(SelectNivelDivision.this, NivelDiviFacil.class);
        startActivity(objI);
    }

    public void goNivelDiviMedio(View view) {

        Intent objI = new Intent(SelectNivelDivision.this, NivelDiviMedio.class);
        startActivity(objI);
    }

    public void goNivelDiviDificil(View v) {
        Intent objI = new Intent(SelectNivelDivision.this, NivelDiviDificil.class);
        startActivity(objI);
    }
}
