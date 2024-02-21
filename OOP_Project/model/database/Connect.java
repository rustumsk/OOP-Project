package OOP_Project.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Connect {
    
    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USER = "root";
    private static final String PASSWORD = "ArellanoJay123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
