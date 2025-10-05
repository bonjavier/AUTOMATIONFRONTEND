# 🚀 Proyecto de Automatización Frontend - Swag Labs

## 📋 Descripción del Proyecto

Este proyecto implementa un framework de automatización de pruebas end-to-end para la aplicación web **Swag Labs** (https://www.saucedemo.com/), utilizando el patrón **Screenplay** con **Serenity BDD** y **Cucumber**. 

El framework está diseñado para validar el flujo completo de compra en línea, desde el login hasta la confirmación de la orden, garantizando la calidad y funcionalidad de la aplicación web.

## 🎯 Objetivo

Automatizar las pruebas funcionales del portal Swag Labs para:
- ✅ Validar el proceso de autenticación de usuarios
- ✅ Verificar la funcionalidad de agregar productos al carrito
- ✅ Comprobar el flujo completo de checkout y compra
- ✅ Generar reportes detallados de las pruebas ejecutadas
- ✅ Garantizar la estabilidad y confiabilidad del sistema

## 🛠️ Tecnologías y Herramientas Utilizadas

### **Lenguajes y Frameworks**
| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| **Java** | 17+ | Lenguaje de programación principal |
| **Serenity BDD** | 2.6.0 | Framework de automatización y reportes |
| **Cucumber** | 6.x | Framework BDD para escribir escenarios |
| **JUnit** | 4.13.2 | Framework de testing |
| **Gradle** | 7.4.1+ | Herramienta de construcción y gestión de dependencias |

### **Herramientas de Automatización**
- **Selenium WebDriver** - Automatización del navegador
- **ChromeDriver** - Driver para Google Chrome (descarga automática)
- **Screenplay Pattern** - Patrón de diseño para pruebas mantenibles

### **Dependencias Principales**
```gradle
- net.serenity-bdd:serenity-core:2.6.0
- net.serenity-bdd:serenity-screenplay:2.6.0
- net.serenity-bdd:serenity-screenplay-webdriver:2.6.0
- net.serenity-bdd:serenity-cucumber6:2.6.0
- org.reflections:reflections:0.10.2
```

## 🏗️ Arquitectura del Proyecto

### **Estructura de Directorios**
```
src/
├── main/java/co/com/proyectobase/screenplay/
│   ├── hooks/          # Configuración de actores y escenarios
│   ├── interactions/   # Interacciones personalizadas (Wait, ScrollTop)
│   ├── question/       # Validaciones y verificaciones
│   ├── tasks/          # Tareas de negocio (Login, Compra, etc.)
│   └── ui/             # Page Objects con elementos de la UI
└── test/
    ├── java/co/com/proyectobase/screenplay/
    │   ├── runners/        # Ejecutores de pruebas
    │   └── stepdefinitions/ # Definición de pasos Cucumber
    └── resources/
        ├── features/       # Archivos .feature con escenarios
        └── serenity.conf   # Configuración de Serenity
```

### **Patrón Screenplay Implementado**
- **Actors** (Actores): Representan usuarios del sistema
- **Tasks** (Tareas): Acciones de alto nivel de negocio
- **Interactions** (Interacciones): Acciones básicas con elementos
- **Questions** (Preguntas): Validaciones del estado del sistema
- **Page Objects**: Elementos de la interfaz de usuario

## 🔄 Flujo de Pruebas Automatizadas

### **Escenario Unificado: Login y Compra Completa** `@loginCompraExitosoConCredenciales`

Este escenario integra todo el flujo end-to-end en una sola prueba para simplificar la ejecución:

1. **Given**: El usuario está en la página de login de Swag Labs
2. **When**: Ingresa credenciales válidas (`standard_user` / `secret_sauce`)
3. **And**: Visualiza y agrega productos al carrito (Backpack + Bike Light)
4. **And**: Procede al checkout desde el carrito
5. **And**: Ingresa datos de envío:
   - **Nombre**: Javier
   - **Apellido**: Duran  
   - **Código Postal**: 12345
6. **And**: Confirma la compra final
7. **Then**: Visualiza el mensaje de confirmación "Thank you for your order!"

**Ventajas del escenario unificado:**
- ✅ Prueba el flujo completo sin interrupciones
- ✅ Reduce complejidad de configuración
- ✅ Valida la integración entre todos los módulos
- ✅ Genera un reporte consolidado del proceso completo

## ⚙️ Configuraciones Importantes

### **Configuración de Chrome (serenity.conf)**
```hocon
webdriver {
  driver = chrome
  capabilities {
    "goog:chromeOptions" {
      args = [
        "start-maximized",
        "--incognito",
        "--disable-password-generation",
        "--disable-save-password-bubble",
        "--disable-password-leak-detection",
        "--disable-autofill"
      ]
      prefs = {
        "credentials_enable_service" = false
        "profile.password_manager_enabled" = false
      }
    }
  }
}
```

### **Configuración de Reportes (serenity.properties)**
```properties
serenity.project.name = Ejercicio 1 reto técnico sofka
serenity.take.screenshots = AFTER_EACH_STEP
serenity.reports = html
webdriver.timeouts.implicitlywait = 10000
```

## 📥 Instalación y Configuración

### **Prerrequisitos**
- ☑️ **Java 17+** instalado
- ☑️ **Git** para clonar el repositorio
- ☑️ **Google Chrome** (última versión)
- ☑️ Conexión a internet (para descarga automática de ChromeDriver)

### **Pasos de Instalación**

1. **Clonar el repositorio**
```bash
git clone https://github.com/bonjavier/AUTOMATIONFRONTEND.git
cd AUTOMATIONFRONTEND
```

2. **Verificar Java**
```bash
java -version
# Debe mostrar Java 17 o superior
```

3. **Dar permisos de ejecución (Linux/Mac)**
```bash
chmod +x gradlew
```

## 🚀 Ejecución de Pruebas

### **Ejecutar todas las pruebas**
```bash
gradle clean test -Dcontext=chrome -Dwebdriver.driver=chrome
```

### **Ejecutar prueba específica por tag**
```bash
# Ejecutar el escenario completo (login + compra)
gradle clean test --tests "co.com.proyectobase.screenplay.runners.SauceRunner" -Dcucumber.options="--tags @loginCompraExitosoConCredenciales" -Dcontext=chrome -Dwebdriver.driver=chrome

# Comando simplificado (ejecuta todas las pruebas del runner)
gradle clean test --tests "co.com.proyectobase.screenplay.runners.SauceRunner" -Dcontext=chrome -Dwebdriver.driver=chrome
```

### **Ejecutar en diferentes ambientes**
```bash
# Ambiente por defecto
gradle clean test -Denvironment=default -Dcontext=chrome -Dwebdriver.driver=chrome

# Ambiente de desarrollo
gradle clean test -Denvironment=dev -Dcontext=chrome -Dwebdriver.driver=chrome
```

## 📊 Generación y Visualización de Reportes

### **Generar reportes después de la ejecución**
```bash
gradle serenity:aggregate
```

### **Ubicación de los reportes**
Los reportes se generan automáticamente en:
```
target/site/serenity/index.html
```

### **Abrir reportes en el navegador**
```bash
# Windows
start target/site/serenity/index.html

# Linux/Mac
open target/site/serenity/index.html
```

### **Contenido de los reportes**
- ✅ **Resumen ejecutivo** con estadísticas de pruebas
- ✅ **Detalles paso a paso** de cada escenario
- ✅ **Screenshots automáticos** en cada paso
- ✅ **Tiempos de ejecución** y performance
- ✅ **Logs detallados** de errores (si los hay)
- ✅ **Gráficos y métricas** de cobertura

## 🔧 Comandos Útiles

### **Limpiar proyecto**
```bash
gradle clean
```

### **Compilar sin ejecutar pruebas**
```bash
gradle build -x test
```

### **Ver dependencias**
```bash
gradle dependencies
```

### **Ejecutar con logs detallados**
```bash
gradle clean test --info --stacktrace -Dcontext=chrome -Dwebdriver.driver=chrome
```

## 🐛 Solución de Problemas Comunes

### **Error: "Unable to delete directory build"**
```bash
# Cerrar procesos Java
taskkill /f /im java.exe
gradle clean
```

### **Error: ChromeDriver no encontrado**
- El proyecto descarga automáticamente ChromeDriver
- Verificar conexión a internet
- Actualizar Google Chrome a la última versión

### **Error: Modal de contraseñas de Chrome**
- Las configuraciones en `serenity.conf` desactivan estos modales
- Si persiste, ejecutar Chrome en modo incógnito

## 👥 Contribución

### **Estructura de commits**
```bash
git add .
git commit -m "descripción clara del cambio"
git push origin main
```

### **Estándares de código**
- ✅ Usar patrón Screenplay
- ✅ Nomenclatura clara en inglés
- ✅ Comentarios en español cuando sea necesario
- ✅ Imports organizados y sin elementos no utilizados

## 📞 Soporte

Para dudas o problemas:
- 📧 Revisar logs en `target/site/serenity/`
- 🐛 Verificar configuraciones en `serenity.conf`
- 📋 Consultar este README para comandos específicos

---

**Desarrollado con ❤️ para automatización de pruebas de calidad**