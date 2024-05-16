import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try{
        String URL = "jdbc:mysql://127.0.0.1:3306";
        String user = "root";
        String password = "cheche0804!B";
        Connection conn = DriverManager.getConnection(URL,user,password);

    } catch (SQLException e) {
            e.printStackTrace();
        }
}
}