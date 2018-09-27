package parsing;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

/*Steps to use JDOM PArser:-
Import XML-related packages.
Create a SAXBuilder.
Create a Document from a file or stream
Extract the root element
Examine attributes
Examine sub-elements*/

public class DOMParser {
	public static void main(String[] args) {
		try {
			File inputfile =new File("C:\\Users\\mohdazad.khan\\Desktop\\testng-results.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory().newInstance(); 
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(inputfile);
				 doc.getDocumentElement().normalize();
		         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				
				
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static DocumentBuilderFactory DocumentBuilderFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
