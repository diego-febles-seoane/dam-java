package es.file.json.uno;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CaballeroServiceFile {
    String pathXml = "src/main/resources/caballeros.xml";
    String pathCsv = "src/main/resources/caballeros.csv";

    public static void main(String[] args) {
        CaballeroService caballeroService = new CaballeroService();
        try {
            List<Caballero> caballerosXml = caballeroService.loadAll();
            transformador(caballerosXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean transformador(List<Caballero> listCaballero) throws Exception {
        // escribirCsv(listCaballero);
        escribirXml(listCaballero);
        return false;
    }

    public static void escribirXml(List<Caballero> listCaballero) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("caballeros");
        doc.appendChild(root);

        Element caballero = doc.createElement("caballero");
        root.appendChild(caballero);

        Element id = doc.createElement("id");
        id.appendChild(doc.createTextNode(listCaballero.getId()));
        caballero.appendChild(id);

        Element nombre = doc.createElement("nombre");
        nombre.appendChild(doc.createTextNode("Juan Pérez"));
        caballero.appendChild(nombre);

        Element constelacion = doc.createElement("constelacion");
        constelacion.appendChild(doc.createTextNode("Pegaso"));
        caballero.appendChild(constelacion);

        Element nivel = doc.createElement("nivel");
        nivel.appendChild(doc.createTextNode("10"));
        caballero.appendChild(nivel);

        Element fechaIngreso = doc.createElement("fechaIngreso");
        fechaIngreso.appendChild(doc.createTextNode("1993-05-12"));
        caballero.appendChild(fechaIngreso);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("pathXml"));
        transformer.transform(source, result);
    }
}
