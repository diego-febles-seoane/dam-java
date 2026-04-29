package com.ejemplo.service;

import com.ejemplo.model.*;

public interface ICompraService {
    boolean create(Compra compra);
    Compra findById(Integer id);
    java.util.List<Compra> findAll();
    boolean update(Compra compra);
    boolean deleteById(Integer id);
    java.util.List<Compra> findByProveedor(String cifProveedor);
    Compra findByNumeroFactura(String numeroFactura);
    java.util.List<CompraDetalle> findDetallesByCompra(Integer idCompra);
}
