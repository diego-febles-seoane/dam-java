# Proyecto de prácticas: Listas, Composición y Herencia en Java

Proyecto Maven para practicar:

- Métodos de listas (`List`, `ArrayList`)
- Composición de clases
- Herencia y polimorfismo

Cada ejercicio está en su **propio paquete**:

- `com.docencia.listas.ejercicio01` … `com.docencia.listas.ejercicio10`
- `com.docencia.composicion.ejercicio11` … `com.docencia.composicion.ejercicio20`
- `com.docencia.herencia.ejercicio21` … `com.docencia.herencia.ejercicio30`

Los ejercicios **no están resueltos**.  
Los de listas (1–10) tienen **tests JUnit** que fallarán hasta que implementes la lógica.  
Los de composición y herencia tienen solo la **estructura vacía**, para que tú diseñes las clases y métodos.

---

## Bloque A: Listas (`com.docencia.listas`)

### Ejercicio 01 – Máximo, mínimo y eliminar negativos

Paquete: `com.docencia.listas.ejercicio01`  
Clase: `Ejercicio01`

Implementa métodos:

- `int maximo(List<Integer> numeros)`
- `int minimo(List<Integer> numeros)`
- `void eliminarNegativos(List<Integer> numeros)`

Suposiciones: la lista no está vacía.

---

### Ejercicio 02 – Gestor de tareas simple

Paquete: `com.docencia.listas.ejercicio02`  
Clase: `Ejercicio02.GestorTareas`

Implementa:

- `void agregarTarea(String tarea)`
- `List<String> getTareas()` – devuelve una vista de solo lectura o copia
- `String completarTarea(int indice)` – devuelve y elimina la tarea en ese índice
- `void borrarTodas()` – elimina todas las tareas

---

### Ejercicio 03 – Eliminar duplicados

Paquete: `com.docencia.listas.ejercicio03`  
Clase: `Ejercicio03`

Implementa:

- `List<Integer> sinDuplicados(List<Integer> original)`

Devuelve una nueva lista sin elementos repetidos, manteniendo el **orden de primera aparición**, sin usar `Set`.

---

### Ejercicio 04 – Buscar y reemplazar nombres

Paquete: `com.docencia.listas.ejercicio04`  
Clase: `Ejercicio04`

Implementa:

- `void reemplazar(List<String> nombres, String antiguo, String nuevo)`

Reemplaza **todas** las apariciones de `antiguo` por `nuevo` en la lista.

---

### Ejercicio 05 – Invertir una lista

Paquete: `com.docencia.listas.ejercicio05`  
Clase: `Ejercicio05`

Implementa:

- `void invertir(List<String> lista)`

Invierte la lista **in place**, sin crear otra lista.

---

### Ejercicio 06 – Filtrar mayores que

Paquete: `com.docencia.listas.ejercicio06`  
Clase: `Ejercicio06`

Implementa:

- `List<Integer> filtrarMayoresQue(List<Integer> lista, int limite)`

Devuelve una nueva lista solo con los elementos estrictamente mayores que `limite`.

---

### Ejercicio 07 – Ordenar con y sin `Collections.sort`

Paquete: `com.docencia.listas.ejercicio07`  
Clase: `Ejercicio07`

Implementa:

- `void ordenarConSort(List<Integer> lista)` – usar `Collections.sort`
- `void ordenarSinSort(List<Integer> lista)` – ordenar sin `Collections.sort` (por ejemplo, burbuja) usando solo métodos de `List`.

Ambas dejan la lista ordenada de menor a mayor.

---

### Ejercicio 08 – Particionar en pares e impares

Paquete: `com.docencia.listas.ejercicio08`  
Clase: `Ejercicio08` con clase interna `ResultadoParticion`

Implementa:

- `ResultadoParticion partir(List<Integer> lista)`

donde `ResultadoParticion` contiene:

- `List<Integer> getPares()`
- `List<Integer> getImpares()`

---

### Ejercicio 09 – Sublista (paginación)

Paquete: `com.docencia.listas.ejercicio09`  
Clase: `Ejercicio09`

Implementa:

- `List<String> pagina(List<String> elementos, int numeroPagina, int tamanoPagina)`

Convención:

- `numeroPagina` empieza en **1**.
- Página 1 → elementos 0..tamano-1
- Si `numeroPagina` es demasiado grande, devuelve lista vacía.

