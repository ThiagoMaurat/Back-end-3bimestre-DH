
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS TabelaFiguras; " +
            "CREATE TABLE TabelaFiguras (" +
            "id int PRIMARY KEY, " +
            "figura varchar(64) not null," +
            "cor varchar(64) not null);";

    private static final String SQL_INSERT1 = "INSERT INTO TabelaFiguras " +
            "(id, figura, cor) " +
            "VALUES (1, 'Círculo', 'vermelho');";

    private static final String SQL_INSERT2 = "INSERT INTO TabelaFiguras " +
            "(id, figura, cor) " +
            "VALUES (2, 'Círculo', 'Azul');";

    private static final String SQL_INSERT3 = "INSERT INTO TabelaFiguras " +
            "(id, figura, cor) " +
            "VALUES (3, 'Quadrado', 'Azul');";

    private static final String SQL_INSERT4 = "INSERT INTO TabelaFiguras " +
            "(id, figura, cor) " +
            "VALUES (4, 'Quadrado', 'Rosa');";

    private static final String SQL_INSERT5 = "INSERT INTO TabelaFiguras " +
            "(id, figura, cor) " +
            "VALUES (5, 'Quadrado', 'Azul');";

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);
            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);
            statement.execute(SQL_INSERT4);
            statement.execute(SQL_INSERT5);
            String sql = "SELECT * FROM TabelaFiguras";
            Statement selectTabela = connection.createStatement();
            ResultSet resultSet = selectTabela.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("figura") + " "
                        + resultSet.getString("cor"));
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
