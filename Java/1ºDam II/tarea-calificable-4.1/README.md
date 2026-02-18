# Tarea: Recursividad vs Lógica 

## Objetivo
Implementar 30 ejercicios en dos paquetes:

- `com.docencia.recursividad`: solución **recursiva** (y backtracking donde aplique).
- `com.docencia.logica`: solución **iterativa / tradicional** (bucles, estructuras de datos, DP, etc.).

Cada ejercicio está en una clase `Ejercicio01` ... `Ejercicio30` y expone una función `public static`
con nombre en español.

> **Regla:** En el paquete `recursividad` NO usar bucles para resolver (salvo validaciones o utilidades mínimas).
> En el paquete `logica` NO usar recursividad.

## Cómo ejecutar (cuando tengas tests o quieras compilar)
```bash
mvn clean test
```


## Lista de ejercicios (firma)
1. `factorial(int n) : int/long`
2. `potencia(long base, int exponente) : long`
3. `sumaHastaN(int n) : long`
4. `fibonacci(int n) : long`
5. `mcd(int a, int b) : int`
6. `cuentaRegresiva(int n) : List<Integer>`
7. `sumaDigitos(int n) : int`
8. `contarDigitos(int n) : int`
9. `invertirNumero(int n) : int`
10. `invertirCadena(String texto) : String`
11. `sumaArreglo(int[] arreglo) : long`
12. `maximoArreglo(int[] arreglo) : int`
13. `buscarLineal(int[] arreglo, int objetivo) : int`
14. `esPalindromo(String texto) : boolean`
15. `contarCaracter(String texto, char c) : int`
16. `eliminarCaracter(String texto, char c) : String`
17. `estaOrdenadoAsc(int[] arreglo) : boolean`
18. `fusionarOrdenados(int[] a, int[] b) : int[]`
19. `busquedaBinaria(int[] arregloOrdenado, int objetivo) : int`
20. `mergeSort(int[] arreglo) : int[]`
21. `quickSort(int[] arreglo) : int[]`
22. `potenciaRapida(long base, int exponente) : long`
23. `contarInversiones(int[] arreglo) : long`
24. `encontrarPico(int[] arregloMontana) : int`
25. `generarPermutaciones(int[] arreglo) : List<List<Integer>>` (recomendado: **únicas**)
26. `generarCombinaciones(int[] arreglo, int k) : List<List<Integer>>`
27. `generarSubconjuntos(int[] arreglo) : List<List<Integer>>`
28. `contarSolucionesNReinas(int n) : int`
29. `existeCaminoLaberinto(int[][] lab, int fi, int ci, int ff, int cf) : boolean` (0 libre, 1 bloqueado)
30. `existeSubconjuntoSuma(int[] arreglo, int objetivo) : boolean`

## Ejercicio 01 — `factorial(int n) : int`
**Algoritmo:** acumulador `r=1`; multiplicar de `2..n` usando `Math.multiplyExact`. Valida `n >= 0`.

**Ejemplos:**
- `factorial(0)` → `1`
- `factorial(5)` → `120`
- `factorial(-1)` → lanza `IllegalArgumentException`

## Ejercicio 02 — `potencia(long base, int exponente) : long`
**Algoritmo:** `r=1`; multiplicar `base` `exponente` veces con `Math.multiplyExact`. Valida `exponente >= 0`.

**Ejemplos:**
- `potencia(2, 0)` → `1`
- `potencia(2, 10)` → `1024`
- `potencia(3, -1)` → lanza `IllegalArgumentException`

## Ejercicio 03 — `sumaHastaN(int n) : long`
**Algoritmo:** acumular `1 + 2 + ... + n` con un bucle. Valida `n >= 0`.

**Ejemplos:**
- `sumaHastaN(0)` → `0`
- `sumaHastaN(5)` → `15`
- `sumaHastaN(-3)` → lanza `IllegalArgumentException`

## Ejercicio 04 — `fibonacci(int n) : long`
**Algoritmo:** casos base `n<=1`; si no, iterar sumando los dos anteriores (`a`,`b`) con `Math.addExact`. Valida `n >= 0`.

