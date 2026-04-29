PRAGMA foreign_keys = ON;

DROP VIEW IF EXISTS vw_productos_bajo_stock;
DROP VIEW IF EXISTS vw_resumen_ventas;
DROP VIEW IF EXISTS vw_productos_catalogo;
DROP TRIGGER IF EXISTS trg_compra_detalle_ai;
DROP TRIGGER IF EXISTS trg_venta_detalle_ai;
DROP TRIGGER IF EXISTS trg_venta_no_stock;
DROP TABLE IF EXISTS movimiento_stock;
DROP TABLE IF EXISTS venta_detalle;
DROP TABLE IF EXISTS venta;
DROP TABLE IF EXISTS compra_detalle;
DROP TABLE IF EXISTS compra;
DROP TABLE IF EXISTS producto;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS proveedor;
DROP TABLE IF EXISTS categoria_producto;

CREATE TABLE categoria_producto (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL UNIQUE,
    descripcion TEXT
);

CREATE TABLE proveedor (
    cif TEXT PRIMARY KEY,
    nombre TEXT NOT NULL,
    telefono TEXT,
    email TEXT,
    ciudad TEXT,
    activo INTEGER NOT NULL DEFAULT 1 CHECK (activo IN (0,1))
);

CREATE TABLE cliente (
    dni TEXT PRIMARY KEY,
    nombre TEXT NOT NULL,
    telefono TEXT,
    email TEXT,
    ciudad TEXT,
    activo INTEGER NOT NULL DEFAULT 1 CHECK (activo IN (0,1))
);

CREATE TABLE producto (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    codigo TEXT NOT NULL UNIQUE,
    nombre TEXT NOT NULL,
    unidad_medida TEXT NOT NULL CHECK (unidad_medida IN ('kg','unidad','caja','bandeja')),
    precio_compra REAL NOT NULL CHECK (precio_compra >= 0),
    precio_venta REAL NOT NULL CHECK (precio_venta > 0),
    stock_actual REAL NOT NULL DEFAULT 0 CHECK (stock_actual >= 0),
    stock_minimo REAL NOT NULL DEFAULT 0 CHECK (stock_minimo >= 0),
    perecedero INTEGER NOT NULL DEFAULT 1 CHECK (perecedero IN (0,1)),
    activo INTEGER NOT NULL DEFAULT 1 CHECK (activo IN (0,1)),
    id_categoria INTEGER NOT NULL,
    cif_proveedor_principal TEXT,
    FOREIGN KEY (id_categoria) REFERENCES categoria_producto(id),
    FOREIGN KEY (cif_proveedor_principal) REFERENCES proveedor(cif)
);

CREATE TABLE compra (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    fecha TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
    numero_factura TEXT NOT NULL UNIQUE,
    cif_proveedor TEXT NOT NULL,
    subtotal REAL NOT NULL DEFAULT 0 CHECK (subtotal >= 0),
    iva REAL NOT NULL DEFAULT 0 CHECK (iva >= 0),
    total REAL NOT NULL DEFAULT 0 CHECK (total >= 0),
    estado TEXT NOT NULL DEFAULT 'registrada' CHECK (estado IN ('registrada','cancelada')),
    observaciones TEXT,
    FOREIGN KEY (cif_proveedor) REFERENCES proveedor(cif)
);

CREATE TABLE compra_detalle (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_compra INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    cantidad REAL NOT NULL CHECK (cantidad > 0),
    precio_unitario REAL NOT NULL CHECK (precio_unitario >= 0),
    descuento REAL NOT NULL DEFAULT 0 CHECK (descuento >= 0),
    total_linea REAL NOT NULL CHECK (total_linea >= 0),
    FOREIGN KEY (id_compra) REFERENCES compra(id) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES producto(id)
);

CREATE TABLE venta (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    fecha TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
    ticket TEXT NOT NULL UNIQUE,
    dni_cliente TEXT,
    metodo_pago TEXT NOT NULL CHECK (metodo_pago IN ('efectivo','tarjeta','bizum','transferencia')),
    subtotal REAL NOT NULL DEFAULT 0 CHECK (subtotal >= 0),
    descuento_total REAL NOT NULL DEFAULT 0 CHECK (descuento_total >= 0),
    iva REAL NOT NULL DEFAULT 0 CHECK (iva >= 0),
    total REAL NOT NULL DEFAULT 0 CHECK (total >= 0),
    estado TEXT NOT NULL DEFAULT 'cerrada' CHECK (estado IN ('cerrada','anulada')),
    FOREIGN KEY (dni_cliente) REFERENCES cliente(dni)
);

