package com.ejemplo.service;

import com.ejemplo.model.*;

public interface IProductoService {
    boolean create(Producto producto);
    Producto findById(Integer id);
    java.util.List<Producto> findAll();
    boolean update(Producto producto);
    boolean deleteById(Integer id);
    java.util.List<Producto> findActivos();
    java.util.List<Producto> findByCategoria(Integer idCategoria);
    java.util.List<Producto> findBajoStock();
    java.util.List<ProductoCatalogo> findCatalogo();
    java.util.List<MovimientoStock> findMovimientosByProducto(Integer idProducto);
}
