# Docencia Programacion - 40 Ejercicios en Java (Ejercicio1 ... Ejercicio40)

Paquete base: `com.docencia.programacion`  
Java: 17  
Build: Maven  
Tests: JUnit 5

Para comprobar tu codigo ejecuta:

```bash
mvn clean test
```

Muy importante: en las pruebas unitarias el primer metodo de cada clase de test comprueba siempre casos nulos / vacios / en blanco. Esto es para que adoptes la buena practica de validar entrada antes de hacer logica.

Cada ejercicio esta numerado y corresponde a una clase Java con el mismo numero: `Ejercicio1`, `Ejercicio2`, ... `Ejercicio40`.

Resumen de los ejercicios:

Ejercicio1  
Devolver un saludo fijo. Primer metodo estatico que retorna String.

Ejercicio2  
Crear un saludo personalizado a partir de un nombre. Manejo de null, vacio, blank.

Ejercicio3  
Trabajar con edad: edad el proximo anno y comprobar si es mayor de edad.

Ejercicio4  
Operaciones basicas de rectangulo: area y perimetro.

Ejercicio5  
Convertir grados Celsius a Fahrenheit.

Ejercicio6  
Calcular precio final a partir de precio base e impuesto.

Ejercicio7  
Operaciones seguras con String: longitud segura, mayusculas seguras, primer caracter seguro.

Ejercicio8  
Parsear enteros desde texto de forma segura con manejo de excepciones.

Ejercicio9  
Usar Math: valor absoluto, maximo de dos numeros, distancia en 2D.

Ejercicio10  
Calcular salario semanal con validacion de horas y tarifa.

Ejercicio11  
Recorrer arrays de enteros: suma total y maximo.

Ejercicio12  
Dar la vuelta a un array y buscar si un valor esta contenido.

Ejercicio13  
Filtrar solo los numeros pares de un array y crear un array nuevo con ellos.

Ejercicio14  
Trabajar con una coleccion de notas: maxima, minima y media. Uso de copia defensiva de arrays en el constructor.

Ejercicio15  
Definir un alumno con nombre y edad. Saber si es mayor de edad.

Ejercicio16  
Cuenta bancaria sencilla con saldo, ingreso, retirada y reglas de validacion.

Ejercicio17  
Aula con capacidad maxima, matricular alumnos (solo nombres) y contar cuantas plazas ocupadas.

Ejercicio18  
Habitacion de hotel con numero y estado ocupada / libre.

Ejercicio19  
Contar palabras y contar espacios en un texto.

Ejercicio20  
Obtener las iniciales en mayuscula de un nombre completo con varias palabras.

Ejercicio21  
Comprobar si un texto es palindromo ignorando espacios y mayusculas/minusculas.

Ejercicio22  
Validar un DNI segun reglas simples (digitos + letra).

Ejercicio23  
Generar numero aleatorio entre un minimo y un maximo incluidos.

Ejercicio24  
Formatear una frase a Titulo Capitalizado (cada palabra con primera letra mayuscula y resto minuscula).

Ejercicio25  
Ordenar un array de enteros ascendente (burbuja) devolviendo una copia ordenada.

Ejercicio26  
Unir dos arrays ya ordenados en uno nuevo tambien ordenado (merge).

Ejercicio27  
Trabajar con matrices (array 2D): sumar una fila y sumar una columna.

Ejercicio28  
Vector 2D con x,y. Sumar vectores, calcular magnitud y distancia.

Ejercicio29  
Producto con nombre, precio, stock y valor total de stock.

Ejercicio30  
Inventario que contiene varios productos y permite buscar por nombre y sumar el valor total.

Ejercicio31  
Libro de notas paralelo (nombres y notas). Obtener nota de un alumno concreto y calcular la media.

Ejercicio32  
Libro de biblioteca que se puede prestar y devolver.

Ejercicio33  
Profesor con nombre y especialidad.

Ejercicio34  
Aula con un tutor (Profesor) y una lista de alumnos (Student). Asignar tutor, matricular alumnos y consultar datos.

Ejercicio35  
Cuenta bancaria con historial de operaciones (ingresos, retiradas correctas o denegadas).

Ejercicio36  
Estadisticas de temperaturas: maxima, minima, media y cuantas superan cierto umbral.

Ejercicio37  
Gestor de hotel que maneja varias habitaciones: buscar la primera libre, check-in y check-out.

Ejercicio38  
Formulas geometricas: area de circulo, area de rectangulo y area de triangulo.

Ejercicio39  
Series numericas: factorial y fibonacci de forma iterativa.

Ejercicio40  
Tablero 3x3 tipo tres en raya. Colocar marcas 'X' u 'O' y detectar ganador.


Flujo de trabajo sugerido:

1. Abre el proyecto Maven en tu IDE (IntelliJ, VS Code con soporte Java, etc).
2. Ve a `src/main/java/com/docencia/programacion`.
3. En la version estudiante veras metodos sin implementar o con TODO. Tu tarea es completarlos con buen codigo limpio.
4. Ejecuta `mvn test` para comprobar cada ejercicio.
5. Fijate que las pruebas ejecutan primero los casos nulos / vacios / en blanco. Replica esa mentalidad en tu propio codigo real.
