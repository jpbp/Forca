package com.example.jp.forca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends Activity {
    private Button btnFacil;
    private Button btnMedio;
    private Button btnDificil;
    private String estado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnFacil=findViewById(R.id.buttonFacil);
        btnMedio=findViewById(R.id.buttonMedio);
        btnDificil=findViewById(R.id.buttonDificil);
        final Intent intent = new Intent(InicioActivity.this, TemaActivity.class);

        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estado="facil";

                intent.putExtra("dificuldade",estado);
                startActivity(intent);
            }
        });

        btnMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estado="medio";
                intent.putExtra("dificuldade",estado);
                startActivity(intent);
            }
        });
        btnDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estado="dificil";
                intent.putExtra("dificuldade",estado);
                startActivity(intent);

            }
        });



    }
}
