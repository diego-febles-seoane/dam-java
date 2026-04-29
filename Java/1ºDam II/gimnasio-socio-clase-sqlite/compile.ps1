# Script para compilar el proyecto sin Maven
$basePath = Get-Location
$srcPath = "$basePath\src\main\java"
$testSrcPath = "$basePath\src\test\java"
$targetPath = "$basePath\target\classes"
$testTargetPath = "$basePath\target\test-classes"
$resourcesPath = "$basePath\src\main\resources"
$testResourcesPath = "$basePath\src\test\resources"

# Crear directorios si no existen
New-Item -ItemType Directory -Force -Path $targetPath | Out-Null
New-Item -ItemType Directory -Force -Path $testTargetPath | Out-Null

# Descargar dependencias si no existen
$libPath = "$basePath\lib"
New-Item -ItemType Directory -Force -Path $libPath | Out-Null

# Descargar SQLite JDBC si no existe
$sqliteJar = "$libPath\sqlite-jdbc-3.45.3.0.jar"
if (-not (Test-Path $sqliteJar)) {
    Write-Host "Descargando SQLite JDBC..."
    $url = "https://github.com/xerial/sqlite-jdbc/releases/download/3.45.3.0/sqlite-jdbc-3.45.3.0.jar"
    Invoke-WebRequest -Uri $url -OutFile $sqliteJar
}

# Descargar JUnit si no existe
$junitJar = "$libPath\junit-jupiter-api-5.10.2.jar"
$junitEngineJar = "$libPath\junit-jupiter-engine-5.10.2.jar"
$junitPlatformJar = "$libPath\junit-platform-console-standalone-1.10.2.jar"

if (-not (Test-Path $junitPlatformJar)) {
    Write-Host "Descargando JUnit Platform..."
    $url = "https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.2/junit-platform-console-standalone-1.10.2.jar"
    Invoke-WebRequest -Uri $url -OutFile $junitPlatformJar
}

# Compilar código fuente principal
Write-Host "Compilando código fuente principal..."
$classPath = "$sqliteJar"
javac -d $targetPath -cp $classPath -sourcepath $srcPath (Get-ChildItem -Path $srcPath -Recurse -Filter "*.java")

# Compilar tests
Write-Host "Compilando tests..."
javac -d $testTargetPath -cp "$targetPath;$classPath;$junitPlatformJar" -sourcepath "$testSrcPath;$srcPath" (Get-ChildItem -Path $testSrcPath -Recurse -Filter "*.java")

Write-Host "Compilación completada."
