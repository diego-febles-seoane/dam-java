package com.docencia.hito2;

public final class H3Support {
  private H3Support() {}

  /** Devuelve true si obj es Optional y está presente; falla si no es Optional. */
  public static boolean optionalIsPresent(Object opt) {
    if (opt == null) {
      throw new AssertionError("Se esperaba Optional no null");
    }
    try {
      Object r = opt.getClass().getMethod("isPresent").invoke(opt);
      return (boolean) r;
    } catch (Exception e) {
      throw new AssertionError("Se esperaba que buscarPorEmail devolviera Optional (con isPresent).");
    }
  }
}
