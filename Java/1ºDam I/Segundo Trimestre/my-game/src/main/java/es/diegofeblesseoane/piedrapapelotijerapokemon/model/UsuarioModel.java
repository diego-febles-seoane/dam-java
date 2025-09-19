package es.diegofeblesseoane.piedrapapelotijerapokemon.model;

public class UsuarioModel {
    String codigo;
    String nombre;
    String contrasenia;


    public UsuarioModel(String codigo) {
        this.codigo = codigo;
    }

    public UsuarioModel(String nombre, String codigo, String contrasenia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }


    public String getCodigo() {
        return this.codigo;
    }
    
    


}
