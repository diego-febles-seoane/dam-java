PRAGMA foreign_keys = ON;

DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS clase;
DROP TABLE IF EXISTS socio;
DROP TABLE IF EXISTS monitor;

CREATE TABLE monitor (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    dni TEXT NOT NULL UNIQUE,
    nombre TEXT NOT NULL,
    especialidad TEXT NOT NULL,
    activo INTEGER NOT NULL DEFAULT 1 CHECK (activo IN (0,1))
);

CREATE TABLE socio (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    dni TEXT NOT NULL UNIQUE,
    nombre TEXT NOT NULL,
    email TEXT,
    telefono TEXT,
    plan TEXT NOT NULL CHECK (plan IN ('basic','premium','vip')),
    activo INTEGER NOT NULL DEFAULT 1 CHECK (activo IN (0,1))
);

CREATE TABLE clase (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    tipo TEXT NOT NULL,
    horario TEXT NOT NULL,
    cupo_maximo INTEGER NOT NULL CHECK (cupo_maximo > 0),
    plazas_disponibles INTEGER NOT NULL CHECK (plazas_disponibles >= 0),
    activa INTEGER NOT NULL DEFAULT 1 CHECK (activa IN (0,1)),
    id_monitor INTEGER NOT NULL,
    FOREIGN KEY (id_monitor) REFERENCES monitor(id)
);

CREATE TABLE reserva (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    fecha TEXT NOT NULL,
    estado TEXT NOT NULL CHECK (estado IN ('reservada','cancelada','asistida')),
    id_socio INTEGER NOT NULL,
    id_clase INTEGER NOT NULL,
    FOREIGN KEY (id_socio) REFERENCES socio(id),
    FOREIGN KEY (id_clase) REFERENCES clase(id)
);

INSERT INTO monitor(id, dni, nombre, especialidad, activo) VALUES
(1, '11111111A', 'Laura Coach', 'Yoga', 1),
(2, '22222222B', 'Pablo Fit', 'Spinning', 1),
(3, '33333333C', 'Marta Power', 'Crossfit', 1);

INSERT INTO socio(id, dni, nombre, email, telefono, plan, activo) VALUES
(1, '44444444D', 'Ana Ruiz', 'ana@gym.com', '600111111', 'premium', 1),
(2, '55555555E', 'Luis Vega', 'luis@gym.com', '600222222', 'basic', 1),
(3, '66666666F', 'Carla Sol', 'carla@gym.com', '600333333', 'vip', 0);

INSERT INTO clase(id, nombre, tipo, horario, cupo_maximo, plazas_disponibles, activa, id_monitor) VALUES
(1, 'Yoga Manana', 'yoga', '2026-05-01 09:00:00', 20, 5, 1, 1),
(2, 'Spinning Tarde', 'spinning', '2026-05-01 18:00:00', 15, 0, 1, 2),
(3, 'Crossfit Pro', 'crossfit', '2026-05-02 19:00:00', 12, 2, 1, 3),
(4, 'Pilates Suave', 'pilates', '2026-05-03 10:00:00', 18, 8, 0, 1);

INSERT INTO reserva(id, fecha, estado, id_socio, id_clase) VALUES
(1, '2026-04-20 10:00:00', 'reservada', 1, 1),
(2, '2026-04-20 10:15:00', 'asistida', 2, 2),
(3, '2026-04-21 11:00:00', 'cancelada', 1, 3);
