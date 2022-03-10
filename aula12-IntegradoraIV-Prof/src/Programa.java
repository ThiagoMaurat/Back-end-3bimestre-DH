import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.sql.*;

public class Programa {

    private static final Logger LOGGER = Logger.getLogger(Programa.class);
    private static final String SQLCREATETABLE = "DROP TABLE IF EXISTS usuario; "
            + "CREATE TABLE usuario ("
            + "id INT PRIMARY KEY, "
            + "nome VARCHAR(32) NOT NULL, "
            + "sobrenome VARCHAR(64) NOT NULL, "
            + "idade INT NOT NULL)";

    private static final String SQLINSERT1 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (1, 'John', 'Lennom', 59)";

    private static final String SQLINSERT2 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (2, 'Ringo', 'Star', 62)";

    private static final String SQLINSERT3 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (3, 'George', 'Harrison', 59)";

    private static final String SQLINSERT4 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + "VALUES (4, 'Paul', 'McCartney', 55)";

    private static final String SQLDELETE = "DELETE FROM usuario WHERE id = 2";

    public static void main(String[] args) throws Exception {

    // Configuração padrão do Log4j
        BasicConfigurator.configure();

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Criando o BD ...");
            statement.execute(SQLCREATETABLE);
            LOGGER.info("Inserindo os dados ...");
            statement.execute(SQLINSERT1);
            statement.execute(SQLINSERT2);
            statement.execute(SQLINSERT3);
            statement.execute(SQLINSERT4);
            LOGGER.info("Visualizando os dados ...");
            showUsers(connection);
        }
        catch (Exception e) {
            LOGGER.error("Erro na execução do bloco Try: ", e);
        }
        finally {
            if (connection == null) {
                return;
            }
            connection.close();
        }

    } // Fechamento do método main

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:aula12", "sa", "");
    }

    public static void showUsers(Connection connection) throws Exception  {
        String sqlSelect = "SELECT * FROM usuario";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);

        while (rs.next()) {
            System.out.println(rs.getInt(1)
            + " | " + rs.getString(2)
            + " | " + rs.getString(3)
            + " | " + rs.getInt(4));
        }
    }

}