package es.ies.puerto.file.uno;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

class FileXmlCriaturaTest {
    Criatura criatura;
    FileXmlCriatura persistencia;

    List<Criatura> criaturas;

    @BeforeEach
void beforeEach() throws ParserConfigurationException, SAXException, IOException {
        persistencia = new FileXmlCriatura();
        criaturas = persistencia.obtenerCriaturas();
        criatura = new Criatura();
    }

    @Test
void obtenerCriaturasTest() throws ParserConfigurationException, SAXException, IOException{
        Assertions.assertFalse(criaturas.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5,criaturas.size(),
                MESSAGE_ERROR);
    }

    @Test
void obtenerCriaturaTest() throws ParserConfigurationException, SAXException, IOException{
        String idBuscar = "UN002";
        Criatura critaturaBuscar = new Criatura(idBuscar);
        critaturaBuscar = persistencia.obtener(critaturaBuscar);
        Assertions.assertEquals(critaturaBuscar.getId(), "UN002",
                MESSAGE_ERROR);
        Assertions.assertNotNull(critaturaBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (critaturaBuscar.getCategoria().equals("Unicornios"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(critaturaBuscar.getDescripcion().equals("Un hermoso unicornio con un cuerno brillante"),
                MESSAGE_ERROR);
    }

    @Test
void addDeleteCriaturaTest() throws Exception{

        int numCriaturasInicial = criaturas.size();
        Criatura criaturaInsertar = new Criatura("UN002");

        persistencia.addCriatura(criaturaInsertar);
        criaturas = persistencia.obtenerCriaturas();
        int numCriaturasInsertar = criaturas.size();
        Assertions.assertTrue(criaturas.contains(criaturaInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numCriaturasInicial +1 ,
                numCriaturasInsertar, MESSAGE_ERROR);
        persistencia.deleteCriatura(criaturaInsertar);
        criaturas = persistencia.obtenerCriaturas();
        int numCritaturasBorrado = criaturas.size();
        Assertions.assertEquals(numCriaturasInicial ,
                numCritaturasBorrado,
                MESSAGE_ERROR);
    }

    @Test
void actualizarCriatura() throws ParserConfigurationException, SAXException, IOException{
        String idActualizar = "UN002";
        Criatura CriaturaBuscar = new Criatura(idActualizar);
        Criatura CriaturaActualizar = persistencia.obtener(CriaturaBuscar);
        Criatura CriaturaBackup = persistencia.obtener(CriaturaBuscar);
        CriaturaActualizar.setNombre("Unicornio Brillante");
        CriaturaActualizar.setDescripcion("Un hermoso unicornio con un cuerno brillante.");
        CriaturaActualizar.setCategoria("Unicornios");
        persistencia.updateCriatura(CriaturaActualizar);

        CriaturaBuscar = persistencia.obtener(CriaturaBuscar);
        Assertions.assertEquals(CriaturaBuscar.toString(), CriaturaActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updateCriatura(CriaturaBackup);

    }



}
