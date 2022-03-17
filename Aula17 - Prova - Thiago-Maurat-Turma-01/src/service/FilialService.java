package service;

import dao.IDao;
import model.Filial;

public class FilialService {
    private IDao<Filial> FilialIDao;

    public FilialService(IDao<Filial> FilialIDao) {
        this.FilialIDao = FilialIDao;
    }

    public Filial create(Filial filial) {
        return FilialIDao.create(filial);
    }
}
