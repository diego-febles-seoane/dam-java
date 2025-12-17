package com.docencia.examen.listas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.docencia.examen.clases.Usuario;

//TODO: Completar clase GestorUsuarios con las funciones necesarias, y documenta la clase.
public class GestorUsuarios {

    // Lista interna donde guardamos los usuarios
    private List<Usuario> usuarios = new ArrayList<>();

    // TODO: agrega un usuario a la lista
    public void agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }

    // TODO: devuelve el numero de usuarios en la lista
    public int numeroUsuarios() {
        return usuarios.size();
    }

    // TODO: indica si la lista está vacía
    public boolean estaVacia() {
        return usuarios.isEmpty();
    }

    // TODO: indica si la lista contiene un usuario (usa equals de Usuario)
    public boolean contieneUsuario(Usuario usuario) {
        return usuarios.contains(usuario);
    }

    public Usuario obtenerPorPosicion(int indice) {
        return usuarios.get(indice);
    }

    // TODO: busca un usuario por su identificador y lo devuelve (o null si no lo
    // encuentra)
    public Usuario buscarPorIdentificador(String id) {
        if (id == null)
            return null;
        for (Usuario u : usuarios) {
            if (id.equals(u.getIdentificador())) {
                return u;
            }
        }
        return null;
    }

    // TODO: elimina un usuario por su identificador, devuelve true si lo ha
    // eliminado,
    // false si no lo ha encontrado
    public boolean eliminarPorIdentificador(String id) {
        if (id == null)
            return false;
        return usuarios.removeIf(u -> id.equals(u.getIdentificador()));
    }

    // TODO: limpia la lista de usuarios
    public void limpiar() {
        usuarios.clear();
    }

    public static void main(String[] args) {

    }
}
