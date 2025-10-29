# Trabajo con Clases

## StringUtils

### 1) Normalizador de nombres

**Objetivo:** `trim`, `toLowerCase`, `toUpperCase`, `substring`

```java
public static String normalizaNombre(String raw)
```

**Enunciado:**  
Implementa un método que:

- Elimine espacios al inicio y final.
- Convierta el texto a minúsculas.
- Ponga en mayúscula **solo** la primera letra, manteniendo el resto en minúsculas.

**Ejemplos:**

- `"  aNA  "` → `"Ana"`
- `"juan"` → `"Juan"`

---

### 2) Contador de vocales y consonantes

**Objetivo:** `charAt`, `length`, `indexOf`  

```java
public static int[] cuentaLetras(String s) 
```

**Enunciado:**  
Cuenta cuántas **vocales** y **consonantes** hay en `s`, considerando solo letras de la A a la Z (ignora acentos, números y símbolos).

**Ejemplos:**

- `"Hola, 123"` → `[2, 2]` (o,a / h,l)

---

### 3) Palíndromos “limpios”

**Objetivo:** `replaceAll`, `toLowerCase`, `equals`  

```java
public static boolean esPalindromo(String s)
```

**Enunciado:**  
Quita todos los caracteres que **no** son letras ni dígitos (`[^a-zA-Z0-9]`), convierte a minúsculas y comprueba si el resultado es palíndromo.

**Ejemplos:**

- `"Anita lava la tina"` → `true`
- `"Hola"` → `false`

---

### 4) Acrónimo inteligente

**Objetivo:** `split`, `substring`, `toUpperCase`, `isEmpty`  

```java
public static String acronimo(String frase)
```

**Enunciado:**  
Devuelve el acrónimo formado por la **primera letra** de cada palabra no vacía, en mayúsculas.

**Ejemplos:**

- `"Organización de las Naciones Unidas"` → `"ONU"`
- `"  lenguaje   de   marcas  "` → `"LDM"`

---

## MathUtils

### 1) Redondeos y formatos

**Objetivo:** `Math.round`, `Math.floor`, `Math.ceil`  

```java
public static long[] redondeos(double x) // [floor(x), round(x), ceil(x)]
```

**Enunciado:**  
Devuelve un array con los tres redondeos estándar de `x`. **Nota:** revisa el comportamiento con números negativos.

**Ejemplos:**

- `3.14` → `[3, 3, 4]`
- `-2.6` → `[-3, -3, -2]`

---

### 2) Distancia Euclídea 2D

**Objetivo:** `Math.sqrt`, `Math.pow`, `Math.hypot` (opcional)  

```java
public static double distancia(double x1, double y1, double x2, double y2)
```

**Enunciado:**  
Calcula la distancia entre dos puntos en el plano.

**Ejemplo:**

- `(0,0)` a `(3,4)` → `5.0`

---

### 3) Simulador de dados

**Objetivo:** `Math.random` o `java.util.Random`  

```java
public static int lanzarDado() // 1..6
public static int[] frecuencia(int n) // array de 6 con recuentos
```

**Enunciado:**  
Implementa un dado justo (1–6). Luego simula `n` lanzamientos y devuelve la frecuencia de cada cara.

**Ejemplo:**

- `n = 6000` → frecuencias aproximadas alrededor de `1000` cada cara.

---

## IntegerUtils

### 1) Propiedades de bits y comparación

**Objetivo:** `Integer.toBinaryString`, `Integer.bitCount`, `Integer.compareUnsigned`

```java
public static String bin(int x)
public static int popcount(int x)
public static int comparaSinSigno(int a, int b) // <0, =0, >0
```

**Enunciado:**  

- `bin(x)` → binario sin prefijo.  
- `popcount(x)` → número de bits a 1.  
- `comparaSinSigno(a,b)` → comparación **sin signo**.

**Ejemplos:**

- `bin(10)` → `"1010"`  
- `popcount(15)` → `4`  
- `comparaSinSigno(-1, 1)` → `> 0` (porque `0xFFFFFFFF` > `1` sin signo)

---

### 2) Mini-calculadora de expresiones simples

**Objetivo:** Integración de parseo, validación y cálculo.  

```java
public static int eval(String expr)
```

**Enunciado:**  
Acepta expresiones con **dos operandos enteros** y un operador entre `+ - * / ^`.  
Reglas:

- Quita espacios.
- Valida que hay exactamente **un** operador.
- Para `^` usa `Math.pow(a, b)` y devuelve `int` (ojo con overflow).
- Para `/` comprueba división por cero y lanza `ArithmeticException`.

**Ejemplos:**

- `"12 + 7"` → `19`  
- `"10/  2"` → `5`  
- `"2^10"` → `1024`  
- `"9/0"` → **excepción**

---