CREATE TABLE venta_detalle (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_venta INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    cantidad REAL NOT NULL CHECK (cantidad > 0),
    precio_unitario REAL NOT NULL CHECK (precio_unitario >= 0),
    descuento REAL NOT NULL DEFAULT 0 CHECK (descuento >= 0),
    total_linea REAL NOT NULL CHECK (total_linea >= 0),
    FOREIGN KEY (id_venta) REFERENCES venta(id) ON DELETE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES producto(id)
);

CREATE TABLE movimiento_stock (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    fecha TEXT NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id_producto INTEGER NOT NULL,
    tipo TEXT NOT NULL CHECK (tipo IN ('entrada_compra','salida_venta','ajuste')),
    cantidad REAL NOT NULL,
    referencia TEXT,
    observaciones TEXT,
    FOREIGN KEY (id_producto) REFERENCES producto(id)
);

CREATE INDEX idx_producto_categoria ON producto(id_categoria);
CREATE INDEX idx_producto_proveedor ON producto(cif_proveedor_principal);
CREATE INDEX idx_compra_proveedor ON compra(cif_proveedor);
CREATE INDEX idx_venta_cliente ON venta(dni_cliente);
CREATE INDEX idx_movimiento_producto ON movimiento_stock(id_producto);

CREATE TRIGGER trg_compra_detalle_ai
AFTER INSERT ON compra_detalle
BEGIN
    UPDATE producto
    SET stock_actual = stock_actual + NEW.cantidad
    WHERE id = NEW.id_producto;

    INSERT INTO movimiento_stock(id_producto, tipo, cantidad, referencia, observaciones)
    VALUES (NEW.id_producto, 'entrada_compra', NEW.cantidad, 'COMPRA-' || NEW.id_compra, 'Entrada por compra');
END;

CREATE TRIGGER trg_venta_detalle_ai
AFTER INSERT ON venta_detalle
BEGIN
    UPDATE producto
    SET stock_actual = stock_actual - NEW.cantidad
    WHERE id = NEW.id_producto;

    INSERT INTO movimiento_stock(id_producto, tipo, cantidad, referencia, observaciones)
    VALUES (NEW.id_producto, 'salida_venta', -NEW.cantidad, 'VENTA-' || NEW.id_venta, 'Salida por venta');
END;

CREATE TRIGGER trg_venta_no_stock
BEFORE INSERT ON venta_detalle
FOR EACH ROW
WHEN (SELECT stock_actual FROM producto WHERE id = NEW.id_producto) < NEW.cantidad
BEGIN
    SELECT RAISE(ABORT, 'Stock insuficiente para realizar la venta');
END;

CREATE VIEW vw_productos_bajo_stock AS
SELECT p.id, p.codigo, p.nombre, p.unidad_medida, p.stock_actual, p.stock_minimo
FROM producto p
WHERE p.stock_actual <= p.stock_minimo
ORDER BY p.stock_actual ASC, p.nombre ASC;

CREATE VIEW vw_resumen_ventas AS
SELECT v.id, v.ticket, v.fecha, COALESCE(c.nombre, 'Cliente ocasional') AS cliente,
       v.metodo_pago, v.total, v.estado
FROM venta v
LEFT JOIN cliente c ON c.dni = v.dni_cliente
ORDER BY v.fecha DESC;

CREATE VIEW vw_productos_catalogo AS
SELECT p.id, p.codigo, p.nombre, cp.nombre AS categoria, p.unidad_medida,
       p.precio_compra, p.precio_venta, p.stock_actual, p.stock_minimo,
       p.perecedero, p.activo, pr.nombre AS proveedor_principal
FROM producto p
JOIN categoria_producto cp ON cp.id = p.id_categoria
LEFT JOIN proveedor pr ON pr.cif = p.cif_proveedor_principal
ORDER BY cp.nombre, p.nombre;

INSERT INTO categoria_producto(nombre, descripcion) VALUES
('Fruta', 'Frutas frescas de temporada'),
('Verdura', 'Verduras y hortalizas frescas'),
('Frutos secos', 'Producto seco y envasado'),
('Complementos', 'Huevos, miel y otros productos');

