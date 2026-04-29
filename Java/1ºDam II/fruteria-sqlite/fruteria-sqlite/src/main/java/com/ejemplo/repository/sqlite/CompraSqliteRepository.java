package com.ejemplo.repository.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.ejemplo.model.Compra;
import com.ejemplo.model.CompraDetalle;
import com.ejemplo.repository.ICompraRepository;

public class CompraSqliteRepository extends SQLiteConnectionManager implements ICompraRepository {

    public CompraSqliteRepository() {
        super();
    }

    @Override
    public boolean create(Compra compra) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("INSERT INTO compra (numero_factura, fecha, cif_proveedor, total) VALUES (?, ?, ?, ?)")){
            sentencia.setString(1, compra.getNumeroFactura());
            sentencia.setString(2, compra.getFecha());
            sentencia.setString(3, compra.getCifProveedor());
            sentencia.setDouble(4, compra.getTotal());
            return sentencia.executeUpdate() > 0;   
        } catch (Exception e) {
            System.err.println("No se a podido crear la compra: " +compra.getNumeroFactura());
            return false;
        }
    }

    @Override
    public Compra findById(Integer id) {
        Compra compra = null;
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM compra WHERE id = ?")){
            sentencia.setInt(1, id);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                compra = new Compra();
                compra.setId(resultado.getInt("id"));
                compra.setNumeroFactura(resultado.getString("numero_factura"));
                compra.setFecha(resultado.getString("fecha"));
                compra.setCifProveedor(resultado.getString("cif_proveedor"));
                compra.setTotal(resultado.getDouble("total"));
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar la compra: " +id);
            return null;
        }
        return compra;
    }

    @Override
    public List<Compra> findAll() {
        ArrayList<Compra> compras = new ArrayList<>();
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM compra")){
            var resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Compra compra = new Compra();
                compra.setId(resultado.getInt("id"));
                compra.setNumeroFactura(resultado.getString("numero_factura"));
                compra.setFecha(resultado.getString("fecha"));
                compra.setCifProveedor(resultado.getString("cif_proveedor"));
                compra.setTotal(resultado.getDouble("total"));
                compras.add(compra);
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar las compras");
            return null;
        }
        return compras;
    }

    @Override
    public boolean update(Compra compra) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("UPDATE compra SET numero_factura = ?, fecha = ?, cif_proveedor = ?, total = ? WHERE id = ?")){
            sentencia.setString(1, compra.getNumeroFactura());
            sentencia.setString(2, compra.getFecha());
            sentencia.setString(3, compra.getCifProveedor());
            sentencia.setDouble(4, compra.getTotal());
            sentencia.setInt(5, compra.getId());
            return sentencia.executeUpdate() > 0;   
        } catch (Exception e) {
            System.err.println("No se a podido actualizar la compra: " +compra.getNumeroFactura());
            return false;
        }
    }

    @Override
    public boolean deleteById(Integer id) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("DELETE FROM compra WHERE id = ?")){
            sentencia.setInt(1, id);
            return sentencia.executeUpdate() > 0;   
        } catch (Exception e) {
            System.err.println("No se a podido eliminar la compra: " +id);
            return false;
        }
    }

    @Override
    public List<Compra> findByProveedor(String cifProveedor) {
        ArrayList<Compra> compras = new ArrayList<>();
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM compra WHERE cif_proveedor = ?")){
            sentencia.setString(1, cifProveedor);
            var resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Compra compra = new Compra();
                compra.setId(resultado.getInt("id"));
                compra.setNumeroFactura(resultado.getString("numero_factura"));
                compra.setFecha(resultado.getString("fecha"));
                compra.setCifProveedor(resultado.getString("cif_proveedor"));
                compra.setTotal(resultado.getDouble("total"));
                compras.add(compra);
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar las compras del proveedor: " +cifProveedor);
            return null;
        }
        return compras;
    }

    @Override
    public Compra findByNumeroFactura(String numeroFactura) {
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM compra WHERE numero_factura = ?")){
            sentencia.setString(1, numeroFactura);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                Compra compra = new Compra();
                compra.setId(resultado.getInt("id"));
                compra.setNumeroFactura(resultado.getString("numero_factura"));
                compra.setFecha(resultado.getString("fecha"));
                compra.setCifProveedor(resultado.getString("cif_proveedor"));
                compra.setTotal(resultado.getDouble("total"));
                return compra;
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar la compra con número de factura: " +numeroFactura);
            return null;
        }
        return null;
    }

    @Override
    public List<CompraDetalle> findDetallesByCompra(Integer idCompra) {
        ArrayList<CompraDetalle> detalles = new ArrayList<>();
        try (Connection connection = this.getConnection();
        PreparedStatement sentencia = connection.prepareStatement("SELECT * FROM compra_detalle WHERE id_compra = ?")){
            sentencia.setInt(1, idCompra);
            var resultado = sentencia.executeQuery();
            while (resultado.next()) {
                CompraDetalle detalle = new CompraDetalle();
                detalle.setId(resultado.getInt("id"));
                detalle.setIdCompra(resultado.getInt("id_compra"));
                detalle.setIdProducto(resultado.getInt("id_producto"));
                detalle.setCantidad(resultado.getDouble("cantidad"));
                detalle.setPrecioUnitario(resultado.getDouble("precio_unitario"));
                detalles.add(detalle);
            }
        } catch (Exception e) {
            System.err.println("No se a podido encontrar los detalles de la compra: " +idCompra);
            return null;
        }
        return detalles;
    }

}
