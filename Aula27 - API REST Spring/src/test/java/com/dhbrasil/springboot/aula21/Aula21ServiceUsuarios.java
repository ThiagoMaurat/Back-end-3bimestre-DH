package com.dhbrasil.springboot.aula21;

import com.dhbrasil.springboot.aula21.dao.impl.UsuarioDaoDatabase;
import com.dhbrasil.springboot.aula21.model.Usuario;
import com.dhbrasil.springboot.aula21.service.UsuarioService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

class Aula21ServiceUsuarios {

    private static UsuarioService usuarioService = new UsuarioService(new UsuarioDaoDatabase());

    //@Disabled
    @Test
    public void carregarTresUsuarios(){
        Usuario usuario1 = new Usuario("Carlos", "carlos@mail.com", "12345678", "primeiro");
        Usuario usuario2 = new Usuario("Joana", "joana@mail.com", "87654321", "segundo");
        Usuario usuario3 = new Usuario("Luís", "luis@mail.com", "13572468", "terceiro");

        usuarioService.salvar(usuario1);
        usuarioService.salvar(usuario2);
        usuarioService.salvar(usuario3);
    }

    @Disabled
    @Test
    public void excluirUsuarioId3(){
        usuarioService.excluir(3);
    }


    @Disabled
    @Test
    public void trazerTodosOsUsuarios(){
        List<Usuario> listaUsuarios = usuarioService.buscarTodos();
        System.out.println(listaUsuarios);
    }
}