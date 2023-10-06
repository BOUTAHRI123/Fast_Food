package com.example.fastfood;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity4 extends Activity {
    EditText E1,E2,E3;
    TextView T1,T2,T3,T4;
    Button B1,B2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        String lesReservations = getIntent().getStringExtra("TOT");
        String food = getIntent().getStringExtra("F");
        String prix = getIntent().getStringExtra("To");
        String prix2 = getIntent().getStringExtra("prix");
        E1=findViewById(R.id.ADR);
        E2=findViewById(R.id.numcarte);
        E3=findViewById(R.id.nume);
        T1=findViewById(R.id.total);
        T1.setText("vous avez résevé "+food+" "+lesReservations+" avec une soomme ="+(prix+prix2)+" DH");
        T2=findViewById(R.id.addr);
        T3=findViewById(R.id.CRT);
        T4=findViewById(R.id.t);
        B1=findViewById(R.id.click);
        B2=findViewById(R.id.ret);
        T2.setVisibility(View.GONE);
        T3.setVisibility(View.GONE);
        T4.setVisibility(View.GONE);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = E1.getText().toString().trim();
                if (input1.isEmpty()) {
                    T2.setVisibility(View.VISIBLE);
                }
                else{
                    T2.setVisibility(View.GONE);
                }
                String input2 = E2.getText().toString().trim();
                if (input2.isEmpty()) {
                    T3.setVisibility(View.VISIBLE);
                }
                else{
                    T3.setVisibility(View.GONE);
                }
                String input3 = E3.getText().toString().trim();
                if (input3.isEmpty()) {
                    T4.setVisibility(View.VISIBLE);
                }
                else{
                    T4.setVisibility(View.GONE);
                }
                if (!(input1.isEmpty())&!(input2.isEmpty())&!(input3.isEmpty())){
                    Intent intent=new Intent(activity4.this, activity5.class);
                    intent.putExtra("adr", E1.getText().toString().trim());
                    intent.putExtra("CRT", E2.getText().toString().trim());
                    intent.putExtra("NUM", E3.getText().toString().trim());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Il faut saisir tous les champs!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity4.this.finish();
                String lesReservations="";
            }
        });
    }
}
