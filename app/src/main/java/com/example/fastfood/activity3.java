package com.example.fastfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class activity3 extends Activity {
    CheckBox C1,C2,C3,C4,C5,C6,C7;
    TextView T1,T2,T3,T4,T5,T6,T7;
    Button S,N;
    String Boisson;
    int prix=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        String Food = getIntent().getStringExtra("total");
        String Tot = getIntent().getStringExtra("T");
        C1=findViewById(R.id.C11);
        C2=findViewById(R.id.C12);
        C3=findViewById(R.id.C13);
        C4=findViewById(R.id.C14);
        C5=findViewById(R.id.C15);
        C6=findViewById(R.id.C16);
        C7=findViewById(R.id.C17);
        T1=findViewById(R.id.P1);
        T2=findViewById(R.id.P2);
        T3=findViewById(R.id.P3);
        T4=findViewById(R.id.P4);
        T5=findViewById(R.id.P5);
        T6=findViewById(R.id.P6);
        T7=findViewById(R.id.P7);
        S=findViewById(R.id.SUI);
        N=findViewById(R.id.retour);
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boisson="";
                if (C1.isChecked()) {
                    Boisson +=( C1.getText().toString()+",");
                    prix+=8;
                }
                if (C2.isChecked()) {
                    Boisson += (C2.getText().toString()+",");
                    prix+=7;
                }
                if (C3.isChecked()) {
                    Boisson +=( C3.getText().toString()+",");
                    prix+=6;
                }
                if (C4.isChecked()) {
                    Boisson += (C4.getText().toString()+",");
                    prix+=9;
                }
                if (C5.isChecked()) {
                    Boisson += (C5.getText().toString()+",");
                    prix+=12;
                }
                if (C6.isChecked()) {
                    Boisson += (C6.getText().toString()+",");
                    prix+=10;
                }
                if (C7.isChecked()) {
                    Boisson += (C7.getText().toString()+",");
                    prix+=8;
                }

                if (C1.isChecked()|C2.isChecked()|C3.isChecked()|C4.isChecked()|C5.isChecked()|C6.isChecked()|C7.isChecked()){
                    Intent T= new Intent(activity3.this, activity4.class);
                    T.putExtra("TOT",Boisson);
                    T.putExtra("prix",prix );
                    T.putExtra("F",Food);
                    T.putExtra("To",Tot);
                    startActivity(T);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Il faut selectionée un champs!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity3.this.finish();
            }
        });
    }
}
