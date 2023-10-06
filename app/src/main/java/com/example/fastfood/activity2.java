package com.example.fastfood;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class activity2 extends Activity {
    Button suiv;
    CheckBox A, B, C, D, E, f, g, h, i, j, k, l;
    String food="";
    int Total=0;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        A = findViewById(R.id.C1);
        B = findViewById(R.id.C2);
        C = findViewById(R.id.C3);
        D = findViewById(R.id.C4);
        E = findViewById(R.id.C5);
        f = findViewById(R.id.C6);
        g = findViewById(R.id.C7);
        h = findViewById(R.id.C8);
        i = findViewById(R.id.C9);
        j = findViewById(R.id.C10);
        k = findViewById(R.id.C11);
        l = findViewById(R.id.C12);
        suiv = findViewById(R.id.suiv);
        suiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                food="";
                if (A.isChecked()) {
                    food += (A.getText().toString()+",");
                    Total+=45;
                }
                if (B.isChecked()) {
                    food +=( B.getText().toString()+",");
                    Total+=40;
                }
                if (C.isChecked()) {
                    food += (C.getText().toString()+",");
                    Total+=30;
                }
                if (D.isChecked()) {
                    food +=(D.getText().toString()+",");
                    Total+=25;
                }
                if (E.isChecked()) {
                    food +=(E.getText().toString()+",");
                    Total+=35;
                }
                if (f.isChecked()) {
                     food+=(f.getText().toString()+",");
                    Total+=25;
                }
                if (g.isChecked()) {
                    food +=( g.getText().toString()+",");
                    Total+=60;
                }
                if (h.isChecked()) {
                    food +=( h.getText().toString()+",");
                    Total+=25;
                }
                if (i.isChecked()) {
                    food += (i.getText().toString()+",");
                    Total+=20;
                }
                if (j.isChecked()) {
                    food += (j.getText().toString()+",");
                    Total+=20;
                }
                if (k.isChecked()) {
                    food += (k.getText().toString()+",");
                    Total+=20;
                }
                if (l.isChecked()) {
                    food += (l.getText().toString()+",");
                    Total+=30;
                }
                if(A.isChecked()|B.isChecked()|C.isChecked()|D.isChecked()|E.isChecked()|f.isChecked()|g.isChecked()|h.isChecked()|i.isChecked()|j.isChecked()|k.isChecked()|l.isChecked()) {
                    Intent intent = new Intent(activity2.this, com.example.fastfood.activity3.class);
                    intent.putExtra("T", Total);
                    intent.putExtra("total", food);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Il faut selectionée un champs!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}