---

### Ejercicio 10 – Rotar una lista

Paquete: `com.docencia.listas.ejercicio10`  
Clase: `Ejercicio10`

Implementa:

- `void rotar(List<Integer> lista, int k)`

Rota la lista **k posiciones a la derecha**, usando solo operaciones de lista.  
Ejemplo: `[1,2,3,4,5]` con `k = 2` → `[4,5,1,2,3]`.

---

## Bloque B: Composición (`com.docencia.composicion`)

En este bloque tienes solo una clase `EjercicioXX` vacía por paquete, con comentarios `TODO`.  
Debes diseñar tú las clases de dominio (atributos, constructores, métodos, etc.).

### Ejercicio 11 – Clase `Direccion` en `Persona`

Paquete: `com.docencia.composicion.ejercicio11`

Crea las clases:

- `Direccion` (calle, ciudad, codigoPostal)
- `Persona` (nombre, edad, direccion)

Implementa métodos, por ejemplo:

- Devolver la dirección formateada.
- Obtener una lista de personas que viven en una ciudad concreta.

---

### Ejercicio 12 – `Pedido` y `LineaPedido`

Paquete: `com.docencia.composicion.ejercicio12`

Diseña:

- `Producto` (nombre, precio)
- `LineaPedido` (producto, cantidad)
- `Pedido` (lista de lineas)

Métodos sugeridos:

- `double calcularTotal()`
- Aplicar un descuento global al total.

---

### Ejercicio 13 – Biblioteca y libros

Paquete: `com.docencia.composicion.ejercicio13`

Diseña:

- `Libro` (título, autor, año)
- `Biblioteca` (lista de libros)

Métodos sugeridos:

- `agregarLibro(Libro libro)`
- `List<Libro> buscarPorAutor(String autor)`
- `boolean eliminarLibroPorTitulo(String titulo)`

---

### Ejercicio 14 – Universidad con facultades y estudiantes

Paquete: `com.docencia.composicion.ejercicio14`

Diseña:

- `Estudiante` (id, nombre, etc.)
- `Facultad` (lista de estudiantes)
- `Universidad` (lista de facultades)

Métodos sugeridos:

- Obtener lista de todos los estudiantes.
- Buscar un estudiante por id en toda la universidad.

---

### Ejercicio 15 – Carrito de compra

Paquete: `com.docencia.composicion.ejercicio15`

Diseña:

- `Producto` (id, nombre, precio)
- `Carrito` (lista de productos)

Métodos sugeridos:

- Añadir producto.
- Eliminar producto por id.
- Calcular total.
- Contar cuántos productos hay de un cierto nombre.

---

### Ejercicio 16 – Agenda de contactos con teléfonos

Paquete: `com.docencia.composicion.ejercicio16`

Diseña:

- `Telefono` (tipo, número)
- `Contacto` (nombre, lista de teléfonos)
- `Agenda` (lista de contactos)

Métodos sugeridos:

- Añadir teléfono a un contacto.
- Borrar teléfonos de cierto tipo.
- Buscar contacto por nombre.
- Buscar contacto por número.

---

### Ejercicio 17 – Empresa con empleados y proyectos

Paquete: `com.docencia.composicion.ejercicio17`

Diseña:

- `Proyecto` (nombre, presupuesto)
- `Empleado` (nombre, salario, proyectos en los que participa)
- `Empresa` (lista de empleados)

Métodos sugeridos:

- Coste total de salarios de empleados de un proyecto concreto.
- Lista de proyectos únicos de la empresa.

---

### Ejercicio 18 – Carta de restaurante

Paquete: `com.docencia.composicion.ejercicio18`

Diseña:

- `Plato` (nombre, precio, esVegetariano)
- `Categoria` (nombre, lista de platos)
- `Carta` (lista de categorías)

Métodos sugeridos:

- Lista de todos los platos vegetarianos.
- Buscar platos por rango de precio.

---

### Ejercicio 19 – Sistema de biblioteca con préstamos

Paquete: `com.docencia.composicion.ejercicio19`

Diseña:

- `Libro`
- `Usuario`
- `Prestamo`
- `GestorPrestamos` (lista de préstamos)

Métodos sugeridos:

- Ver todos los préstamos activos de un usuario.
- Ver todos los usuarios que tienen un libro concreto.

