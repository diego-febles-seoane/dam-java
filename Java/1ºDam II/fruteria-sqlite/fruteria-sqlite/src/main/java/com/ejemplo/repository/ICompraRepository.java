package com.ejemplo.repository;

import com.ejemplo.model.Compra;
import com.ejemplo.model.CompraDetalle;

public interface ICompraRepository {

    boolean create(Compra compra);

    Compra findById(Integer id);

    java.util.List<Compra> findAll();

    boolean update(Compra compra);

    boolean deleteById(Integer id);

    java.util.List<Compra> findByProveedor(String cifProveedor);

    Compra findByNumeroFactura(String numeroFactura);

    java.util.List<CompraDetalle> findDetallesByCompra(Integer idCompra);
}
