package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {
    private String JDBCdriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfigJDBC() {
        this.JDBCdriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:aula14;DB_CLOSE_DELAY=-1;";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public ConfigJDBC(String JDBCdriver, String dbUrl, String nomeUsuario, String senha) {
        this.JDBCdriver = JDBCdriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
