import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQLite {
    public static void main(String[] args) {

    }

    public void initConnection() throws SQLException {

        String url = "jdbc:sqlite:sqlite_database_2022.db";

        Connection connection=DriverManager.getConnection(url);

    }
}
