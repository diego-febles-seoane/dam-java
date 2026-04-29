package com.ejemplo.service;

import java.util.List;

import com.ejemplo.model.*;
import com.ejemplo.repository.*;
import com.ejemplo.repository.sqlite.*;
import com.ejemplo.validation.ValidationUtils;

public class ProductoService implements IProductoService {
    private final IProductoRepository repository;
    public ProductoService() { this.repository = new ProductoSqliteRepository(); }
    @Override
    public boolean create(Producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
    @Override
    public Producto findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    @Override
    public List<Producto> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    @Override
    public boolean update(Producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    @Override
    public boolean deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    @Override
    public List<Producto> findActivos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findActivos'");
    }
    @Override
    public List<Producto> findByCategoria(Integer idCategoria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCategoria'");
    }
    @Override
    public List<Producto> findBajoStock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBajoStock'");
    }
    @Override
    public List<ProductoCatalogo> findCatalogo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCatalogo'");
    }
    @Override
    public List<MovimientoStock> findMovimientosByProducto(Integer idProducto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMovimientosByProducto'");
    }


}
