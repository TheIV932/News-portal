import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

package Project;

public class DButils {
//    private static String dbURL = "PostgreSQL";
//    private static String dbusername = " ";
//    private static String dbpassword = " ";
    public static Connection getConnection(){
        String dbURL = null;
        String dbusername = " ";
        String dbpassword = " ";
        FileInputStream fis ;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream("src/Project/Files/config.properties" );
            properties.load(fis);
            dbURL = properties.getProperty("db host");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Connection connection = null;
            try {
                connection = DriverManager.getConnection(dbURL, dbusername, dbpassword);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return connection;
        }
}
