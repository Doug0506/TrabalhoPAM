package com.example.quizcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Creditos extends AppCompatActivity {

    ImageButton imgtwitch;
    TextView textCreditosNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        textCreditosNome = findViewById(R.id.textCreditosNome);
        imgtwitch = findViewById(R.id.imgtwitch);
        String nome = getIntent().getStringExtra("Chave");
        textCreditosNome.setText("Parabéns "+nome+" você conseguiu zerar o jogo");
        ConstraintLayout constraintLayout = findViewById(R.id.activity_creditos);
        AnimationDrawable animacaodefundo = (AnimationDrawable) constraintLayout.getBackground();
        animacaodefundo.setEnterFadeDuration(2000);
        animacaodefundo.setExitFadeDuration(4000);
        animacaodefundo.start();

        imgtwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/bb1nho"));
                startActivity(intent);

            }
        });


    }
}