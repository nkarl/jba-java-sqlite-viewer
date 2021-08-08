package viewer.database;


import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class CoolJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:MyTest01.db";
        
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);

        try (Connection con = dataSource.getConnection()) {
            if (con.isValid(5)) {
                System.out.println("Connection is valid.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
