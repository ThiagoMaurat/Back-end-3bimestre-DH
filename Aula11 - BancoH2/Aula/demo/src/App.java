
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS empregado; " +
            "CREATE TABLE empregado (" +
            "id int PRIMARY KEY, " +
            "nome varchar(64) not null," +
            "empresa varchar(64) not null, " +
            "idade int not null, " +
            "data_inicio varchar(32) not null);";

    private static final String SQL_INSERT1 = "INSERT INTO empregado " +
            "(id, nome, empresa, idade, data_inicio) " +
            "VALUES (1, 'João', 'Google', 25, '01/01/2020');";

    private static final String SQL_INSERT2 = "INSERT INTO empregado " +
            "(id, nome, empresa, idade, data_inicio) " +
            "VALUES (2, 'Carolina', 'Facebook', 39, '02/01/2020');";

    private static final String SQL_INSERT3 = "INSERT INTO empregado " +
            "(id, nome, empresa, idade, data_inicio) " +
            "VALUES (3, 'Diego', 'Digital House', 56, '01/01/2020');";

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            Statement stateInsert1 = connection.createStatement();
            stateInsert1.execute(SQL_INSERT1);
            Statement stateInsert2 = connection.createStatement();
            stateInsert2.execute(SQL_INSERT2);
            Statement stateInsert3 = connection.createStatement();
            stateInsert3.execute(SQL_INSERT3);
            String sql = "SELECT * FROM empregado";
            Statement selectEmpregado = connection.createStatement();
            ResultSet resultSet = selectEmpregado.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("nome") + " " + resultSet.getString("empresa") + " " + resultSet.getInt("idade") + " " + resultSet.getString("data_inicio"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:h2:mem:aula11", "sa", "");
    }
}
