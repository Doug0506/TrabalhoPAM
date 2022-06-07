package com.example.quizcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Questao2 extends AppCompatActivity {

    TextView textQ2Nome;
    ImageButton imageconfig;
    RadioButton rbAzul, rbVermelho, rbAmarelo, rbMagenta;
    Button btnconfirma2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);

        btnconfirma2 = findViewById(R.id.btnconfirma2);
        rbAzul = findViewById(R.id.rbAzul);
        rbVermelho = findViewById(R.id.rbVermelho);
        rbAmarelo = findViewById(R.id.rbAmarelo);
        rbMagenta = findViewById(R.id.rbMagenta);
        textQ2Nome = findViewById(R.id.textQ2Nome);
        imageconfig = findViewById(R.id.imageconfig);
        String nome = getIntent().getStringExtra("Chave");
        textQ2Nome.setText(nome);
        ConstraintLayout constraintLayout = findViewById(R.id.activity_questao2);
        AnimationDrawable animacaodefundo = (AnimationDrawable) constraintLayout.getBackground();
        animacaodefundo.setEnterFadeDuration(2000);
        animacaodefundo.setExitFadeDuration(4000);
        animacaodefundo.start();

        btnconfirma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbAzul.isChecked())
                {
                    Intent intent = new Intent(Questao2.this, Questao3.class);
                    intent.putExtra("Chave",textQ2Nome.getText().toString());
                    startActivity(intent);
                }
                else if (rbAmarelo.isChecked() || rbVermelho.isChecked() || rbMagenta.isChecked() )
                {
                    Intent intent = new Intent(Questao2.this, TelaErro.class);
                    startActivity(intent);
                }
            }
        });

        imageconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.ACTION_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast toast = Toast.makeText(Questao2.this , "Não existe nenhuma aplicação para executar a ação.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }



}