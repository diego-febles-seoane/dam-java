package es.ies.puerto.file.dos;

import java.io.File;
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

/**
 * @author diego-febles-seoane
 * @version 1.0.0
 */
public class FilePokedexXml {

    /**
     * Saca todos los pockemons
     * 
     * @return List<Pokemon>
     * @throws ParserConfigurationException
     */
    public List<Pokemon> obtenerPokemons() throws Exception {
        File archivo = new File("src/main/resources/dos.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);
        List<Pokemon> listaPokemons = new ArrayList<>();
        NodeList lista = doc.getElementsByTagName("pokemon");
        for (int i = 0; i < lista.getLength(); i++) {
            Node nodo = lista.item(i);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                List<String> tipos = new ArrayList<>();
                NodeList listaTipos = doc.getElementsByTagName("tipos");
                for (int f = 0; f < listaTipos.getLength(); f++) {
                    Node nodoTipos = listaTipos.item(i);
                    if (nodoTipos.getNodeType() == Node.ELEMENT_NODE) {
                        Element elementoTipo = (Element) nodoTipos;
                        String tipo = elementoTipo.getElementsByTagName("tipo").item(0).getTextContent();
                        tipos.add(tipo);
                    }
                }
                String descripcion = elemento.getElementsByTagName("descripcion").item(0).getTextContent();
                listaPokemons.add(new Pokemon(id, nombre, tipos, descripcion));
            }
        }
        return listaPokemons;
    }

    /**
     * Busca a un pokemon
     * 
     * @param pokemon
     * @return
     * @throws Exception
     */
    public Pokemon obtenerPokemon(Pokemon pokemon) throws Exception {
        if (pokemon == null) {
            return null;
        }
        List<Pokemon> pokemons = obtenerPokemons();
        if (!pokemons.contains(pokemon)) {
            return null;
        }
        for (Pokemon pokemon2 : pokemons) {
            if (pokemon2.equals(pokemon)) {
                return pokemon2;
            }
        }
        return null;
    }

    /**
     * Aniade un pokemon al documento
     * 
     * @param pokemon
     * @throws Exception
     */
    public void addPokemon(Pokemon pokemon) throws Exception {
        List<Pokemon> listaPokemon = obtenerPokemons();
        if (pokemon != null) {
            listaPokemon.add(pokemon);
        }
    }

    /**
     * Elimina un pokemon de la lista
     * 
     * @param pokemon
     * @throws Exception
     */
    public void deletePokemon(Pokemon pokemon) throws Exception {
        List<Pokemon> listaPokemon = obtenerPokemons();
        if (pokemon != null) {
            listaPokemon.remove(pokemon);
        }
    }

    public static void volcarFichero(List<Pokemon> criaturas) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("pokemons");
        doc.appendChild(root);
        for (Pokemon pokemon : criaturas) {
            Element criaturaXml = doc.createElement("pokemon");
            root.appendChild(criaturaXml);

            Element idXml = doc.createElement("id");
            idXml.appendChild(doc.createTextNode(pokemon.getId()));
            criaturaXml.appendChild(idXml);

            Element nombreXml = doc.createElement("nombre");
            nombreXml.appendChild(doc.createTextNode(pokemon.getNombre()));
            criaturaXml.appendChild(nombreXml);

            Element tiposXml = doc.createElement("tipos");
            tiposXml.appendChild(doc.createTextNode(pokemon.getTipos().toString()));
            criaturaXml.appendChild(tiposXml);

            Element descripcionXml = doc.createElement("descripcion");
            descripcionXml.appendChild(doc.createTextNode(pokemon.getDescripcion()));
            descripcionXml.appendChild(descripcionXml);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("src/main/resources/dos.xml"));
        transformer.transform(source, result);
    }

    /**
     * Actualiza la informacion de un poquemon
     * 
     * @param pokemon
     * @throws Exception
     */
    public void updatePokemon(Pokemon pokemon) throws Exception {
        List<Pokemon> listaPokemon = obtenerPokemons();
        int posicion = listaPokemon.indexOf(pokemon);
        if (pokemon != null || posicion >= 0) {
            listaPokemon.set(posicion, pokemon);
        }
    }
}
