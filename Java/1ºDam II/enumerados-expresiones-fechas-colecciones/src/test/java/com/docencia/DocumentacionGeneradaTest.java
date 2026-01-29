package com.docencia;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

@EnabledIfSystemProperty(named = "verifyDocs", matches = "true")
class DocumentacionGeneradaTest {

  @Test
  void debeExistirIndexDeJavadoc() {
    Path index = Paths.get("target", "site", "apidocs", "index.html");
    assertTrue(Files.exists(index), "Error: no existe target/site/apidocs/index.html (javadoc no generado)");
  }

  @Test
  void debeHaberVariosHtmlGenerados() throws IOException {
    Path apidocs = Paths.get("target", "site", "apidocs");
    assertTrue(Files.isDirectory(apidocs), "Error: no existe la carpeta target/site/apidocs");

    try (Stream<Path> s = Files.walk(apidocs)) {
      long html = s.filter(p -> p.toString().endsWith(".html")).count();
      assertTrue(html >= 5, "Error: se esperaban al menos 5 html en apidocs, se generaron menos");
    }
  }
}
