package com.dhbrasil.springboot.Aula21.service;

import com.dhbrasil.springboot.Aula21.dao.IDao;
import com.dhbrasil.springboot.Aula21.model.Dentista;

import java.util.List;
import java.util.Optional;

public class DentistaService implements IDao<Dentista> {
    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista salvar(Dentista dentista){
        dentistaIDao.salvar(dentista);
        return dentista;
    }

    public List<Dentista> buscarTodos(){
        return dentistaIDao.buscarTodos();
    }

    public void excluir(Integer id){
        dentistaIDao.excluir(id);
    }

    public Optional<Dentista> buscar(Integer id) {
        return dentistaIDao.buscar(id);
    }

    public Dentista atualizar(Dentista dentista) {
        return dentistaIDao.atualizar(dentista);
    }
}


