package com.example.jp.forca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JogoActivity extends Activity {
    private HashMap<String,List<Questão>>temas;
//    private ArrayList<Questão> arrayCiencas;
//    private ArrayList<Questão> arrayEsporte;
//    private ArrayList<Questão> arrayObjeto;
//    private ArrayList<Questão> arrayFilme;
//    private ArrayList<Questão> arrayTeste;
    private TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);
        Bundle extras= getIntent().getExtras();
        String dificuldade = extras.getString("dificuldade");
        String tema = extras.getString("tema");
        temas=new HashMap<>();

//        arrayCiencas = new ArrayList<>();
//        arrayEsporte = new ArrayList<>();
//        arrayObjeto = new ArrayList<>();
//        arrayFilme = new ArrayList<>();
        t=findViewById(R.id.txt);
        Questão q1 = new Questão("atomo","particula","facil");
        Questão q2 = new Questão("h20","agua","medio");
        Questão q3 = new Questão("raposa","raw","dificil");
        temas.put("ciencias", Arrays.asList(q1, q2, q3));
//        arrayCiencas.add(q1);
//        arrayCiencas.add(q2);
//        arrayCiencas.add(q3);
//       arrayTeste = new ArrayList<>();
//        temas.put("ciencias",arrayCiencas);

        String palavra="";


        for(Questão q: temas.get(tema)){
            Toast.makeText(this, q == null ? "sim" : "nao", Toast.LENGTH_SHORT).show();
            if(q.getDificuldade().equals(dificuldade)){
                Toast.makeText(getApplicationContext(),"foi",Toast.LENGTH_LONG).show();
                palavra = q.getPalavra();

            }
        }
        t.setText(palavra);





    }

}
