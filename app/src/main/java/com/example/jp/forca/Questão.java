package com.example.jp.forca;

public class Questão {
    private String palavra;
    private String dica;
    private String dificuldade;


    public Questão(String palavra,String dica,String dificuldade){
        this.dica=dica;
        this.dificuldade=dificuldade;
        this.palavra=palavra;
    }

    public String getDificuldade(){
        return this.dificuldade;
    }
    public String getPalavra(){
        return this.palavra;
    }
    public String getDica(){
        return this.dica;
    }


}
