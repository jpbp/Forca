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
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);
        t = findViewById(R.id.textView);
        btnEsportes = findViewById(R.id.buttonEsportes);
        btnFilmes = findViewById(R.id.buttonFilmes);
        btnCiencias = findViewById(R.id.buttonCiencias);
        btnObjetos = findViewById(R.id.buttonObjetos);
        Bundle extras= getIntent().getExtras();
        if(extras != null){
            String aux = extras.getString("dificuldade");
            t.setText(aux);

        }
        btnEsportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tema = "esportes";
                Intent intent = new Intent(TemaActivity.this, JogoActivity.class);
                startActivity(intent);

            }
        });
        btnFilmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tema = "filmes";
                Intent intent = new Intent(TemaActivity.this, JogoActivity.class);
                startActivity(intent);
            }
        });
        btnCiencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tema = "ciencias";
                Intent intent = new Intent(TemaActivity.this, JogoActivity.class);
                startActivity(intent);
            }
        });
        btnObjetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v){
                tema = "objetos";
                Intent intent = new Intent(TemaActivity.this, JogoActivity.class);
                startActivity(intent);
            }
        });
    }



}
