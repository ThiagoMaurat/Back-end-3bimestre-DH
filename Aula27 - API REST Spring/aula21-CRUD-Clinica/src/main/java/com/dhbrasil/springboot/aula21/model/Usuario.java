package com.dhbrasil.springboot.aula21.model;

public class Usuario {
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private Integer NivelAcesso;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String email, String senha, Integer NivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.NivelAcesso = NivelAcesso;
    }

    public Usuario(String nome, String email, String senha, Integer NivelAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.NivelAcesso = NivelAcesso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(Integer nivelAcesso) {
        NivelAcesso = nivelAcesso;
    }
}
