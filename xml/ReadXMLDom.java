package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXMLDom {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		
		File file = new File("src/co/edureka/xml/staff.xml");
		
		if(file.exists()) {
			Document doc = parser.parse(file);
			
			Element root = doc.getDocumentElement();
			System.out.println("Root Element = "+ root.getNodeName());
			
			NodeList staffs = root.getElementsByTagName("staff");
			System.out.println("No of Staffs = "+ staffs.getLength());
			
			for(int i=0;i<staffs.getLength();i++) {
				System.out.println("---------------------------");
				Element staff = (Element)staffs.item(i);
				System.out.println("STAFF : "+ staff.getAttribute("id"));
				System.out.println("First Name : "+ staff.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : "+ staff.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : "+ staff.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : "+ staff.getElementsByTagName("salary").item(0).getTextContent());
			}
		}
		else {
			System.out.println("XML document is not available!");
		}
	}
}