INSERT INTO proveedor(cif, nombre, telefono, email, ciudad, activo) VALUES
('B12345678', 'Distribuciones Atlántico', '922111222', 'compras@atlantico.es', 'La Laguna', 1),
('B23456789', 'Huerta del Norte', '922333444', 'info@huertanorte.es', 'Tacoronte', 1),
('B34567890', 'Campo Fresco SL', '928555666', 'ventas@campofresco.es', 'Telde', 1);

INSERT INTO cliente(dni, nombre, telefono, email, ciudad, activo) VALUES
('11111111A', 'Ana Pérez', '600111111', 'ana@email.com', 'La Laguna', 1),
('22222222B', 'Luis Martín', '600222222', 'luis@email.com', 'Santa Cruz', 1),
('33333333C', 'María Díaz', '600333333', 'maria@email.com', 'La Orotava', 1);

INSERT INTO producto(codigo, nombre, unidad_medida, precio_compra, precio_venta, stock_actual, stock_minimo, perecedero, activo, id_categoria, cif_proveedor_principal) VALUES
('FRU-MAN-001', 'Manzana Golden', 'kg', 1.20, 2.35, 0, 15, 1, 1, 1, 'B12345678'),
('FRU-PLA-001', 'Plátano de Canarias', 'kg', 1.10, 2.10, 0, 20, 1, 1, 1, 'B12345678'),
('FRU-NAR-001', 'Naranja de zumo', 'kg', 0.95, 1.85, 0, 25, 1, 1, 1, 'B23456789'),
('VER-TOM-001', 'Tomate ensalada', 'kg', 1.35, 2.60, 0, 12, 1, 1, 2, 'B23456789'),
('VER-PAP-001', 'Papa bonita', 'kg', 0.80, 1.65, 0, 30, 1, 1, 2, 'B23456789'),
('SEC-ALM-001', 'Almendra cruda', 'kg', 6.00, 9.95, 0, 5, 0, 1, 3, 'B34567890'),
('COM-MIE-001', 'Miel de palma', 'unidad', 4.50, 7.90, 0, 4, 0, 1, 4, 'B34567890');

INSERT INTO compra(fecha, numero_factura, cif_proveedor, subtotal, iva, total, estado, observaciones) VALUES
('2026-04-18 08:30:00', 'FAC-2026-001', 'B12345678', 54.50, 3.82, 58.32, 'registrada', 'Compra semanal fruta'),
('2026-04-19 09:15:00', 'FAC-2026-002', 'B23456789', 73.00, 5.11, 78.11, 'registrada', 'Compra verdura'),
('2026-04-20 10:05:00', 'FAC-2026-003', 'B34567890', 57.00, 3.99, 60.99, 'registrada', 'Complementos y secos');

INSERT INTO compra_detalle(id_compra, id_producto, cantidad, precio_unitario, descuento, total_linea) VALUES
(1, 1, 20, 1.20, 0, 24.00),
(1, 2, 15, 1.10, 0, 16.50),
(1, 3, 15, 0.95, 0.25, 14.00),
(2, 4, 18, 1.35, 0, 24.30),
(2, 5, 60, 0.80, 0, 48.00),
(3, 6, 5, 6.00, 0, 30.00),
(3, 7, 6, 4.50, 0, 27.00);

INSERT INTO venta(fecha, ticket, dni_cliente, metodo_pago, subtotal, descuento_total, iva, total, estado) VALUES
('2026-04-21 11:10:00', 'TCK-2026-001', '11111111A', 'tarjeta', 13.55, 0.50, 0.00, 13.05, 'cerrada'),
('2026-04-21 13:20:00', 'TCK-2026-002', NULL, 'efectivo', 9.95, 0.00, 0.00, 9.95, 'cerrada'),
('2026-04-22 18:00:00', 'TCK-2026-003', '22222222B', 'bizum', 14.20, 0.20, 0.00, 14.00, 'cerrada');

INSERT INTO venta_detalle(id_venta, id_producto, cantidad, precio_unitario, descuento, total_linea) VALUES
(1, 1, 2, 2.35, 0.20, 4.50),
(1, 4, 1.5, 2.60, 0.30, 3.60),
(1, 7, 1, 7.90, 0.00, 7.90),
(2, 6, 1, 9.95, 0.00, 9.95),
(3, 2, 3, 2.10, 0.20, 6.10),
(3, 3, 2, 1.85, 0.00, 3.70),
(3, 5, 2.5, 1.65, 0.00, 4.20);
