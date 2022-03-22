package com.dhbrasil.springboot.Aula21;

import com.dhbrasil.springboot.Aula21.dao.impl.UsuarioDaoH2;
import com.dhbrasil.springboot.Aula21.model.Usuario;
import com.dhbrasil.springboot.Aula21.service.UsuarioService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Aula21ServicesUsuarios {
    private static UsuarioService usuarioService = new UsuarioService(
            new UsuarioDaoH2());
    @Test
    public void carregarTresDentistas(){
        Usuario d1 = new Usuario("Thiago", "thiagomaurat@hotmail.com", "123456", 1);
        Usuario d2 = new Usuario("Thiago", "thiagomaurat@hotmail.com", "123456", 1);
        Usuario d3 = new Usuario("Thiago", "thiagomaurat@hotmail.com", "123456", 1);
        usuarioService.salvar(d1);
        usuarioService.salvar(d2);
        usuarioService.salvar(d3);
    }

    @Test
    public void trazerTodosusuarios(){
        List<Usuario> usuarios = usuarioService.buscarTodos();
        System.out.println(usuarios);
    }

    @Test
    public void excluirdentista(){
        usuarioService.excluir(2);
    }
}
