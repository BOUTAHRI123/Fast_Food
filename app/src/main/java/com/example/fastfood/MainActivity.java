package com.example.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText N, Pre, Adr, Tel;
    Button Sbm;
    TextView  nn, pp, mm, tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        N = findViewById(R.id.nom);
        Pre = findViewById(R.id.prenom);
        Adr = findViewById(R.id.mail);
        Tel = findViewById(R.id.num);
        Sbm = findViewById(R.id.click);
        nn = findViewById(R.id.nnom);
        pp = findViewById(R.id.pprenom);
        mm = findViewById(R.id.mmail);
        tt = findViewById(R.id.ttelephone);
        nn.setVisibility(View.GONE);
        pp.setVisibility(View.GONE);
        tt.setVisibility(View.GONE);
        mm.setVisibility(View.GONE);

        Sbm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String T = Tel.getText().toString().trim();
                int I = T.length();
                String resultat = "";
                if (I == 10) {
                    resultat = "";
                }
                else {
                    resultat = "champs n'est pas validé";
                }
                tt.setText(resultat);
                tt.setVisibility(View.VISIBLE);
                String A = Adr.getText().toString().trim();
                String s="@gmail.com";
                String resultat2 = "";
                if(A.contains(s)){
                    resultat2="";
                }
                else{
                    resultat2="email incorrecte";
                }
                mm.setText(resultat2);
                mm.setVisibility(View.VISIBLE);


                String input1 = N.getText().toString().trim();
                if (input1.isEmpty()) {
                    nn.setVisibility(View.VISIBLE);
                }
                else{
                    nn.setVisibility(View.GONE);
                }
                String input2 = Pre.getText().toString().trim();
                if (input2.isEmpty()) {
                    pp.setVisibility(View.VISIBLE);
                }
                else{
                    pp.setVisibility(View.GONE);
                }
                String input3 = Adr.getText().toString().trim();
                if (input3.isEmpty()) {
                    mm.setVisibility(View.VISIBLE);
                }
                String input4 = Tel.getText().toString().trim();
                if (input4.isEmpty()) {
                    tt.setVisibility(View.VISIBLE);
                }

                if(!(input1.isEmpty())&!(input2.isEmpty())&!(input3.isEmpty())&!(input4.isEmpty())&(I == 10)){

                    Intent intent = new Intent(MainActivity.this,com.example.fastfood.activity2.class);
                    startActivity(intent);
                }
            }

        });
    }
}
