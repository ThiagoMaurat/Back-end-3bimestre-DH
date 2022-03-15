package dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ConfigJDBC;
import dao.IDao;
import model.Medicamento;

public class MedicamentoDao implements IDao<Medicamento> {

    private ConfigJDBC configJDBC;

    public MedicamentoDao(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    public String createTable = "CREATE TABLE IF NOT EXISTS medicamento" +
            " (id VARCHAR(50) PRIMARY KEY, nome VARCHAR(50), laboratorio VARCHAR(50), " +
            "quantidade INTEGER, preco DOUBLE)";

    public String insert = "INSERT INTO medicamento (id, nome, laboratorio," +
            " quantidade, preco) VALUES (?, ?, ?, ?, ?)";

    @Override
    public Medicamento inserir(Medicamento medicamento) throws SQLException {

        try {
            Connection connection = configJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(createTable);
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setInt(1, medicamento.getId());
            preparedStatement.setString(2, medicamento.getNome());
            preparedStatement.setString(3, medicamento.getLaboratorio());
            preparedStatement.setInt(4, medicamento.getQuantidade());
            preparedStatement.setDouble(5, medicamento.getPreco());
            preparedStatement.execute();
                        
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }

}
