package com.example.jp.forca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private TextView traços;
    private EditText letra;
    private Button btn;
    private int tamPalavra;
    private String palavra;
    private String auxTraço;
    private TextView paTela;


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
        traços=findViewById(R.id.txt);
        letra=findViewById(R.id.letras);
        paTela=findViewById(R.id.palavrinha);

        Questão q1 = new Questão("atomo","particula","facil");
        Questão q2 = new Questão("h20","agua","medio");
        Questão q3 = new Questão("raposa","raw","dificil");
        temas.put("ciencias", Arrays.asList(q1, q2, q3));
//        arrayCiencas.add(q1);
//        arrayCiencas.add(q2);
//        arrayCiencas.add(q3);
//       arrayTeste = new ArrayList<>();
//        temas.put("ciencias",arrayCiencas);

        for(Questão q: temas.get(tema)){
            if(q.getDificuldade().equals(dificuldade)){
                Toast.makeText(getApplicationContext(),"foi",Toast.LENGTH_LONG).show();
                palavra = q.getPalavra();

            }
        }
        int tamLinha=palavra.length();
        tamPalavra=tamLinha;
        auxTraço="";
        int i=0;
        for (i=0; i<tamLinha; i++){
            auxTraço+="_ ";
        }
        traços.setText(auxTraço);
//        final char[] palavraTela = new char [tamPalavra] ;
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String verifica=letra.getText().toString();
//                int i=0;
//                for(i=0; i<tamPalavra; i++){
//                    if(verifica.equals(palavra.charAt(i))){
//                        palavraTela[i] = verifica.charAt(1);
//                    }
//                }
//                paTela.setText(palavraTela,0,tamPalavra);
//            }
//        });




    }

}
