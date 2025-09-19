package es.ies.puerto.file.dos;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

class FilePokedexXmlTest {


    FilePokedexXml persistencia;

    List<Pokemon> pokemons;

    @BeforeEach
    void beforeEach() throws Exception{
        persistencia = new FilePokedexXml();
        pokemons = persistencia.obtenerPokemons();
    }

    @Test
    void obtenerPokemosTest() throws Exception{
        Assertions.assertFalse(pokemons.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5, pokemons.size(),
                MESSAGE_ERROR);
    }

    @Test
    void obtenerPokemonTest() throws Exception{
        String idBuscar = "002";
        Pokemon PokemonBuscar = new Pokemon(idBuscar);
        PokemonBuscar = persistencia.obtenerPokemon(PokemonBuscar);
        Assertions.assertEquals(PokemonBuscar.getId(),"002",
                MESSAGE_ERROR);
        Assertions.assertNotNull(PokemonBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (PokemonBuscar.getNombre().equals("Charmander"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(PokemonBuscar.getDescripcion().equals("Un pequeño lagarto con una llama ardiente en su cola."),
                MESSAGE_ERROR);
    }

    @Test
    void addDeletePokemonTest() throws Exception{

        int numPokemonsInicial = pokemons.size();
        Pokemon PokemonInsertar = new Pokemon("002");

        persistencia.addPokemon(PokemonInsertar);
        pokemons = persistencia.obtenerPokemons();
        int numPokemonsInsertar = pokemons.size();
        Assertions.assertTrue(pokemons.contains(PokemonInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numPokemonsInicial +1 ,
                numPokemonsInsertar, MESSAGE_ERROR);
        persistencia.deletePokemon(PokemonInsertar);
        pokemons = persistencia.obtenerPokemons();
        int numPokemonsBorrado = pokemons.size();
        Assertions.assertEquals(numPokemonsInicial ,
                numPokemonsBorrado,
                MESSAGE_ERROR);
    }

    @Test
    void actualizarPokemon() throws Exception{
        String idActualizar = "002";
        Pokemon PokemonBuscar = new Pokemon(idActualizar);
        Pokemon PokemonActualizar = persistencia.obtenerPokemon(PokemonBuscar);
        Pokemon PokemonBackup = persistencia.obtenerPokemon(PokemonBuscar);
        PokemonActualizar.setNombre("Charmander");
        PokemonActualizar.setDescripcion("Un pequeño lagarto con una llama ardiente en su cola.");
        persistencia.updatePokemon(PokemonActualizar);

        PokemonBuscar = persistencia.obtenerPokemon(PokemonBuscar);
        Assertions.assertEquals(PokemonBuscar.toString(), PokemonActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.updatePokemon(PokemonBackup);

    }


}
