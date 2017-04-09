package Gift.Content.JdbcXmlData;

import Gift.Content.Cookie;
import Gift.GiftContent;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

// Class for adding new data to the Gift from JDBC and XML

public abstract class JdbcXmlData extends GiftContent {

    public void add_jdbc_data() throws SQLException {}

    public void add_xml_data() throws ParserConfigurationException, IOException, SAXException {}

    public static ArrayList<Cookie> cookieListXml = new ArrayList<>();

    public static ArrayList<Cookie> cookieListJdbc = new ArrayList<>();

}
