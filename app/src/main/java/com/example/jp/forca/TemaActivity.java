package com.example.jp.forca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TemaActivity extends Activity {
    private Button btnEsportes;
    private Button btnFilmes;
    private Button btnCiencias;
    private Button btnObjetos;
    private String tema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        btnEsportes = findViewById(R.id.buttonEsportes);
        btnFilmes = findViewById(R.id.buttonFilmes);
        btnCiencias = findViewById(R.id.buttonCiencias);
        btnObjetos = findViewById(R.id.buttonObjetos);
        final Bundle extras= getIntent().getExtras();
        final Intent intent = new Intent(TemaActivity.this, JogoActivity.class);

        btnEsportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tema = "esportes";
                intent.putExtra("tema",tema);
                intent.putExtra("dificuldade",extras.getString("dificuldade"));
                startActivity(intent);

            }
        });
        btnFilmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tema = "filmes";
                intent.putExtra("tema",tema);
                intent.putExtra("dificuldade",extras.getString("dificuldade"));
                startActivity(intent);
            }
        });
        btnCiencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tema = "ciencias";
                intent.putExtra("tema",tema);
                intent.putExtra("dificuldade",extras.getString("dificuldade"));
                startActivity(intent);
            }
        });
        btnObjetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tema = "objetos";
                intent.putExtra("tema",tema);
                intent.putExtra("dificuldade",extras.getString("dificuldade"));
                startActivity(intent);
            }
        });
    }



}
