package es.ies.puerto.treinta.treinta;

public class Ejercicio30 {
    public static void main(String[] args) {
        Playlist playlist1 = new Playlist(5);
        Cancion cancion1 = new Cancion("Canción 1", "Artista 1", 3.5);
        Cancion cancion2 = new Cancion("Canción 2", "Artista 2", 4.2);
        Cancion cancion3 = new Cancion("Canción 3", "Artista 3", 2.8);
        Cancion cancion4 = new Cancion("Canción 4", "Artista 4", 3.7);
        playlist1.addCancion(cancion1);
        playlist1.addCancion(cancion2);
        playlist1.addCancion(cancion3);
        playlist1.eliminarCancion(cancion1);
        playlist1.addCancion(cancion4);
        System.out.println(playlist1);
    }
}
