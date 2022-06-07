package com.example.quizcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Questao1 extends AppCompatActivity {

     TextView textNome;
     CheckBox checkBoxpreta, checkBoxazul, checkBoxbranco, checkBoxvermelha;
     Button btnconfirma;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        checkBoxpreta = findViewById(R.id.checkpreta);
        checkBoxazul = findViewById(R.id.checkazul);
        checkBoxbranco = findViewById(R.id.checkbranco);
        checkBoxvermelha = findViewById(R.id.checkvermelho);
        btnconfirma = findViewById(R.id.btnconfirma1);
        textNome = findViewById(R.id.textNome);

        String nome = getIntent().getStringExtra("Chave");
        textNome.setText(nome);
        ConstraintLayout constraintLayout = findViewById(R.id.activity_questao1);
        AnimationDrawable animacaodefundo = (AnimationDrawable) constraintLayout.getBackground();
        animacaodefundo.setEnterFadeDuration(2000);
        animacaodefundo.setExitFadeDuration(4000);
        animacaodefundo.start();

         btnconfirma.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(checkBoxpreta.isChecked() && checkBoxbranco.isChecked()==false && checkBoxazul.isChecked()==false && checkBoxvermelha.isChecked()==false)
                 {
                     Intent intent= new Intent(Questao1.this,Questao2.class);
                     intent.putExtra("Chave",textNome.getText().toString());
                     startActivity(intent);
                 }
                 else
                 {
                     Intent intent = new Intent(Questao1.this,TelaErro.class);
                     startActivity(intent);
                 }
             }
         });

     }
}