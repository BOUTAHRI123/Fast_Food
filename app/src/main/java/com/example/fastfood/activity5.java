package com.example.fastfood;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity5 extends Activity {
    TextView T1;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5);
        T1=findViewById(R.id.resume);
        String Adress = getIntent().getStringExtra("adr");
        T1.setText("merci pour votre confiance à notre snack,votre demende est bien enregistré.Vous serez la recevoir aprés 1H30min à "+Adress);
        T1.setVisibility(View.VISIBLE);
    }
}
