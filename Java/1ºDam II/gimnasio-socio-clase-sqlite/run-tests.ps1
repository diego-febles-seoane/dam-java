# Script para ejecutar tests con Maven
$mavenHome = "C:\maven"
$mavenBin = "$mavenHome\apache-maven-3.9.6\bin"

# Instalar Maven si no existe
if (-not (Test-Path $mavenBin)) {
    Write-Host "Instalando Maven..."
    New-Item -ItemType Directory -Force -Path $mavenHome | Out-Null
    
    $url = "https://archive.apache.org/dist/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip"
    $zipPath = "$mavenHome\maven.zip"
    
    Write-Host "Descargando Maven desde $url..."
    Invoke-WebRequest -Uri $url -OutFile $zipPath -UseBasicParsing
    
    Write-Host "Extrayendo Maven..."
    Expand-Archive -Path $zipPath -DestinationPath $mavenHome
    Remove-Item $zipPath
}

# Agregar Maven al PATH
$env:PATH = "$mavenBin;$env:PATH"

# Verificar Maven
Write-Host "Verificando Maven..."
& mvn --version

# Ejecutar tests
Write-Host "Ejecutando tests..."
Set-Location "c:\Users\Usuario\Desktop\gimnasio-socio-clase-sqlite"
& mvn clean test
