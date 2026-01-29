package com.docencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.stream.Stream;

/**
 * Calcula y muestra la nota final usando:
 * - resultados de Surefire (XML)
 * - cobertura de JaCoCo (CSV)
 *
 * Formula: 70% tests + 30% cobertura.
 */
public final class NotaFinal {

  private NotaFinal() {}

  public static void main(String[] args) throws Exception {
    double testRate = calcularRatioTests();
    double covRate = calcularCobertura();
    int nota = (int) Math.round(100.0 * (0.70 * testRate + 0.30 * covRate));

    System.out.println("----------------------------------------");
    System.out.println("Tests (ratio): " + String.format(java.util.Locale.ROOT, "%.2f", testRate * 100) + "%");
    System.out.println("Cobertura lineas: " + String.format(java.util.Locale.ROOT, "%.2f", covRate * 100) + "%");
    System.out.println("NOTA FINAL: " + nota + " / 100");
    System.out.println("----------------------------------------");
  }

  private static double calcularRatioTests() throws IOException {
    Path reports = Paths.get("target", "surefire-reports");
    if (!Files.isDirectory(reports)) return 0.0;

    int total = 0;
    int failed = 0;

    try (Stream<Path> s = Files.list(reports)) {
      for (Path p : (Iterable<Path>) s.filter(x -> x.getFileName().toString().startsWith("TEST-") && x.toString().endsWith(".xml"))::iterator) {
        String xml = Files.readString(p, StandardCharsets.UTF_8);
        total += leerAtributo(xml, "tests");
        failed += leerAtributo(xml, "failures");
        failed += leerAtributo(xml, "errors");
      }
    }

    if (total <= 0) return 0.0;
    int passed = Math.max(0, total - failed);
    return (double) passed / (double) total;
  }

  private static int leerAtributo(String xml, String attr) {
    // busca attr="123"
    int idx = xml.indexOf(attr + "=\"");
    if (idx < 0) return 0;
    int start = idx + attr.length() + 2;
    int end = xml.indexOf('"', start);
    if (end < 0) return 0;
    try {
      return Integer.parseInt(xml.substring(start, end));
    } catch (NumberFormatException e) {
      return 0;
    }
  }

  private static double calcularCobertura() throws IOException {
    Path csv = Paths.get("target", "site", "jacoco", "jacoco.csv");
    if (!Files.exists(csv)) return 0.0;

    long missed = 0;
    long covered = 0;

    try (BufferedReader br = Files.newBufferedReader(csv, StandardCharsets.UTF_8)) {
      String header = br.readLine();
      if (header == null) return 0.0;
      String[] cols = header.split(",");
      int idxMiss = indexOf(cols, "LINE_MISSED");
      int idxCov = indexOf(cols, "LINE_COVERED");
      if (idxMiss < 0 || idxCov < 0) return 0.0;

      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split(",", -1);
        if (parts.length <= Math.max(idxMiss, idxCov)) continue;
        missed += parseLongSafe(parts[idxMiss]);
        covered += parseLongSafe(parts[idxCov]);
      }
    }

    long total = missed + covered;
    return total == 0 ? 0.0 : (double) covered / (double) total;
  }

  private static int indexOf(String[] cols, String name) {
    for (int i = 0; i < cols.length; i++) {
      if (name.equals(cols[i])) return i;
    }
    return -1;
  }

  private static long parseLongSafe(String s) {
    try {
      return Long.parseLong(s.trim());
    } catch (Exception e) {
      return 0;
    }
  }
}
