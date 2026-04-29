import sqlite3
import shutil

# Hacer una copia del backup para inspeccionar
db_path = "src/test/resources/backup.db"

conn = sqlite3.connect(db_path)
cursor = conn.cursor()

# Ver todas las clases
print("=== TODAS LAS CLASES ===")
cursor.execute("SELECT id, nombre, tipo, plazas_disponibles, activa FROM clase ORDER BY id")
all_clases = cursor.fetchall()
for row in all_clases:
    print(f"ID: {row[0]}, Nombre: {row[1]}, Tipo: {row[2]}, Plazas: {row[3]}, Activa: {row[4]}")

# Ver clases disponibles
print("\n=== CLASES DISPONIBLES (plazas_disponibles > 0 AND activa = 1) ===")
cursor.execute("SELECT id, nombre, tipo, plazas_disponibles, activa FROM clase WHERE plazas_disponibles > 0 AND activa = 1 ORDER BY id")
disponibles = cursor.fetchall()
for row in disponibles:
    print(f"ID: {row[0]}, Nombre: {row[1]}, Tipo: {row[2]}, Plazas: {row[3]}, Activa: {row[4]}")
print(f"Total: {len(disponibles)}")

conn.close()
