<div align="justify">

# Java — Herencia, Interfaces y Colecciones 


<div align="center">
  <img src=images/alumno-dam.png width="350">
</div>

Este ejercicio esta pensado para **practicar paso a paso**:
- **LocalDate + LocalTime**
- **Expresiones Regulares**
- **Composiciones de clases**.

Incluye **tests unitarios (JUnit 5)** y **JaCoCo** para cobertura.  
Además, el proyecto **genera una nota sobre 10** en función de los tests que vayan pasando, para que puedas vet como es tu evolución.

---

## Estructura del proyecto

### Código principal
- `src/main/java/com/docencia/expresiones/ejercicio1..10`
- `src/main/java/com/docencia/fecha/ejercicio1..10`
- `src/main/java/com/docencia/clases/ejercicio1..5`

> En cada paquete `...ejercicioX` encontrarás:
- Clases del dominio (por ejemplo `Persona/Alumno/Profesor`, `Vehiculo/Coche/Motocicleta`, etc.)
- En ejercicios de colecciones: una clase “gestora” tipo `ListaX`, `ConjuntoX` o `MapaX`

### Tests
- `src/test/java/com/docencia/expresiones/ejercicio1..10`
- `src/test/java/com/docencia/fecha/ejercicio1..10`
- `src/test/java/com/docencia/clases/ejercicio1..5`

---

## Orden recomendado para la resolución del ejercicio

- Expresiones `La descripción de cada ejercicio esta dentro de la clase`
- Fechas `La descripción de cada ejercicio esta dentro de la clase`
- Clases `Se detallan a continuación`

### Ejercicio 1 – RegistroUsuario

#### Descripción
Validar los datos necesarios para registrar un usuario en una aplicación.

#### Campos
- Email
- Contraseña
- Teléfono
- Fecha de nacimiento
- Fecha de registro (se genera automáticamente)

#### Reglas funcionales
- El email debe tener un formato válido
- La contraseña debe considerarse segura
- El teléfono debe ser un teléfono español
- La fecha de nacimiento no puede ser futura
- El usuario debe cumplir una edad mínima (14 o 18 años)

#### Ejemplos válidos
- Email: `ana.lopez@gmail.com`
- Contraseña: `Abcd1234`
- Teléfono: `+34600111222`
- Fecha nacimiento: `2000-05-10`

#### Ejemplos incorrectos
- Email: `ana..gmail.com`
- Contraseña: `abcd1234`
- Teléfono: `600111222`
- Fecha nacimiento: `2030-01-01`

---

### Ejercicio 2 – ReservaHotel

#### Descripción
Gestionar una reserva de hotel validando datos personales y fechas.

#### Campos
- Código de reserva
- DNI
- Fecha de entrada (check-in)
- Fecha de salida (check-out)

#### Reglas funcionales
- El código de reserva debe seguir un formato estructurado
- El DNI debe ser válido
- La fecha de salida debe ser posterior a la de entrada
- La reserva solo puede cancelarse hasta 2 días antes del check-in

#### Ejemplos válidos
- Código: `RES-2026-ABC`
- DNI: `12345678Z`
- Check-in: `2026-06-10`
- Check-out: `2026-06-15`

#### Ejemplos incorrectos
- Código: `RES26ABC`
- DNI: `12345678A`
- Check-in: `2026-06-10`
- Check-out: `2026-06-09`

---

### Ejercicio 3 – Factura

#### Descripción
Validar una factura y determinar su estado de vencimiento.

#### Campos
- Número de factura
- IBAN
- NIF de la empresa
- Fecha de emisión
- Fecha de vencimiento

#### Reglas funcionales
- Los identificadores deben tener un formato válido
- La fecha de vencimiento no puede ser anterior a la de emisión
- Una factura está vencida si la fecha actual es posterior a la de vencimiento

#### Ejemplos válidos
- Factura: `FAC-2026-000123`
- IBAN: `ES6621000418401234567891`
- NIF empresa: `B1234567X`
- Emisión: `2026-02-01`
- Vencimiento: `2026-03-03`

#### Ejemplos incorrectos
- Factura: `FAC-26-123`
- IBAN: `ES66-INVALID`
- NIF empresa: `12345678Z`
- Vencimiento: `2026-01-31`

---

### Ejercicio 4 – TarjetaEmbarque

#### Descripción
Validar una tarjeta de embarque y comprobar si se puede embarcar.

#### Campos
- Código de tarjeta
- Fecha del vuelo
- Hora de salida

#### Reglas funcionales
- El código debe tener un formato válido
- La fecha del vuelo no puede ser pasada
- El embarque solo es posible dentro de una ventana previa a la salida
- La ventana puede cruzar medianoche

#### Ejemplos válidos
- Código: `BP-IB-2026-A1B2C3`
- Fecha vuelo: `2026-02-02`
- Hora salida: `12:00`
##### Ejemplos incorrectos
- Código: `BP-IB-26-A1`
- Fecha vuelo: `2025-12-01`
- Hora fuera de ventana de embarque

---

### Ejercicio 5 – TurnoEmpleado

#### Descripción
Gestionar turnos laborales con horas que pueden cruzar medianoche.

#### Campos
- Identificador de empleado
- Día
- Hora de inicio
- Hora de fin

#### Reglas funcionales
- El identificador del empleado debe tener un formato válido
- Un turno no puede ser vacío
- Si la hora de fin es anterior a la de inicio, el turno cruza medianoche
- Debe cumplirse un descanso mínimo entre turnos

#### Ejemplos válidos
- Empleado: `EMP-00001`
- Día: `2026-02-02`
- Inicio: `22:00`
- Fin: `06:00`

#### Ejemplos incorrectos
- Empleado: `EMP-1`
- Inicio: `09:00`
- Fin: `09:00`

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
<div align="justify">
