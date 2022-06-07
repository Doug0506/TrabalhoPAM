package com.example.quizcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btnjogar, btnlocaliza;
    EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlocaliza = findViewById(R.id.btnlocaliza);
        btnjogar = findViewById(R.id.btnjogar);
        editTextNome = findViewById(R.id.editTextNome);

        ConstraintLayout constraintLayout = findViewById(R.id.activity_main);
        AnimationDrawable animacaodefundo = (AnimationDrawable) constraintLayout.getBackground();
        animacaodefundo.setEnterFadeDuration(2000);
        animacaodefundo.setExitFadeDuration(4000);
        animacaodefundo.start();

        btnlocaliza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUri = "http://maps.google.com";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));

                intent.setClassName("com.google.android.apps.maps",
                        "com.google.android.maps.MapsActivity");

                startActivity(intent);
            }
        });

        btnjogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Questao1.class);
                intent.putExtra("Chave",editTextNome.getText().toString());
                startActivity(intent);
            }
        });
    }
}