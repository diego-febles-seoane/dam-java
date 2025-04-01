import org.junit.jupiter.api.Test;

import es.ies.puerto.seis.Heroe;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class HeroeTest {
    private Heroe h1, h2, h3, h4;

    @BeforeEach
    void setUp() {
        h1 = new Heroe(1, "Goku", "Super Saiyan");
        h2 = new Heroe(1, "Goku", "Super Saiyan Blue");
        h3 = new Heroe(2, "Vegeta", "Super Saiyan");
        h4 = new Heroe(1, "Goku", "Ultra Instinct");
    }

    @Test
    void testEqualsSameID() {
        assertEquals(h1, h2, "Héroes con el mismo ID deben ser iguales, sin importar el nombre y poder");
        assertEquals(h1, h4, "Héroes con el mismo ID deben ser iguales, sin importar el nombre y poder");
    }

    @Test
    void testEqualsDifferentID() {
        assertNotEquals(h1, h3, "Héroes con diferente ID no deben ser iguales");
    }

    @Test
    void testEqualsSameInstance() {
        assertEquals(h1, h1, "Un héroe debe ser igual a sí mismo");
    }

    @Test
    void testEqualsNull() {
        assertNotEquals(h1, null, "Un héroe no debe ser igual a null");
    }

    @Test
    void testEqualsDifferentClass() {
        assertNotEquals(h1, "NotAHero", "Un héroe no debe ser igual a un objeto de otra clase");
    }

    @Test
    void testToString() {
        assertEquals("Heroe [ID=1, Nombre=Goku, Poder=Super Saiyan]", h1.toString(), 
                     "El método toString debe seguir el formato especificado.");
    }

    @Test
    void testToStringDifferentAttributes() {
        assertEquals("Heroe [ID=2, Nombre=Vegeta, Poder=Super Saiyan]", h3.toString(), 
                     "El método toString debe seguir el formato especificado.");
    }


}
