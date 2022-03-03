package com.example.aula05.service;

public class ServicoDownloadProxy implements DownloadInterface {

    public void download(String id, String tipoDeUsuario) {
        if (tipoDeUsuario.equals("free")) {
            System.out.println("O usuário " + id + " não pode realizar o download!");
        } else if (tipoDeUsuario.equals("premium")) {
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.download(id, tipoDeUsuario);
        }
    }
}
