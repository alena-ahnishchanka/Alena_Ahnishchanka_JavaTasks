package Gift.Content.JdbcXmlData;

import Gift.Content.Cookies.Chocolate.ChocolateCookie;
import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.*;

public class JdbcData extends JdbcXmlData {

    public void add_jdbc_data() throws SQLException {

// Database creation and connection (commented after 1st running)

//        DriverManager.registerDriver(new EmbeddedDriver());
        Connection connection = DriverManager.getConnection("jdbc:derby:my_db; create=true; user=me; password=mine");
//        Statement statement = connection.createStatement();
//        statement.executeUpdate("CREATE TABLE chocolate_cookie (ID int GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), NAME varchar (255) NOT NULL, WEIGHT varchar (255))");

// Database filling with values (commented after 1st running)

//        statement.addBatch("INSERT INTO chocolate_cookie (NAME, WEIGHT) VALUES ('Hello','100')");
//        statement.addBatch("INSERT INTO chocolate_cookie (NAME, WEIGHT) VALUES ('White-Black','50')");
//        statement.addBatch("INSERT INTO chocolate_cookie (NAME, WEIGHT) VALUES ('Alice','35')");
//        statement.addBatch("INSERT INTO chocolate_cookie (NAME, WEIGHT) VALUES ('Mirabella','100')");
//        statement.executeBatch();

        Statement statement = connection.createStatement();
        ResultSet cookie = statement.executeQuery("SELECT * FROM chocolate_cookie");

        while (cookie.next()) {
            String cookieNameValue = String.format("%s", cookie.getString(2));
            Double cookieWeightValue = new Double(cookie.getDouble(3));
            cookieListJdbc.add(new ChocolateCookie(cookieNameValue, cookieWeightValue));
        }

    }
}
