# Examen / Práctica Evaluable: POO en Java (Usuario, Herencia, Composición y Gestión de Usuarios)

## 1. Contexto del examen

Se entrega un proyecto **Maven** con la estructura básica de paquetes:

- `com.docencia.examen.clases`
- `com.docencia.examen.herencia`
- `com.docencia.examen.composicion`
- Tests JUnit 5 ya preparados.

El objetivo del examen es comprobar que dominas:

- La implementación de **clases sencillas**.
- El uso correcto de la **herencia**.
- El uso de **composición** con listas de objetos.
- La **documentación** básica del código (Javadoc).
- El uso de **tests** como especificación del comportamiento.

---

## 2. Material entregado

En el proyecto encontrarás, al menos, las siguientes clases (algunas completas y otras parcialmente implementadas):

- `src/main/java/com/docencia/examen/clases/Usuario.java`
- `src/main/java/com/docencia/examen/herencia/Empleado.java`
- `src/main/java/com/docencia/examen/herencia/Directivo.java`
- `src/main/java/com/docencia/examen/composicion/Empresa.java`
- (Opcionalmente) una clase de gestión de usuarios: `GestorUsuarios` en el paquete indicado por el profesor.

Y los tests JUnit 5 preparados (no deben modificarse):

- `src/test/java/...` (ficheros de test indicados por el profesor).

Tu tarea consiste en **implementar o corregir** las clases indicadas para que el proyecto compile y el comportamiento sea el esperado según el enunciado y los tests.

---

## 3. Tareas a realizar (visión general)

Las tareas del examen se reparten en varios ejercicios:

1. **Ejercicio 1 – Clase `Usuario`**
2. **Ejercicio 2 – Clase `Empleado`**
3. **Ejercicio 3 – Clase `Directivo`**
4. **Ejercicio 4 – Clase `GestorUsuarios`**
5. **Ejercicio 5 – Clase `Empresa`**

En todos ellos se valorará:

- Que la clase **compile** sin errores.
- Que los constructores, getters, setters, `equals`, `hashCode` y `toString` funcionen de forma coherente.
- Que exista una **documentación básica** mediante comentarios Javadoc.

---

## 4. Rúbrica de evaluación

A continuación se detalla la rúbrica que se aplicará a cada ejercicio.  
En todos los casos, si la clase **no compila** o **no funciona mínimamente**, la puntuación del ejercicio será 0.

### Ejercicio 1 – Clase `Usuario`

- **No compila / No funciona**  
  → **0 puntos**

- **Implementa/corrige correctamente los constructores, getters/setters, `equals`/`hashCode` y `toString`**  
  → **0,5 puntos**

- **Documenta correctamente la clase** (Javadoc en clase, constructores y métodos principales)  
  → **1 puntos**

---

### Ejercicio 2 – Clase `Empleado`

- **No compila / No funciona**  
  → **0 puntos**

- **Implementa/corrige correctamente los constructores, getters/setters, `equals`/`hashCode` y `toString`**  
  → **0,5 puntos**

- **Documenta correctamente la clase** (explicando que hereda de `Usuario`, nuevos campos, etc.)  
  → **0,75 puntos**

---

### Ejercicio 3 – Clase `Directivo`

- **No compila / No funciona**  
  → **0 puntos**

- **Implementa/corrige correctamente los constructores, getters/setters, `equals`/`hashCode` y `toString`**  
  → **0,75 puntos**

- **Documenta correctamente la clase** (rol del directivo, campos añadidos, método `getSalarioTotal`, etc.)  
  → **1,25 puntos**

---

### Ejercicio 4 – Clase `GestorUsuarios`

> Nota: esta clase es una capa de **gestión** sobre usuarios (y/o empleados), donde se centralizan operaciones sobre una colección interna (lista, mapa, etc.), tales como alta, baja, búsqueda, listado, etc. La implementación concreta se detalla en el enunciado que acompañará al examen.

- **No compila / No funciona**  
  → **0 puntos**

- **Implementa/corrige correctamente entre el 50%>x>99% de los métodos de la clase**  
  → **2 puntos**

- **Implementa/corrige correctamente el 100% de los métodos de la clase**  
  → **3 puntos**

- **Documenta correctamente la clase** (propósito general, descripción de los métodos principales)  
  → **3,5 puntos**

---

### Ejercicio 5 – Clase `Empresa`

La clase `Empresa` representa una empresa que compone:

- Un director general (`Directivo`).
- Una colección de empleados (`List<Empleado>`).

Y expone métodos para:

- Añadir empleados.
- Consultar el número de empleados.
- Buscar y eliminar por identificador.
- Obtener una copia de la lista.
- Mostrar un resumen textual (`toString`).

La rúbrica para este ejercicio es:

- **No compila / No funciona**  
  → **0 puntos**

- **Implementa/corrige correctamente entre el 50%>x>99% de los métodos de la clase**  
  → **2 puntos**

- **Implementa/corrige correctamente el 100% de los métodos de la clase**  
  → **3 puntos**

- **Documenta correctamente la clase** (qué representa, relación con `Empleado` y `Directivo`, descripción de métodos)  
  → **3,5 puntos**

---

## 5. Indicaciones finales

- No se deben modificar los **ficheros de test** proporcionados.
- Se recomienda compilar y ejecutar los tests periódicamente:

```bash
mvn clean test
```

- La calificación final se obtendrá aplicando la rúbrica anterior sobre el trabajo realizado en el tiempo del examen.
- Se valorará de forma positiva:
  - Código claro y legible.
  - Uso razonable de comentarios Javadoc.
  - Nombres de clases, atributos y métodos significativos.

> Recuerda: el objetivo no es solo que “compile”, sino que el código sea **correcto, coherente y mantenible**.
