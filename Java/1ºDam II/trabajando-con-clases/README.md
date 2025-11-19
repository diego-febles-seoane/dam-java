# Proyecto Maven — Java 17 + JUnit 5 + JaCoCo
Paquete base: `com.docencia.clases`

## Estructura
```
.
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com/docencia/clases/BankAccount.java
    └── test
        └── java
            └── com/docencia/clases/BankAccountTest.java
```

## Requisitos
- Java 17 (JDK 17)
- Maven 3.9+

## Comandos útiles
```bash
# Ejecutar tests
mvn clean test

# Informe de cobertura (target/site/jacoco/index.html)
mvn clean verify

# Ejecutar solo JaCoCo (ya incluido en verify)
mvn jacoco:report
```

## Notas
- El `pom.xml` configura **JUnit 5** (Jupiter) y **JaCoCo** (con umbral mínimo 70% por instrucciones).  
- La clase de ejemplo `BankAccount` incluye validación, operaciones y `equals/hashCode` por IBAN.
