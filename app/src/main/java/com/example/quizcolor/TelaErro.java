package com.example.quizcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaErro extends AppCompatActivity {

    Button btntentar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_erro);

        btntentar = findViewById(R.id.btntentar);


        btntentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaErro.this, Questao1.class);
                startActivity(intent);
            }
        });
    }
}