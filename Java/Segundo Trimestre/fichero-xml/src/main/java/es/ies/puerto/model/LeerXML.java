package es.ies.puerto.model;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeerXML {

    static Set<Empleado> empleados = new HashSet<>();
    public static void main(String[] args) throws Exception {
        File archivo = new File("src/main/resources/empleados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);
        
        NodeList lista = doc.getElementsByTagName("empleado");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                String fecha = elemento.getElementsByTagName("fechaNacimiento").item(0).getTextContent();
                String puesto = elemento.getElementsByTagName("puesto").item(0).getTextContent();
                Empleado empleado = new Empleado(id,nombre,fecha,puesto);
                empleados.add(empleado);
            }
        }
        //System.out.println(empleados);
        System.out.println(buscar("1"));
    }

    public static void escribirXml() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
        
        Element root = doc.createElement("empleados");
        doc.appendChild(root);
        
        Element empleado = doc.createElement("empleado");
        root.appendChild(empleado);
        
        Element id = doc.createElement("id");
        id.appendChild(doc.createTextNode("1"));
        empleado.appendChild(id);
        
        Element nombre = doc.createElement("nombre");
        nombre.appendChild(doc.createTextNode("Diego Febles"));
        empleado.appendChild(nombre);
        
        Element fechaNacimiento = doc.createElement("fechaNacimiento");
        fechaNacimiento.appendChild(doc.createTextNode("1993-05-12"));
        empleado.appendChild(fechaNacimiento);
        
        Element puesto = doc.createElement("puesto");
        puesto.appendChild(doc.createTextNode("Desarrollador"));
        empleado.appendChild(puesto);
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/main/resources/empleados2.xml"));
        transformer.transform(source, result);
    }
    
    public static Empleado buscar2(String idBuscar, HashSet<Empleado> empleados){
        Empleado empleadoBuscar = new Empleado(idBuscar);
        for (Empleado empleado : empleados) {
            if (empleado.equals(empleadoBuscar)){
                return empleado;
            }
        }
        return null;
    }

    public static Empleado buscar(String idBuscar) throws Exception { 
        File archivo = new File("src/main/resources/empleados.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);
        
        NodeList lista = doc.getElementsByTagName("empleado");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                if (id.equals(idBuscar)){
                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    String fecha = elemento.getElementsByTagName("fechaNacimiento").item(0).getTextContent();
                    String puesto = elemento.getElementsByTagName("puesto").item(0).getTextContent();
                    return new Empleado(id,nombre,fecha,puesto);
                }
            }
        }
        return null;
    }
}

