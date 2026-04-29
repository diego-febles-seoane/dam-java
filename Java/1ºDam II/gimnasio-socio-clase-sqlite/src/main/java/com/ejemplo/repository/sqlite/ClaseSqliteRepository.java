package com.ejemplo.repository.sqlite;

import com.ejemplo.model.Clase;
import com.ejemplo.model.ClaseMonitor;
import com.ejemplo.model.ClaseReservaSocio;
import com.ejemplo.repository.IClaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClaseSqliteRepository extends SQLiteConnectionManager implements IClaseRepository {
    
    public ClaseSqliteRepository() {
        super();
    }

    @Override
    public boolean create(Clase clase) {
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = 
             connection.prepareStatement("INSERT INTO clase (id, nombre, tipo, horario, cupo_maximo, plazas_disponibles, activa, id_monitor) "
             +" VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {
            sentencia.setObject(1, clase.getId());
            sentencia.setString(2, clase.getNombre());
            sentencia.setString(3, clase.getTipo());
            sentencia.setString(4, clase.getHorario());
            sentencia.setObject(5, clase.getCupoMaximo());
            sentencia.setObject(6, clase.getPlazasDisponibles());
            sentencia.setObject(7, clase.getActiva());
            sentencia.setObject(8, clase.getIdMonitor());
            sentencia.execute();
        } catch (Exception e) {
            System.err.println("No se ha podido almacenar la clase:"+clase.getId());
            return false;
        }
        return true;
    }

    @Override
    public List<Clase> findAll() {
        ArrayList<Clase> clases =new ArrayList<Clase>();
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM clase");
             ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Integer id = (Integer) resultado.getObject("id");
                String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                String horario = resultado.getString("horario");
                Integer cupoMaximo = (Integer) resultado.getObject("cupo_maximo");
                Integer plazasDisponibles = (Integer) resultado.getObject("plazas_disponibles");
                Integer activa = (Integer) resultado.getObject("activa");
                Integer idMonitor = (Integer) resultado.getObject("id_monitor");
                Clase clase = new Clase(id, nombre, tipo, horario, cupoMaximo, plazasDisponibles, activa, idMonitor);
                clases.add(clase);

            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Clase>();
        }
        return clases;
    }

    @Override
    public Clase findById(Integer id) {
        Clase clase = null;
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM clase WHERE id = ?")) {
            sentencia.setInt(1, id);
            try (ResultSet resultado = sentencia.executeQuery()) {
                if (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    String tipo = resultado.getString("tipo");
                    String horario = resultado.getString("horario");
                    Integer cupoMaximo = (Integer) resultado.getObject("cupo_maximo");
                    Integer plazasDisponibles = (Integer) resultado.getObject("plazas_disponibles");
                    Integer activa = (Integer) resultado.getObject("activa");
                    Integer idMonitor = (Integer) resultado.getObject("id_monitor");
                    clase = new Clase(id, nombre, tipo, horario, cupoMaximo, plazasDisponibles, activa, idMonitor);
                }
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return null;
        }
        return clase;
    }

    @Override
    public boolean update(Clase clase) {
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = 
             connection.prepareStatement("UPDATE clase SET nombre = ?, tipo = ?, horario = ?, cupo_maximo = ?, plazas_disponibles = ?, activa = ?, id_monitor = ? WHERE id = ?")) {
            sentencia.setString(1, clase.getNombre());
            sentencia.setString(2, clase.getTipo());
            sentencia.setString(3, clase.getHorario());
            sentencia.setObject(4, clase.getCupoMaximo());
            sentencia.setObject(5, clase.getPlazasDisponibles());
            sentencia.setObject(6, clase.getActiva());
            sentencia.setObject(7, clase.getIdMonitor());
            sentencia.setObject(8, clase.getId());
            int rowsAffected = sentencia.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.err.println("No se ha podido actualizar la clase:"+clase.getId());
            return false;
        }
    }

    @Override
    public boolean deleteById(Integer id) {
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("DELETE FROM clase WHERE id = ?")) {
            sentencia.setInt(1, id);
            int rowsAffected = sentencia.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            System.err.println("No se ha podido eliminar la clase");
            return false;
        }
    }

    @Override
    public List<Clase> findDisponibles() {
        ArrayList<Clase> clases = new ArrayList<Clase>();
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM clase WHERE plazas_disponibles > 0");
             ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Integer id = (Integer) resultado.getObject("id");
                String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                String horario = resultado.getString("horario");
                Integer cupoMaximo = (Integer) resultado.getObject("cupo_maximo");
                Integer plazasDisponibles = (Integer) resultado.getObject("plazas_disponibles");
                Integer activa = (Integer) resultado.getObject("activa");
                Integer idMonitor = (Integer) resultado.getObject("id_monitor");
                Clase clase = new Clase(id, nombre, tipo, horario, cupoMaximo, plazasDisponibles, activa, idMonitor);
                clases.add(clase);
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Clase>();
        }
        return clases;
    }

    @Override
    public List<Clase> findByTipo(String tipo) {
        ArrayList<Clase> clases =new ArrayList<Clase>();
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM clase WHERE tipo = ?")) {
            sentencia.setString(1, tipo);
            try (ResultSet resultado = sentencia.executeQuery()) {
                while (resultado.next()) {
                    Integer id = (Integer) resultado.getObject("id");
                    String nombre = resultado.getString("nombre");
                    String horario = resultado.getString("horario");
                    Integer cupoMaximo = (Integer) resultado.getObject("cupo_maximo");
                    Integer plazasDisponibles = (Integer) resultado.getObject("plazas_disponibles");
                    Integer activa = (Integer) resultado.getObject("activa");
                    Integer idMonitor = (Integer) resultado.getObject("id_monitor");
                    Clase clase = new Clase(id, nombre, tipo, horario, cupoMaximo, plazasDisponibles, activa, idMonitor);
                    clases.add(clase);
                }
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Clase>();
        }
        return clases;
    }

    @Override
    public List<Clase> findByMonitor(Integer idMonitor) {
        ArrayList<Clase> clases =new ArrayList<Clase>();
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM clase WHERE id_monitor = ?")) {
            sentencia.setInt(1, idMonitor);
            try (ResultSet resultado = sentencia.executeQuery()) {
                while (resultado.next()) {
                    Integer id = (Integer) resultado.getObject("id");
                    String nombre = resultado.getString("nombre");
                    String tipo = resultado.getString("tipo");
                    String horario = resultado.getString("horario");
                    Integer cupoMaximo = (Integer) resultado.getObject("cupo_maximo");
                    Integer plazasDisponibles = (Integer) resultado.getObject("plazas_disponibles");
                    Integer activa = (Integer) resultado.getObject("activa");
                    Clase clase = new Clase(id, nombre, tipo, horario, cupoMaximo, plazasDisponibles, activa, idMonitor);
                    clases.add(clase);
                }
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<Clase>();
        }
        return clases;
    }

    @Override
    public List<ClaseMonitor> findClasesConMonitor() {
        ArrayList<ClaseMonitor> clases =new ArrayList<ClaseMonitor>();
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT c.id as claseId, c.nombre as claseNombre, c.tipo, m.nombre as monitorNombre, m.especialidad FROM clase c JOIN monitor m ON c.id_monitor = m.id");
             ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Integer claseId = (Integer) resultado.getObject("claseId");
                String claseNombre = resultado.getString("claseNombre");
                String tipo = resultado.getString("tipo");
                String monitorNombre = resultado.getString("monitorNombre");
                String especialidad = resultado.getString("especialidad");
                ClaseMonitor clase = new ClaseMonitor(claseId, claseNombre, tipo, monitorNombre, especialidad);
                clases.add(clase);

            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<ClaseMonitor>();
        }
        return clases;
    }

    @Override
    public List<ClaseReservaSocio> findReservasConSocio() {
        ArrayList<ClaseReservaSocio> reservas = new ArrayList<ClaseReservaSocio>();
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT r.id as reservaId, c.id as claseId, c.nombre as claseNombre, s.id as socioId, s.nombre as socioNombre, r.estado as estadoReserva FROM reserva r JOIN clase c ON r.id_clase = c.id JOIN socio s ON r.id_socio = s.id");
             ResultSet resultado = sentencia.executeQuery()) {
            while (resultado.next()) {
                Integer reservaId = (Integer) resultado.getObject("reservaId");
                Integer claseId = (Integer) resultado.getObject("claseId");
                String claseNombre = resultado.getString("claseNombre");
                Integer socioId = (Integer) resultado.getObject("socioId");
                String socioNombre = resultado.getString("socioNombre");
                String estadoReserva = resultado.getString("estadoReserva");
                ClaseReservaSocio reserva = new ClaseReservaSocio(reservaId, claseId, claseNombre, socioId, socioNombre, estadoReserva);
                reservas.add(reserva);
            }
        } catch (Exception e) {
            System.err.println("No se han podido obtener elementos");
            return new ArrayList<ClaseReservaSocio>();
        }
        return reservas;
    }

    public boolean monitorExists(Integer idMonitor) {
        if (idMonitor == null || idMonitor <= 0) {
            return false;
        }
        try (Connection connection = this.getConnection();
             PreparedStatement sentencia = connection.prepareStatement("SELECT 1 FROM monitor WHERE id = ?")) {
            sentencia.setInt(1, idMonitor);
            try (ResultSet resultado = sentencia.executeQuery()) {
                return resultado.next();
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean testConnection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testConnection'");
    }

}
