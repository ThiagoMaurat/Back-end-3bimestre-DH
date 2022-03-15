package dao.service;

import java.sql.SQLException;

import dao.IDao;
import model.Medicamento;

public class MedicamentoService {
    
    private IDao<Medicamento> medicamentoIDao;

    public  MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento inserir(Medicamento medicamento) throws SQLException {
        return medicamentoIDao.inserir(medicamento);
    }
}
