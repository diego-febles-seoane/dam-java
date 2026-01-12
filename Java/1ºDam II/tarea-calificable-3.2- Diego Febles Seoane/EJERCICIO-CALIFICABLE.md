<div style="text-align: justify;">

# Ejercicios del ejercicio calificable 3.2

<div style="text-align: center;">
  <img src="images/lisa-repaso.jpg" width="300">
</div>


## Ejecutar los tests

Si quieres ver cómo funcionan los tests, ejecuta en el directorio del proyecto:

<img src="images/ls-la.png" width="300">

Ejecuta:

```bash
mvn clean test
```

<img src="images/test-error.png" width="300">


Puedes ir ejecutando los tests de cada ejercicio:

<img src="images/test-ejercicio.png" width="300">

## 0) Antes de Comenzar

**NORMALIZADO** -> Se eliminan espacios, etc.


## 1) Ejercicio sobre clases (`com.docencia.clases`)

En cada ejercicio hay una clase del dominio con:

- constructor vacío
- constructor con identificador único
- `equals`, `hashCode` y `toString`

- **Ejercicio 10**: implementar `equals/hashCode/toString` en `Mascota` usando `chip` como identificador único.

> **IMPORTANTE**: puede parecer repetitivo (y lo es), pero `constructores/getters/setters/equals/hashCode/toString` es una base fundamental en **Java**.

## 2) Bucles `for` sobre arrays (`com.docencia.arrays`)

- **Ejercicio 7**: `sonIguales(int[] array1, int[] array2)` → Devuelve `true` si ambos arrays tienen la misma longitud y mismos valores en cada posición.


## 3) Ejercicio sobre listas (`com.docencia.listas`)

### Ejercicio 16

#### Listas — Sumar longitudes de cadenas no vacías (`com.docencia.listas.ejercicio16.Ejercicio16`)

- Clase: `com.docencia.listas.ejercicio16.Ejercicio16`
- Método:
  ```java
  public static int sumarLongitudesNoVacias(java.util.List<String> textos)
  ```
- Enunciado:  
  Sumar la longitud de todas las cadenas **no nulas y no en blanco**.  
  Si lista `null` o sin cadenas válidas → `0`.

## 4) Ejercicio sobre herencia (`com.docencia.herencia`)

### Herencia — Documentos y descripción (`com.docencia.herencia.ejercicio14.Ejercicio14`)

Implementar una jerarquía simple de documentos y una funcionalidad común para obtener sus descripciones,
aplicando **programación defensiva** ante datos inválidos.

- Jerarquía:
  - `Documento` (abstracta) — título → `String descripcion()`.
    - Si `titulo` es `null` o `vacío` → lanzar `IllegalArgumentException`
  - `Informe` — páginas
    - Si `paginas <= 0` → lanzar `IllegalArgumentException`
    - 'String descripcion()'. Debe devolver una descripción que incluya el título y el número de páginas  
      (el formato exacto será el verificado por los tests).
  - `Carta` — destinatario
    - Si `destinatario` es `null` o `vacío` → lanzar `IllegalArgumentException`
    - `String descripcion()`. Debe devolver una descripción que incluya el título y el destinatario  
      (el formato exacto será el verificado por los tests).

| Tipo | Condición | Formato exacto de `descripcion()` | Ejemplo (según tests) |
|------|-----------|----------------------------------|------------------------|
| **Carta** | Siempre | `Carta: <TITULO_NORMALIZADO> \| Para: <DESTINATARIO_NORMALIZADO>` | `Carta: Mi carta \| Para: Ana` |
| **Informe** | Siempre | `Informe: <TITULO_NORMALIZADO> (<PAGINAS> páginas)` | `Informe: Informe trimestral (12 páginas)` |


---

## 5) Ejercicio sobre composición (`com.docencia.composicion`)

#### Composición — Inventario de productos (`com.docencia.composicion.ejercicio9.Ejercicio9`)

- Clases:
  - `Producto` — nombre.
  - `LineaInventario` — producto y cantidad.
  - `Inventario` — lista de líneas.
- Funcionalidad:
  - `void anadirStock(String nombreProducto, int cantidad)` → solo si nombre válido y cantidad > 0; si existe producto (nombre case-insensitive + `trim`) suma stock, si no crea nueva línea.
  - `boolean retirarStock(String nombreProducto, int cantidad)` → retira si hay stock suficiente y datos válidos.
  - `int stockDe(String nombreProducto)` → stock del producto (si nombre inválido/no existe → `0`).
  - `int totalUnidades()` → suma de cantidades de todas las líneas.

</div>
