# Examen practico DAM 2ª Evaluacion (Sistema de gestion de profesores por capas con XML)

## Contexto
Un centro educativo necesita una pequeña aplicacion para gestionar su profesorado.
La aplicacion debera desarrollarse siguiendo una arquitectura por capas y utilizando interfaces para desacoplar la logica de negocio de la persistencia.

Ademas, la informacion debera almacenarse en un fichero XML utilizando Jackson XML.

## Objetivo
Desarrollar una aplicacion Java que permita:

- registrar profesores en el sistema,
- buscar profesores por su identificador,
- modificar su departamento,
- eliminar profesores,
- consultar si un profesor existe,
- listar todos los profesores.

## Requisitos tecnicos

1. **Arquitectura por capas**
   - Capa de modelo
   - Capa de repositorio
   - Capa de servicio

2. **Uso de interfaces**
   - La comunicacion entre la capa de servicio y la capa de repositorio se realizara mediante interfaces.
   - Las interfaces deberan estar documentadas correctamente con Javadoc.

3. **Persistencia en XML**
   - El repositorio almacenara la informacion en un fichero XML.
   - Se utilizara Jackson XML para serializar y deserializar los datos.

4. **Entidad principal**
   - La entidad principal sera `Profesor`.
   - El identificador del profesor sera un `String` llamado `id`.
   - El `id` actuara como clave unica logica del sistema.

## Ejecucion de tests

```bash
mvn test
```