**Ejemplos:**
- `fibonacci(0)` → `0`
- `fibonacci(1)` → `1`
- `fibonacci(10)` → `55`

## Ejercicio 05 — `mcd(int a, int b) : int`
**Algoritmo:** Euclides (iterativo) con valores absolutos: repetir `a % b` hasta que `b == 0`; devolver `a`.

**Ejemplos:**
- `mcd(54, 24)` → `6`
- `mcd(-54, 24)` → `6`
- `mcd(0, 5)` → `5`

## Ejercicio 06 — `cuentaRegresiva(int n) : List<Integer>`
**Algoritmo:** construir una lista desde `n` hasta `0`. Valida `n >= 0`.

**Ejemplos:**
- `cuentaRegresiva(0)` → `[0]`
- `cuentaRegresiva(5)` → `[5, 4, 3, 2, 1, 0]`
- `cuentaRegresiva(-2)` → lanza `IllegalArgumentException`

## Ejercicio 07 — `sumaDigitos(int n) : int`
**Algoritmo:** usar `abs(n)`; extraer dígitos con `% 10` y acumular; dividir entre 10.

**Ejemplos:**
- `sumaDigitos(0)` → `0`
- `sumaDigitos(12345)` → `15`
- `sumaDigitos(-90)` → `9`

## Ejercicio 08 — `contarDigitos(int n) : int`
**Algoritmo:** usar `abs(n)`; contar cuántas veces puede dividirse entre 10 hasta que sea `< 10`. (Para `0..9` devuelve `1`).

**Ejemplos:**
- `contarDigitos(0)` → `1`
- `contarDigitos(9)` → `1`
- `contarDigitos(12345)` → `5`

## Ejercicio 09 — `invertirNumero(int n) : int`
**Algoritmo:** conservar signo; invertir acumulando `r = r*10 + (n%10)` con `Math.multiplyExact`/`Math.addExact`.

**Ejemplos:**
- `invertirNumero(1200)` → `21`
- `invertirNumero(-305)` → `-503`
- `invertirNumero(0)` → `0`

## Ejercicio 10 — `invertirCadena(String texto) : String`
**Algoritmo:** valida `texto != null`; invierte con `StringBuilder(texto).reverse()`.

**Ejemplos:**
- `invertirCadena("hola")` → `"aloh"`
- `invertirCadena("")` → `""`
- `invertirCadena(null)` → lanza `IllegalArgumentException`

## Ejercicio 11 — `sumaArreglo(int[] arreglo) : long`
**Algoritmo:** valida `arreglo != null`; recorre y acumula en `long`.

**Ejemplos:**
- `sumaArreglo(new int[]{})` → `0`
- `sumaArreglo(new int[]{1,2,3})` → `6`
- `sumaArreglo(null)` → lanza `IllegalArgumentException`

## Ejercicio 12 — `maximoArreglo(int[] arreglo) : int`
**Algoritmo:** valida que no sea `null` ni vacío; inicializa con el primer elemento y actualiza el máximo.

**Ejemplos:**
- `maximoArreglo(new int[]{7})` → `7`
- `maximoArreglo(new int[]{-2, 5, 1})` → `5`
- `maximoArreglo(new int[]{})` → lanza `IllegalArgumentException`

## Ejercicio 13 — `buscarLineal(int[] arreglo, int objetivo) : int`
**Algoritmo:** valida `arreglo != null`; recorre y devuelve el índice del primer match; si no existe, `-1`.

**Ejemplos:**
- `buscarLineal(new int[]{4,7,9}, 7)` → `1`
- `buscarLineal(new int[]{4,7,9}, 5)` → `-1`
- `buscarLineal(null, 1)` → lanza `IllegalArgumentException`

## Ejercicio 14 — `esPalindromo(String texto) : boolean`
**Algoritmo:** valida `texto != null`; dos punteros desde extremos hacia el centro comparando caracteres.

**Ejemplos:**
- `esPalindromo("reconocer")` → `true`
- `esPalindromo("hola")` → `false`
- `esPalindromo("")` → `true`

