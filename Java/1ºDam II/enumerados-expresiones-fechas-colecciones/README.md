# Proyecto de Practicas Java (Alumnado)

Este proyecto contiene ejercicios de:
- Enumerados
- Expresiones regulares
- Fechas (java.time)
- Colecciones (List, Set, Map) y herencia

## Instrucciones generales
- **NO modifiques los tests**
- Implementa los metodos marcados con `TODO`
- Ejecuta los tests con:

```bash
mvn test
```

La nota se mostrara automaticamente al final.

---

## Bloque 1: Enumerados
Paquete: `com.docencia.enumerados.ejercicioX`

En cada ejercicio:
- Hay un `enum`
- Hay una clase que usa ese enum
- Debes implementar la logica indicada en los metodos `TODO`

---

## Bloque 2: Expresiones regulares
Paquete: `com.docencia.expresionesregulares.ejercicioX`

Debes:
- Definir correctamente el `Pattern`
- Hacer que los metodos `esValido`, `extraer`, etc. cumplan lo que indican los tests

---

## Bloque 3: Fechas (java.time)
Paquete: `com.docencia.fechas.ejercicioX`

Debes usar correctamente:
- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `ZonedDateTime`
- `Instant`
- `Period`
- `Duration`

Los tests indican el comportamiento esperado.

---

## Bloque 4: Colecciones y herencia
Paquete: `com.docencia.colecciones.ejercicioX`

Debes:
- Usar correctamente List, Set y Map
- Aplicar herencia y polimorfismo
- Implementar la logica pedida en cada metodo

---

## Documentacion
Puedes verificar la generacion de JavaDoc con:

```bash
mvn -Pverificar-docs test
```

---

## Evaluacion
- 70% tests superados
- 30% cobertura JaCoCo
