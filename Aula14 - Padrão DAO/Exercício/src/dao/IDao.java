package dao;

import java.sql.SQLException;

import model.Medicamento;

public interface IDao<T> {
    public Medicamento inserir(T t) throws SQLException;
}
