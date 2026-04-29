package com.ejemplo.repository.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ejemplo.model.Cliente;
import com.ejemplo.repository.IClienteRepository;

public class ClienteSqliteRepository extends SQLiteConnectionManager implements IClienteRepository {

    public ClienteSqliteRepository(){
        super();
    }

    @Override
    public boolean create(Cliente cliente) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("INSERT INTO cliente (dni, nombre, telefono, email, ciudad, activo) VALUES (?, ?, ?, ?, ?, ?)")){
            sentencia.setString(1, cliente.getDni());
            sentencia.setString(2, cliente.getNombre());
            sentencia.setString(3, cliente.getTelefono());
            sentencia.setString(4, cliente.getEmail());
            sentencia.setString(5, cliente.getCiudad());
            sentencia.setInt(6, cliente.getActivo());
            return sentencia.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("No se a podido crear el cliente: " +cliente.getDni());
            return false;
        }
    }

    @Override
    public Cliente findByDni(String dni) {
        Cliente cliente = null;
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM cliente WHERE dni = ?")){
            sentencia.setString(1, dni);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                cliente = new Cliente();
                cliente.setDni(resultado.getString("dni"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setActivo(resultado.getInt("activo"));
                cliente = new Cliente(cliente.getDni(), cliente.getNombre(), cliente.getTelefono(), cliente.getEmail(), cliente.getCiudad(), cliente.getActivo());
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar el cliente: " +dni);
            return null;
        }
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM cliente")){
            var resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setDni(resultado.getString("dni"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setActivo(resultado.getInt("activo"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar los clientes");
        }
        return clientes;
    }

    @Override
    public boolean update(Cliente cliente) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("UPDATE cliente SET nombre = ?, telefono = ?, email = ?, ciudad = ?, activo = ? WHERE dni = ?")){
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getTelefono());
            sentencia.setString(3, cliente.getEmail());
            sentencia.setString(4, cliente.getCiudad());
            sentencia.setInt(5, cliente.getActivo());
            sentencia.setString(6, cliente.getDni());
            return sentencia.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("No se a podido actualizar el cliente: " +cliente.getDni());
            return false;
        }
    }

    @Override
    public boolean deleteByDni(String dni) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("DELETE FROM cliente WHERE dni = ?")){
            sentencia.setString(1, dni);
            return sentencia.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("No se a podido eliminar el cliente: " +dni);
            return false;
        }
    }

    @Override
    public List<Cliente> findActivos() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM cliente WHERE activo = 1")){
            var resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setDni(resultado.getString("dni"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setActivo(resultado.getInt("activo"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar los clientes activos");
        }
        return clientes;
    }

    @Override
    public List<Cliente> findByCiudad(String ciudad) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM cliente WHERE ciudad = ?")){
            sentencia.setString(1, ciudad);
            var resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setDni(resultado.getString("dni"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setActivo(resultado.getInt("activo"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar los clientes de la ciudad: " +ciudad);
        }
        return clientes;
    }

    @Override
    public Cliente findByEmail(String email) {
        Cliente cliente = null;
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM cliente WHERE email = ?")){
            sentencia.setString(1, email);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                cliente = new Cliente();
                cliente.setDni(resultado.getString("dni"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setEmail(resultado.getString("email"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setActivo(resultado.getInt("activo"));
                cliente = new Cliente(cliente.getDni(), cliente.getNombre(), cliente.getTelefono(), cliente.getEmail(), cliente.getCiudad(), cliente.getActivo());
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar el cliente con el email: " +email);
            return null;
        }
        return cliente;
    }

    
}
