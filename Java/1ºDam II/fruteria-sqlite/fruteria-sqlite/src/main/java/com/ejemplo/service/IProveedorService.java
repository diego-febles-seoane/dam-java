package com.ejemplo.service;

import com.ejemplo.model.*;

public interface IProveedorService {
    boolean create(Proveedor proveedor);
    Proveedor findByCif(String cif);
    java.util.List<Proveedor> findAll();
    boolean update(Proveedor proveedor);
    boolean deleteByCif(String cif);
    java.util.List<Proveedor> findActivos();
    java.util.List<Proveedor> findByCiudad(String ciudad);
    Proveedor findByEmail(String email);
}