## Ejercicio 15 — `contarCaracter(String texto, char c) : int`
**Algoritmo:** valida `texto != null`; recorre y cuenta ocurrencias exactas de `c`.

**Ejemplos:**
- `contarCaracter("banana", 'a')` → `3`
- `contarCaracter("banana", 'x')` → `0`
- `contarCaracter("", 'a')` → `0`

## Ejercicio 16 — `eliminarCaracter(String texto, char c) : String`
**Algoritmo:** valida `texto != null`; construye un `StringBuilder` omitiendo `c`.

**Ejemplos:**
- `eliminarCaracter("banana", 'a')` → `"bnn"`
- `eliminarCaracter("aaaa", 'a')` → `""`
- `eliminarCaracter("hola", 'x')` → `"hola"`

## Ejercicio 17 — `estaOrdenadoAsc(int[] arreglo) : boolean`
**Algoritmo:** valida `arreglo != null`; verifica que no exista `arreglo[i] > arreglo[i+1]`.

**Ejemplos:**
- `estaOrdenadoAsc(new int[]{1,2,2,3})` → `true`
- `estaOrdenadoAsc(new int[]{3,2,1})` → `false`
- `estaOrdenadoAsc(new int[]{})` → `true`

## Ejercicio 18 — `fusionarOrdenados(int[] a, int[] b) : int[]`
**Algoritmo:** valida arrays no `null`; fusión tipo *merge* con dos punteros, generando un nuevo array ordenado.

**Ejemplos:**
- `fusionarOrdenados(new int[]{1,3,5}, new int[]{2,4,6})` → `[1,2,3,4,5,6]`
- `fusionarOrdenados(new int[]{}, new int[]{1,2})` → `[1,2]`
- `fusionarOrdenados(new int[]{1,2}, new int[]{})` → `[1,2]`

## Ejercicio 19 — `busquedaBinaria(int[] a, int x) : int`
**Algoritmo:** valida `a != null`; búsqueda binaria iterativa (arreglo ordenado) devolviendo índice o `-1`.

**Ejemplos:**
- `busquedaBinaria(new int[]{1,3,5,7}, 5)` → `2`
- `busquedaBinaria(new int[]{1,3,5,7}, 6)` → `-1`
- `busquedaBinaria(new int[]{}, 1)` → `-1`

## Ejercicio 20 — `mergeSort(int[] arreglo) : int[]`
**Algoritmo:** valida `arreglo != null`; *merge sort* iterativo (bottom-up) usando buffer temporal. Devuelve **copia ordenada**.

**Ejemplos:**
- `mergeSort(new int[]{3,1,2})` → `[1,2,3]`
- `mergeSort(new int[]{})` → `[]`
- `mergeSort(new int[]{5,5,1})` → `[1,5,5]`

## Ejercicio 21 — `quickSort(int[] arreglo) : int[]`
**Algoritmo:** valida `arreglo != null`; quicksort **iterativo** con pila explícita y partición Lomuto. Devuelve **copia ordenada**.

**Ejemplos:**
- `quickSort(new int[]{3,1,2})` → `[1,2,3]`
- `quickSort(new int[]{1,2,3})` → `[1,2,3]`
- `quickSort(new int[]{})` → `[]`

## Ejercicio 22 — `potenciaRapida(long base, int exp) : long`
**Algoritmo:** exponenciación rápida (*square-and-multiply*) usando bits. Valida `exp >= 0` y usa `Math.multiplyExact`.

**Ejemplos:**
- `potenciaRapida(2, 10)` → `1024`
- `potenciaRapida(5, 0)` → `1`
- `potenciaRapida(3, -2)` → lanza `IllegalArgumentException`

## Ejercicio 23 — `contarInversiones(int[] arreglo) : long`
**Algoritmo:** cuenta inversiones durante un proceso tipo *merge sort*: cuando un elemento de la derecha “salta” sobre los de la izquierda, suma `mid - p`. Devuelve el total.

**Ejemplos:**
- `contarInversiones(new int[]{1,2,3})` → `0`
- `contarInversiones(new int[]{3,2,1})` → `3`
- `contarInversiones(new int[]{2,1,3})` → `1`

