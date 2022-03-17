package dao.impl;

import dao.IDao;
import dao.config.ConfigJDBC;
import model.Filial;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class FilialDaoH2 implements IDao<Filial> {
    private ConfigJDBC config;

    public FilialDaoH2(ConfigJDBC config) {
        this.config = config;
    }

    @Override
    public Filial create(Filial filial) {
        Connection connection = config.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO filial (nome_da_filial, rua, numero," +
                        "cidade, estado, e5estrelas) VALUES ('%s', '%s', " +
                        "'%s', '%s', '%s', '%b')",
                filial.getNome_da_filial(),
                filial.getRua(),
                filial.getNumero(),
                filial.getCidade(),
                filial.getEstado(),
                filial.getE5estrelas());

       try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                filial.setId(keys.getInt(1));
            }
           statement.close();
           connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filial;
    }
}
