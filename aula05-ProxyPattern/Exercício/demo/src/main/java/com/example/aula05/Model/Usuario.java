package com.example.aula05.Model;

public class Usuario {
    protected String ID;
    protected String tipoDeUsuario;

    public Usuario(String ID, String tipoDeUsuario) {
        this.ID = ID;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
