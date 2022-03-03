package com.example.aula05;

import com.example.aula05.service.ServicoDownloadProxy;
import com.example.aula05.Model.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServicoDownloadProxy servicoDownloadProxy = new ServicoDownloadProxy();
        Usuario usuario = new Usuario("123", "premium");
        servicoDownloadProxy.download(usuario.getID(), usuario.getTipoDeUsuario());
        
    }
}
