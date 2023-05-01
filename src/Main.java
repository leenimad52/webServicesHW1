import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    private static HashMap<String, Book> bookMap = new HashMap<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("src\\XmlExample.xml");
        DocumentBuilderFactory BF = DocumentBuilderFactory.newInstance();
        DocumentBuilder DB = BF.newDocumentBuilder();
        Document dcm = DB.parse(file);
        dcm.getDocumentElement().normalize();
        NodeList list = dcm.getElementsByTagName("book");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elm = (Element) node;
                Book book = new Book();
                book.setId(elm.getAttribute("id").toString().trim());
                book.setAuther(elm.getElementsByTagName("author").item(0).getTextContent());
                book.setTitle(elm.getElementsByTagName("title").item(0).getTextContent());
                book.setDescribtion(elm.getElementsByTagName("description").item(0).getTextContent());
                book.setPrice(Double.parseDouble(elm.getElementsByTagName("price").item(0).getTextContent()));
                book.setPublish_date(elm.getElementsByTagName("publish_date").item(0).getTextContent());
                bookMap.put(book.getId(), book);
            }
        }
        System.out.println("Enter the book ID to see its information ");
        Scanner in = new Scanner(System.in);
        String ID = in.nextLine().trim();
        Book book = bookMap.get(ID);
        if (book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("try again");
        }
    }
}
