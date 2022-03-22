package com.dhbrasil.springboot.Aula21.service;

import com.dhbrasil.springboot.Aula21.dao.IDao;
import com.dhbrasil.springboot.Aula21.model.Dentista;

import java.util.List;

public class DentistaService {
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
}
