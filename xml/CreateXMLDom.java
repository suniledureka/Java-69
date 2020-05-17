package co.edureka.xml;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLDom 
{
	public static Document createDocument() throws Exception{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();

		Document doc = parser.newDocument();
		return doc;
	}
	
	public static void main(String[] args) throws Exception {
		Document doc = createDocument();

		Element students = doc.createElement("students");
		doc.appendChild(students);

		Element student = doc.createElement("student");
		students.appendChild(student);

		Element name = doc.createElement("name");
		Text name_data = doc.createTextNode("Sunil Joseph");
		name.appendChild(name_data);

		Element email = doc.createElement("email");
		Text email_data = doc.createTextNode("sunil@edureka.co");
		email.appendChild(email_data);

		Element address = doc.createElement("address");
		Text address_data = doc.createTextNode("Hyderabad");
		address.appendChild(address_data);

		student.appendChild(name);
		student.appendChild(email);
		student.appendChild(address);

		TransformerFactory tfactory = TransformerFactory.newInstance();
		Transformer t = tfactory.newTransformer();

		FileOutputStream fos = new FileOutputStream("E:/students.xml");
		t.transform(new DOMSource(doc), new StreamResult(fos));

		System.out.println("XML file generated..");

	}
}