## Ejercicio 24 — `encontrarPico(int[] a) : int`
**Algoritmo:** búsqueda binaria para hallar un pico local comparando `a[mid]` con `a[mid+1]`. Devuelve el **valor** del pico.

**Ejemplos:**
- `encontrarPico(new int[]{1,3,5,4,2})` → `5`
- `encontrarPico(new int[]{1,2,3})` → `3`
- `encontrarPico(new int[]{3,2,1})` → `3`

## Ejercicio 25 — `generarPermutaciones(int[] arreglo) : List<List<Integer>>`
**Algoritmo:** valida `arreglo != null`; ordena copia y genera permutaciones en orden lexicográfico usando “siguiente permutación”.

**Ejemplos:**
- `generarPermutaciones(new int[]{1,2,3})` → `[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]`
- `generarPermutaciones(new int[]{})` → `[[]]`
- `generarPermutaciones(new int[]{2,1})` → `[[1,2],[2,1]]`

## Ejercicio 26 — `generarCombinaciones(int[] arreglo, int k) : List<List<Integer>>`
**Algoritmo:** valida `arreglo != null` y `0 <= k <= n`; genera combinaciones por índices crecientes (iterativo).

**Ejemplos:**
- `generarCombinaciones(new int[]{1,2,3,4}, 2)` → `[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]`
- `generarCombinaciones(new int[]{1,2,3}, 0)` → `[[]]`
- `generarCombinaciones(new int[]{1,2}, 3)` → lanza `IllegalArgumentException`

## Ejercicio 27 — `generarSubconjuntos(int[] arreglo) : List<List<Integer>>`
**Algoritmo:** valida `arreglo != null`; genera el conjunto potencia iterando máscaras de bits `0..(2^n - 1)`.

**Ejemplos:**
- `generarSubconjuntos(new int[]{1,2})` → `[[],[1],[2],[1,2]]`
- `generarSubconjuntos(new int[]{})` → `[[]]`
- `generarSubconjuntos(new int[]{7})` → `[[],[7]]`

## Ejercicio 28 — `contarSolucionesNReinas(int n) : int`
**Algoritmo:** backtracking **iterativo** con estructuras para columnas y diagonales ocupadas. Cuenta cuántas soluciones existen. Valida `n >= 0`. Por convenio, `n = 0` devuelve `1`.

**Ejemplos:**
- `contarSolucionesNReinas(0)` → `1`
- `contarSolucionesNReinas(4)` → `2`
- `contarSolucionesNReinas(3)` → `0`

## Ejercicio 29 — `existeCaminoLaberinto(int[][] m, int fi, int ci, int ff, int cf) : boolean`
**Algoritmo:** BFS (cola) sobre una matriz donde `0` = celda libre y cualquier otro valor = muro. Valida laberinto y coordenadas. Si inicio o fin no son `0`, devuelve `false`.

**Ejemplos:**
- Entrada:
  ```java
  int[][] m = {
    {0,1,0},
    {0,1,0},
    {0,0,0}
  };
  ```
  `existeCaminoLaberinto(m, 0,0, 2,2)` → `true`
- Con muro en destino:
  ```java
  int[][] m2 = {
    {0,0},
    {0,1}
  };
  ```
  `existeCaminoLaberinto(m2, 0,0, 1,1)` → `false`
- Coordenadas fuera de rango → lanza `IllegalArgumentException`

## Ejercicio 30 — `existeSubconjuntoSuma(int[] arreglo, int objetivo) : boolean`
**Algoritmo:** programación dinámica con conjunto de sumas alcanzables. Parte de `{0}` y, por cada elemento, añade nuevas sumas `s+v`. Devuelve `true` si aparece `objetivo`. Valida `arreglo != null`.

**Ejemplos:**
- `existeSubconjuntoSuma(new int[]{3,34,4,12,5,2}, 9)` → `true` (por ejemplo: `4+5`)
- `existeSubconjuntoSuma(new int[]{1,2,3}, 7)` → `false`
- `existeSubconjuntoSuma(new int[]{}, 0)` → `true` (subconjunto vacío)

---
