package es.ies.puerto.file.uno;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class FileXmlCriatura {

    /**
     * Lee el archivo xml
     * @return List<Criaturas>
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public List<Criatura> obtenerCriaturas() throws ParserConfigurationException, SAXException, IOException{
        File archivo = new File("src/main/resources/uno.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);
        List<Criatura> listaCriaturas = new ArrayList<>();
        NodeList lista = doc.getElementsByTagName("criatura");
        for (int i = 0; i < lista.getLength(); i++){
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                String descripcion = elemento.getElementsByTagName("descripcion").item(0).getTextContent();
                String categoria = elemento.getElementsByTagName("categoria").item(0).getTextContent();
                listaCriaturas.add(new Criatura(id, nombre, descripcion, categoria));
            }
        }
        return listaCriaturas;
    }

    /**
     * Lee un criatura cocnreta del documento
     * @param criatura
     * @return Criatura
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     */
    public Criatura obtener(Criatura criatura) throws ParserConfigurationException, SAXException, IOException{
        if (criatura == null){
            return null;
        }
        List<Criatura> listaCriaturas = obtenerCriaturas();
        int posicion = listaCriaturas.indexOf(criatura);
        if (posicion >= 0){
            return listaCriaturas.get(posicion);
        }
        return null;
    }
        /**for (Criatura criatura2 : listaCriaturas) {
            if (criatura2.equals(criatura)) {
                return criatura2;
            }
        }
        return null;
    }*/

    /**
     * Aniade una criatura al documento
     * 
     * @param criatura a niadir
     * @throws Exception
     */
    public void addCriatura(Criatura criatura) throws Exception{
        List<Criatura> listaCriaturas = obtenerCriaturas();
        if (criatura != null){
            listaCriaturas.add(criatura);
        }
        volcarFichero(listaCriaturas);
    }

    /**
     * elimina una criatura de la lista
     * 
     * @param criaturaElimiar del fichero
     * @throws Exception
     */
    public void deleteCriatura(Criatura criaturaEliminar) throws Exception{
        List<Criatura> criaturas = obtenerCriaturas();
        if (criaturaEliminar != null) {
            criaturas.remove(criaturaEliminar);
        }
        volcarFichero(criaturas);
    }

    /**
     * Actualiza la informacion del fichero
     * 
     * @param Criaturas del fichero
     * @throws Exception
     */
    public static void volcarFichero(List<Criatura> criaturas) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("Criaturas");
        doc.appendChild(root);
        for (Criatura criatura2 : criaturas) {
            Element criaturaXml = doc.createElement("criatura");
            root.appendChild(criaturaXml);

            Element idXml = doc.createElement("id");
            idXml.appendChild(doc.createTextNode(criatura2.getId()));
            criaturaXml.appendChild(idXml);

            Element nombreXml = doc.createElement("nombre");
            nombreXml.appendChild(doc.createTextNode(criatura2.getNombre()));
            criaturaXml.appendChild(nombreXml);

            Element descripcionXml = doc.createElement("descripcion");
            descripcionXml.appendChild(doc.createTextNode(criatura2.getDescripcion()));
            criaturaXml.appendChild(descripcionXml);

            Element categoriaXml = doc.createElement("categoria");
            categoriaXml.appendChild(doc.createTextNode(criatura2.getCategoria()));
            criaturaXml.appendChild(categoriaXml);

        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/main/resources/uno.xml"));
        transformer.transform(source, result);
    }
    
    /**
     * Actualiza la informacion de la criatura
     * @param criaturaActualizada
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
    */
    public void updateCriatura(Criatura criaturaActualizada) throws ParserConfigurationException, SAXException, IOException {
        List<Criatura> criaturas = obtenerCriaturas();
        int posicion = criaturas.indexOf(criaturas);
        if (posicion >= 0){
            criaturas.add(posicion, criaturaActualizada);
        }

    }
}
