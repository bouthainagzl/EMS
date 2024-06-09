package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    Connection connection;
    Statement statement;

    public Conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "m31s4600");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
