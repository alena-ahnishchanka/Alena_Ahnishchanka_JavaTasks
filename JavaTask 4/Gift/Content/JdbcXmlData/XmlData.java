package Gift.Content.JdbcXmlData;

import Gift.Content.Cookies.Chocolate.ChocolateCookie;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlData extends JdbcXmlData {

    public void add_xml_data() throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("D:\\JAVA studying\\JavaTask 4\\shortbread_cookie.xml"));
        document.normalizeDocument();
        Element root = document.getDocumentElement();
        NodeList shortbread = root.getElementsByTagName("cookie");

        for (int i = 0; i < shortbread.getLength(); i++) {
            Element item = (Element) shortbread.item(i);
            item.getTagName();
            String id = item.getAttribute("id");
            Element name = (Element) item.getElementsByTagName("name").item(0);
            Element weight = (Element) item.getElementsByTagName("weight").item(0);
            String cookieNameValue = (String.format("%s", name.getTextContent()));
            Double cookieWeightValue = new Double(weight.getTextContent());
            cookieListXml.add(new ChocolateCookie(cookieNameValue, cookieWeightValue));
        }

    }
}
