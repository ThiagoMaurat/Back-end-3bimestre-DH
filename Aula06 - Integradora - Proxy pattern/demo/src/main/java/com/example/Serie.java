package com.example;

public class Serie implements ISerie {

    private String nome;

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getSerie(String nome) {
        return "www./" + nome;
    }
    
    
}
