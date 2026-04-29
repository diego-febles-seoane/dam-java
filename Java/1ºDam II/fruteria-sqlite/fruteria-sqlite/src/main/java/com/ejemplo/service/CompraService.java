package com.ejemplo.service;

import java.util.List;

import com.ejemplo.model.Compra;
import com.ejemplo.model.CompraDetalle;
import com.ejemplo.repository.ICompraRepository;
import com.ejemplo.repository.sqlite.CompraSqliteRepository;
import com.ejemplo.validation.ValidationUtils;

public class CompraService implements ICompraService {

    private final ICompraRepository repository;

    public CompraService() {
        this.repository = new CompraSqliteRepository();
    }

    @Override
    public boolean create(Compra compra) {
        if (!validar(compra)) {
            System.err.println("La compra no es valida");
            return false;
        }
        return repository.create(compra);
    }

    @Override
    public Compra findById(Integer id) {
        if (id == null || id <= 0) {
            System.err.println("El id no es valido");
            return null;
        }
        return repository.findById(id);
    }

    @Override
    public List<Compra> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean update(Compra compra) {
        if (!validar(compra)) {
            System.err.println("La compra no es valida");
            return false;
        }
        return repository.update(compra);
    }

    @Override
    public boolean deleteById(Integer id) {
        if (id == null || id <= 0) {
            System.err.println("El id no es valido");
            return false;
        }
        return repository.deleteById(id);
    }

    @Override
    public List<Compra> findByProveedor(String cifProveedor) {
        if (cifProveedor == null || cifProveedor.isEmpty()) {
            System.err.println("El cif del proveedor no es valido");
            return null;
        }
        return repository.findByProveedor(cifProveedor);
    }

    @Override
    public Compra findByNumeroFactura(String numeroFactura) {
        if (numeroFactura == null || numeroFactura.isEmpty()) {
            System.err.println("El numero de factura no es valido");
            return null;
        }
        return repository.findByNumeroFactura(numeroFactura);
    }

    @Override
    public List<CompraDetalle> findDetallesByCompra(Integer idCompra) {
        if (idCompra == null || idCompra <= 0) {
            System.err.println("El id de compra no es valido");
            return null;
        }
        return repository.findDetallesByCompra(idCompra);
    }

    private boolean validar(Compra compra) {
        return ValidationUtils.isValidCompra(compra);
    }

}
