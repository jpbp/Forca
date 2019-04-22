package com.example.jp.forca;

import java.util.ArrayList;

public class Temas {
    private ArrayList<String> palavras;
    private ArrayList<String> dicas;

    public Temas(){
        palavras = new ArrayList<>();
        dicas = new ArrayList<>();
    }

    public void adiconar(String palavra,String dica){
        palavras.add(palavra);
        dicas.add(dica);
    }
}
