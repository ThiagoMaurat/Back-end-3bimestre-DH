package com.dhbrasil.springboot.Aula21.service;

import com.dhbrasil.springboot.Aula21.dao.IDao;
import com.dhbrasil.springboot.Aula21.model.Dentista;
import com.dhbrasil.springboot.Aula21.model.Endereco;

import java.util.List;

public class EnderecoService {
    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco) {
        enderecoIDao.salvar(endereco);
        return endereco;
    }

    public List<Endereco> buscarTodos() {
        return enderecoIDao.buscarTodos();
    }
}
