package com.dhbrasil.springboot.Aula21;

import com.dhbrasil.springboot.Aula21.dao.impl.DentistaDaoH2;
import com.dhbrasil.springboot.Aula21.dao.impl.EnderecoDaoH2;
import com.dhbrasil.springboot.Aula21.model.Dentista;
import com.dhbrasil.springboot.Aula21.model.Endereco;
import com.dhbrasil.springboot.Aula21.service.DentistaService;
import com.dhbrasil.springboot.Aula21.service.EnderecoService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Aula21ServicesEnderecos {
    private static EnderecoService enderecoService = new EnderecoService(
            new EnderecoDaoH2());
    @Test
    public void carregarTresDentistas(){
        Endereco d1 = new Endereco("Rua 1", "Bairro 1", "Cidade 1", "Estado 1", "ad");
        Endereco d2 = new Endereco("Rua 2", "Bairro 2", "Cidade 2", "Estado 2", "aa");
        Endereco d3 = new Endereco("Rua 3", "Bairro 3", "Cidade 3", "Estado 3", "ss");
        enderecoService.salvar(d1);
        enderecoService.salvar(d2);
        enderecoService.salvar(d3);
    }

    @Test
    public void trazerTodosDentistas(){
        List<Endereco> enderecos = enderecoService.buscarTodos();
        System.out.println(enderecos);
    }
}
