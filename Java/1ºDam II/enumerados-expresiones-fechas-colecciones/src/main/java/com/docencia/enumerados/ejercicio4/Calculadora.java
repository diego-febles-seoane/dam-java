package com.docencia.enumerados.ejercicio4;

public final class Calculadora {

  public double calcular(Operacion op, double a, double b) {
    return switch (op) {
      case Suma -> a + b;
      case Resta -> a - b;
      case Multiplicacion -> a * b;
      case Division -> {
        if (b == 0.0) throw new IllegalArgumentException("Division entre cero");
        yield a / b;
      }
    };
  }

  public boolean esConmutativa(Operacion op) {
    return op == Operacion.Suma || op == Operacion.Multiplicacion;
  }

  public String simbolo(Operacion op) {
    return switch (op) {
      case Suma -> "+";
      case Resta -> "-";
      case Multiplicacion -> "*";
      case Division -> "/";
    };
  }
}
