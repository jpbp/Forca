package com.example.jp.forca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class JogoActivity extends Activity {
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        texto=findViewById(R.id.idDif);

        Bundle extras= getIntent().getExtras();
       if(extras != null){
           String aux = extras.getString("dif");
           texto.setText(aux);

       }

    }

}
