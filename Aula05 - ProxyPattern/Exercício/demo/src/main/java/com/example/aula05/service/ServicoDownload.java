package com.example.aula05.service;

public class ServicoDownload implements DownloadInterface {

    public void download(String id, String tipoDeUsuario) {
        if (tipoDeUsuario.equals("free")) {
            System.out.println("O usuário " + id + " não pode realizar o download!");
        } else if (tipoDeUsuario.equals("premium")) {
            System.out.println("O usuário " + id + " pode realizar o download!");
        }
    }
}
    
