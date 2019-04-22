package com.example.jp.forca;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TemaActivity extends Activity {
    private Button btnEsportes;
    private Button btnFilmes;
    private Button btnCiencias;
    private Button btnObjetos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);

        btnEsportes = findViewById(R.id.buttonEsportes);
        btnFilmes = findViewById(R.id.buttonFilmes);
        btnCiencias = findViewById(R.id.buttonCiencias);
        btnObjetos = findViewById(R.id.buttonObjetos);


        btnEsportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}
