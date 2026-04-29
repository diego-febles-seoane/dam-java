package com.ejemplo.service;

import com.ejemplo.model.*;

public interface IVentaService {
    boolean create(Venta venta);
    Venta findById(Integer id);
    java.util.List<Venta> findAll();
    boolean update(Venta venta);
    boolean deleteById(Integer id);
    java.util.List<Venta> findByCliente(String dniCliente);
    Venta findByTicket(String ticket);
    java.util.List<VentaDetalle> findDetallesByVenta(Integer idVenta);
    java.util.List<VentaResumen> findResumenVentas();
}