---

### Ejercicio 20 – Clínica veterinaria

Paquete: `com.docencia.composicion.ejercicio20`

Diseña:

- `Mascota` (nombre, especie)
- `Cita` (fecha, motivo, mascota)
- `Clinica` (lista de citas)

Métodos sugeridos:

- Obtener citas de una mascota.
- Obtener citas por fecha.

---

## Bloque C: Herencia (`com.docencia.herencia`)

También hay una clase `EjercicioXX` por paquete con comentarios `TODO`.  
Debes definir tú las clases base, subclases y métodos polimórficos.

### Ejercicio 21 – Figuras geométricas

Paquete: `com.docencia.herencia.ejercicio21`

Diseña:

- `Figura` (abstracta) con `double area()`.
- Subclases `Circulo`, `Rectangulo`, `Triangulo`.

Crea una colección de figuras y calcula el área total.

---

### Ejercicio 22 – Empleados de una empresa

Paquete: `com.docencia.herencia.ejercicio22`

Diseña:

- `Empleado` (base) con método `double calcularSueldo()`.
- Subclases `EmpleadoPorHoras`, `EmpleadoFijo`.

Trabaja con una lista polimórfica para calcular la nómina total.

---

### Ejercicio 23 – Vehículos

Paquete: `com.docencia.herencia.ejercicio23`

Diseña:

- `Vehiculo` (marca, modelo) con método `String descripcion()`.
- Subclases `Coche`, `Moto`, `Camion` que sobrescriban `descripcion()`.

---

### Ejercicio 24 – Sistema de notificaciones

Paquete: `com.docencia.herencia.ejercicio24`

Diseña:

- `Notificacion` (abstracta) con `void enviar()`.
- Subclases `EmailNotificacion`, `SMSNotificacion`, `PushNotificacion`.

---

### Ejercicio 25 – Animales y sonidos

Paquete: `com.docencia.herencia.ejercicio25`

Diseña:

- `Animal` con método `String hacerSonido()`.
- Subclases `Perro`, `Gato`, `Vaca`, etc.

---

### Ejercicio 26 – Productos digitales y físicos

Paquete: `com.docencia.herencia.ejercicio26`

Diseña:

- `Producto` base (id, nombre, precioBase) con `double calcularPrecioFinal()`.
- `ProductoFisico` y `ProductoDigital`.

---

### Ejercicio 27 – Cuenta bancaria

Paquete: `com.docencia.herencia.ejercicio27`

Diseña:

- `CuentaBancaria` con `depositar` y `retirar`.
- `CuentaAhorro` y `CuentaCorriente` con comportamientos diferentes en `retirar`.

---

### Ejercicio 28 – Formas de pago

Paquete: `com.docencia.herencia.ejercicio28`

Diseña:

- `Pago` (abstracta) con `procesarPago(double cantidad)`.
- Subclases `PagoTarjeta`, `PagoPayPal`, `PagoTransferencia`.

---

### Ejercicio 29 – Sistema de roles de usuario

Paquete: `com.docencia.herencia.ejercicio29`

Diseña:

- `Usuario` base (nombre, email) con `List<String> accionesDisponibles()`.
- Subclases `Admin`, `Moderador`, `UsuarioNormal`.

---

### Ejercicio 30 – Combinar listas + herencia

Paquete: `com.docencia.herencia.ejercicio30`

Utiliza las figuras del ejercicio 21:

- Clase `GrupoFiguras` que contiene `List<Figura>`.
- Método `double areaTotal()` para cada grupo.
- Lista de grupos para sumar todas las áreas.

---

## Tests

En `src/test/java` hay una clase de test por ejercicio de listas, siguiendo la misma estructura de paquetes.

Por ejemplo:
- `com.docencia.listas.ejercicio01.Ejercicio01Test`
- `com.docencia.listas.ejercicio02.Ejercicio02Test`
...
- `com.docencia.listas.ejercicio10.Ejercicio10Test`

Cada test comprueba el comportamiento esperado del ejercicio correspondiente.  
**Todos fallarán** al principio porque los métodos lanzan `UnsupportedOperationException`.  
A medida que implementes cada ejercicio, los tests correspondientes empezarán a pasar.

Para los bloques de composición y herencia puedes crear tus propios tests siguiendo el mismo estilo.
