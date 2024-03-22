package gym.app.team13gymapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    public static void main(String[] args) {
        //JDBC URL for H2 in-memory database
        String jdbcURL = "jdbc:h2:~/test";
        String username = "sa";
        String password = "";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            System.out.println("Connected to the H2 database.");

            //Create a table
            try (Statement statement = connection.createStatement()) {
                statement.execute("CREATE TABLE IF NOT EXISTS users (email INT PRIMARY KEY, name VARCHAR(255))");
                System.out.println("Table created.");
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the H2 database.");
            e.printStackTrace();
        }
    }
}
