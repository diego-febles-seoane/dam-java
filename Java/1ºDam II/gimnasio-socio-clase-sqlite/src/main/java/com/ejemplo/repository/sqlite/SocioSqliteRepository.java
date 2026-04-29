package com.ejemplo.repository.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ejemplo.model.Clase;
import com.ejemplo.model.Socio;
import com.ejemplo.model.SocioReserva;
import com.ejemplo.repository.ISocioRepository;

public class SocioSqliteRepository extends SQLiteConnectionManager implements ISocioRepository {

    public SocioSqliteRepository() {
        super();
    }

    @Override
    public boolean create(Socio socio) {
        try (Connection connection = this.getConnection(); PreparedStatement sentencia
                = connection.prepareStatement("INSERT INTO socio (id, dni, nombre, email, telefono, plan, activo) "
                        + " VALUES (?, ?, ?, ?, ?, ?, ?)")) {
            sentencia.setObject(1, socio.getId());
            sentencia.setString(2, socio.getDni());
            sentencia.setString(3, socio.getNombre());
            sentencia.setString(4, socio.getEmail());
            sentencia.setString(5, socio.getTelefono());
            sentencia.setString(6, socio.getPlan());
            sentencia.setObject(7, socio.getActivo());
            sentencia.execute();
        } catch (Exception e) {
            System.err.println("No se ha podido almacenar el socio:" + socio.getId());
            return false;
        }
        return true;
    }

    @Override
    public Socio findById(Integer id) {
        Socio socio = null;
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM socio WHERE id = ?")) {
            sentencia.setInt(1, id);
            try (ResultSet resultado = sentencia.executeQuery()) {
                if (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    String dni = resultado.getString("dni");
                    String email = resultado.getString("email");
                    String telefono = resultado.getString("telefono");
                    String plan = resultado.getString("plan");
                    Integer activo = (Integer) resultado.getObject("activo");
                    socio = new Socio(id, dni, nombre, email, telefono, plan, activo);
                }
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return null;
        }
        return socio;
    }

    @Override
    public List<Socio> findAll() {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM socio"); ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Integer id = (Integer) resultado.getObject("id");
                String nombre = resultado.getString("nombre");
                String dni = resultado.getString("dni");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                String plan = resultado.getString("plan");
                Integer activo = (Integer) resultado.getObject("activo");
                Socio socio = new Socio(id, dni, nombre, email, telefono, plan, activo);
                socios.add(socio);
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Socio>();
        }
        return socios;
    }

    @Override
    public boolean update(Socio socio) {
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement(
                "UPDATE socio SET dni = ?, nombre = ?, email = ?, telefono = ?, plan = ?, activo = ? WHERE id = ?")) {
            sentencia.setString(1, socio.getDni());
            sentencia.setString(2, socio.getNombre());
            sentencia.setString(3, socio.getEmail());
            sentencia.setString(4, socio.getTelefono());
            sentencia.setString(5, socio.getPlan());
            sentencia.setObject(6, socio.getActivo());
            sentencia.setInt(7, socio.getId());
            int rowsAffected = sentencia.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.err.println("No se ha podido actualizar el socio:" + socio.getId());
            return false;
        }
    }

    @Override
    public boolean deleteById(Integer id) {
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement("DELETE FROM socio WHERE id = ?")) {
            sentencia.setInt(1, id);
            int rowsAffected = sentencia.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.err.println("No se ha podido eliminar al socio:" + id);
            return false;
        }
    }

    @Override
    public List<Socio> findActivos() {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM socio WHERE activo = 1"); ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Integer id = (Integer) resultado.getObject("id");
                String nombre = resultado.getString("nombre");
                String dni = resultado.getString("dni");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                String plan = resultado.getString("plan");
                Integer activo = (Integer) resultado.getObject("activo");
                Socio socio = new Socio(id, dni, nombre, email, telefono, plan, activo);
                socios.add(socio);
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Socio>();
        }
        return socios;
    }

    @Override
    public List<Socio> findByPlan(String plan) {
        ArrayList<Socio> socios = new ArrayList<Socio>();
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM socio WHERE plan = ?")) {
            sentencia.setString(1, plan);
            try (ResultSet resultado = sentencia.executeQuery()) {
                while (resultado.next()) {
                    Integer id = (Integer) resultado.getObject("id");
                    String nombre = resultado.getString("nombre");
                    String dni = resultado.getString("dni");
                    String email = resultado.getString("email");
                    String telefono = resultado.getString("telefono");
                    String planResult = resultado.getString("plan");
                    Integer activo = (Integer) resultado.getObject("activo");
                    Socio socio = new Socio(id, dni, nombre, email, telefono, planResult, activo);
                    socios.add(socio);
                }
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Socio>();
        }
        return socios;
    }

    @Override
    public List<SocioReserva> findSociosConReservas() {
        ArrayList<SocioReserva> sociosReservas = new ArrayList<>();
        try (Connection connection = this.getConnection(); PreparedStatement sentencia = connection.prepareStatement(
                "SELECT DISTINCT s.id AS socio_id, s.nombre, "
                + "r.id AS reserva_id, r.estado, r.id_clase AS clase_id "
                + "FROM socio s JOIN reserva r ON s.id = r.id_socio")) {
            try (ResultSet resultado = sentencia.executeQuery()) {
                while (resultado.next()) {
                    Integer socioId = (Integer) resultado.getObject("socio_id");
                    String socioNombre = resultado.getString("nombre");
                    Integer reservaId = (Integer) resultado.getObject("reserva_id");
                    String estadoReserva = resultado.getString("estado");
                    Integer claseId = (Integer) resultado.getObject("clase_id");
                    SocioReserva socioReserva = new SocioReserva(socioId, socioNombre, reservaId, estadoReserva, claseId);
                    sociosReservas.add(socioReserva);
                }
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<>();
        }
        return sociosReservas;
    }
}
