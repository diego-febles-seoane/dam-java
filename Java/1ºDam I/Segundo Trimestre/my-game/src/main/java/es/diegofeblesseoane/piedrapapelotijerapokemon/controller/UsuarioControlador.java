package es.diegofeblesseoane.piedrapapelotijerapokemon.controller;

import es.diegofeblesseoane.piedrapapelotijerapokemon.model.UsuarioFile;
import es.diegofeblesseoane.piedrapapelotijerapokemon.model.UsuarioModel;
import es.diegofeblesseoane.piedrapapelotijerapokemon.view.UsuarioView;

public class UsuarioControlador {
    UsuarioFile usuarioFile;

    public UsuarioControlador() {
        usuarioFile = new UsuarioFile();
    }


    public boolean add(String nombre, String codigo, String contrasenia) {
        if (nombre == null || nombre.isEmpty()){
            return false;
        }
        UsuarioModel usuarioModel = new UsuarioModel();
        return true;
    }

    public UsuarioView getById(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        UsuarioModel usuarioABuscar = new UsuarioModel(codigo);
        usuarioABuscar = usuarioFile.getUsuario(usuarioABuscar);
        UsuarioView usuarioView = new UsuarioView(usuarioABuscar.getCodigo(), usuarioABuscar.getNombre());
        return usuarioView;
    }
}