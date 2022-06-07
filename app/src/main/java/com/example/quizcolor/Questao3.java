package com.example.quizcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Questao3 extends AppCompatActivity {

    TextView textQ3nome;
    RadioButton rb1, rb2, rb3, rb4;
    Button btnfinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btnfinalizar = findViewById(R.id.btnfinalizar);
        textQ3nome = findViewById(R.id.textQ3nome);
        String nome = getIntent().getStringExtra("Chave");
        textQ3nome.setText(nome);
        ConstraintLayout constraintLayout = findViewById(R.id.activity_questao3);
        AnimationDrawable animacaodefundo = (AnimationDrawable) constraintLayout.getBackground();
        animacaodefundo.setEnterFadeDuration(2000);
        animacaodefundo.setExitFadeDuration(4000);
        animacaodefundo.start();

        btnfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked())
                {
                    Intent intent = new Intent(Questao3.this, Creditos.class);
                    intent.putExtra("Chave",textQ3nome.getText().toString());
                    startActivity(intent);
                }
                else if (rb2.isChecked() || rb3.isChecked() || rb4.isChecked() )
                {
                    Intent intent = new Intent(Questao3.this, TelaErro.class);
                    startActivity(intent);
                }
            }
        });
    }
}