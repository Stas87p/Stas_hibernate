import java.sql.*;

public class DBWorker {
    private final String HOST = "jdbc:postgresql://localhost:5432/test";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "Serialbas1";

    private Connection connection;

    public DBWorker()  {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
