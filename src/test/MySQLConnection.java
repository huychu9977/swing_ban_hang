
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {

    private static Connection conn;
    private static final String server = "localhost";
    private static final String port = "3306";
    private static final String userName = "root";
    private static final String password = "123456";
    private static final String databaseName = "qlbh";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + server + ":" + port + "/" + databaseName;
        conn = DriverManager.getConnection(url, userName, password);
        return conn;
    }

    public static void close() throws SQLException {
        if (conn != null || !conn.isClosed()) {
            conn.close();
        }
    }
}
