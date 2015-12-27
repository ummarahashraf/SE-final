package uni.ass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class DbUtil {

	private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                ResourceBundle prop = ResourceBundle.getBundle("uni.ass.db");
                //Properties prop = new Properties();
                //InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("uni.ass.db.properties");
                //prop.load(inputStream);
                //String driver = prop.getProperty("driver");
                //String url = prop.getProperty("url");
                //String user = prop.getProperty("user");
                //String password = prop.getProperty("password");
                String driver = prop.getString("driver");
                String url = prop.getString("url");
                String user = prop.getString("user");
                String password = prop.getString("password");
                System.out.println(driver + url + user + password);
                Class.forName(driver);
                System.out.println("creating connection ...");
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("connection created successfully ...");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            /*} catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();*/
            }
            return connection;
        }
    }
    
    public static void main(String[] args ) {
        getConnection();
    }
}
