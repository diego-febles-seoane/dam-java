<div align="justify">

# Java — Herencia, Interfaces y Colecciones 


<div align="center">
  <img src=images/alumno-dam.png width="350">
</div>

Este ejercicio esta pensado para **practicar paso a paso**:
- **Herencia + clases abstractas**
- **Interfaces**
- **Colecciones**: `ArrayList`, `HashSet`, `HashMap`

Incluye **tests unitarios (JUnit 5)** y **JaCoCo** para cobertura.  
Además, el proyecto **genera una nota sobre 10** en función de los tests que vayan pasando, para que puedas vet como es tu evolución.

---

## Estructura del proyecto

### Código principal
- `src/main/java/com/docencia/herencia/ejercicio1..10`
- `src/main/java/com/docencia/interfaces/ejercicio1..10`
- `src/main/java/com/docencia/listas/ejercicio1..10`
- `src/main/java/com/docencia/sets/ejercicio1..10`
- `src/main/java/com/docencia/maps/ejercicio1..10`

> En cada paquete `...ejercicioX` encontrarás:
- Clases del dominio (por ejemplo `Persona/Alumno/Profesor`, `Vehiculo/Coche/Motocicleta`, etc.)
- En ejercicios de colecciones: una clase “gestora” tipo `ListaX`, `ConjuntoX` o `MapaX`

### Tests
- `src/test/java/com/docencia/herencia/ejercicio1..10`
- `src/test/java/com/docencia/interfaces/ejercicio1..10`
- `src/test/java/com/docencia/listas/ejercicio1..10`
- `src/test/java/com/docencia/sets/ejercicio1..10`
- `src/test/java/com/docencia/maps/ejercicio1..10`
- `src/test/java/com/docencia/colecciones/ejercicio1..10` *(si existe)*

---

## Orden recomendado para la resolución del ejercicio

### 1) Herencia (abstractas) — `com.docencia.herencia.ejercicio1..10`
**Objetivo:** entender atributos comunes en la clase base, constructores, sobrescritura y polimorfismo.

Sugerencia de enfoque:
- Implementar constructores y validaciones básicas
- Implementar métodos abstractos en hijas
- Implementar `equals/hashCode/toString` 

> **Nota**: Esto ya sabes hacerlo.


### 2) Interfaces — `com.docencia.interfaces.ejercicio1..10`
**Objetivo:** distinguir herencia vs contratos, `default methods`, y polimorfismo por interfaz. En este caso debes de implementar nuevamente lo realizado en el punto anterior e implementar los métodos en `las clases que implementan las interfaces`.

### 3) Listas (ArrayList) — `com.docencia.listas.ejercicio1..10`
**Objetivo:** `CRUD` (``Crear/Leer/Actualizdar/Borrar)sobre listas:
- `anadir`
- `buscarPorId`
- `eliminarPorId`
- `modificar`
- `listar`
- `tamanio`

Reglas típicas son:
- No se permiten elementos `null`
- No se permiten campos `vacíos` (por ejemplo `nombre` en blanco)
- No se permiten IDs `null`
- No se permiten IDs duplicados

<div align="center">
  <img src=images/desarrollo.png width="350">
</div>

### 4) Sets (HashSet) — `com.docencia.sets.ejercicio1..10`
**Objetivo:** unicidad (sin duplicados) y operaciones típicas del conjunto. 
> **Observa:**. Mismos operaciones que en los ejercicios de `listas`, y evitar nulos, etc.

### 5) Maps (HashMap) — `com.docencia.maps.ejercicio1..10`
**Objetivo:** búsquedas por clave (`UUID`) eficientes y operaciones típicas del mapa.
> **Observa:**. Mismos operaciones que en los ejercicios de `listas`, y evitar nulos, etc.

---

## Cómo ejecutar

### Ejecutar tests
```bash
mvn clean test
```

### Ejecutar verificación completa (incluye JaCoCo + nota)
```bash
 mvn clean -Pcalificar verify
```

#### Cobertura en el comienzo del desarrollo

<div align="center">
  <img src=images/jacoco-inicio.png width="350">
</div>

#### Cobertura al final el ejercicio

<div align="center">
  <img src=images/jacoco-objetivo.png width="350">
</div>

---

## Auto-cálculo de nota (progreso)

El proyecto genera un fichero:
- `target/nota.txt`

La nota se calcula **proporcionalmente** a los tests que pasan:

**`notaSobre10 = 10 * (testsPasados / testsTotales)`**

Esto permite que veas tu evolución:
- Al principio muchos tests fallan (nota baja) ` **1.14**`
- Conforme implementa métodos, pasan más tests y la nota sube
- Si pasan todos, la nota llega a **10.00**


### Algo que debes de recordar

- se ejecute el cálculo de nota **aunque fallen tests**
- se genere `target/nota.txt` en cada `mvn clean -Pcalificar verify`

---

## Notas a tener en cuenta

Durante el inicio, es normal que existan métodos sin implementar que lancen:

```java
throw new UnsupportedOperationException("El metodo no esta implementado");
```

porque son de las cosas que debes de implementar.

Esto te permite:
- Compilar el proyecto desde el minuto 1
- Ir implementando por fases, descritas al inicio del documento
- Ver cómo sube la nota conforme pasan más tests

---

## Flujo de trabajo (alumno/a)
1. Ejecuta `mvn clean -Pcalificar verify`
2. Abre el reporte de fallos y resuelve por orden:
   - constructores y validación
   - métodos de negocio
   - `equals/hashCode/toString`
   - colecciones (`anadir`, `buscarPorId`, `eliminarPorId`, `modificar`)
3. Ejecuta `mvn verify` para ver:
   - cobertura (JaCoCo)
   - nota (target/nota.txt)

---
<div align="justify">
