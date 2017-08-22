/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;



public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        readXml();
    }
    
    public static void readXml() throws Exception {
        File archivo = new java.io.File("documento.xml");
        System.out.println(archivo.exists());
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        DOMImplementation implementation = builder.getDOMImplementation();
        Document document;
        document = builder.parse("documento.xml");
        //Element raiz = document.getDocumentElement();        
        Node nombre = document.getElementsByTagName("tspan").item(0).getFirstChild();
        Node apellido = document.getElementsByTagName("tspan").item(1).getFirstChild();
        Node dni = document.getElementsByTagName("tspan").item(2).getFirstChild();
        Node fecha = document.getElementsByTagName("tspan").item(3).getFirstChild();
        
        nombre.setTextContent("pedro");
        apellido.setTextContent("perez");
        dni.setTextContent("123123123");
        fecha.setTextContent("12/123/12");

        
        //Generate XML
        Source source = new DOMSource(document);
        //Indicamos donde lo queremos almacenar
        Result result = new StreamResult(new java.io.File("documento.xml")); //nombre del archivo
        Transformer transformer =
        TransformerFactory.newInstance().newTransformer();
        transformer.transform(source, result);

    }
}