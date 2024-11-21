# ConversorDeMonedas
Este es un programa de consola en Java que permite convertir entre diferentes monedas utilizando datos actualizados de una API de tipos de cambio.

- [Descripción](#descripción)
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [API Utilizada](#api-utilizada)


Descripción
El Conversor de Monedas es una herramienta que permite convertir montos de una moneda a otra, utilizando datos proporcionados por la API [ExchangeRate-API](https://www.exchangerate-api.com/). Es ideal para estudiantes o desarrolladores que buscan aprender a integrar APIs en sus proyectos Java.

Características
- Convertir entre monedas populares como:
    - Dólar estadounidense (USD)
    - Peso argentino (ARS)
    - Real brasileño (BRL)
    - Peso colombiano (COP)
- Interfaz de usuario basada en consola.
- Actualización de tasas de cambio en tiempo real mediante una API.
- Manejo de errores en las solicitudes de la API.


Requisitos
Para ejecutar este proyecto necesitas:

- Java Development Kit (JDK) 11 o superior.
- Maven (opcional, si usas dependencias externas).
- Conexión a Internet (para consultar las tasas de cambio).


Instalación
1. Clonar el repositorio:
    git clone https://github.com/tuusuario/conversor-monedas.git
    cd conversor-monedas

2. Configurar la clave de API: En la clase ConsultaMoneda, reemplaza el valor de ApiKey con tu clave personal de la API de ExchangeRate-API:
    java
    private String ApiKey = "TU_CLAVE_API";

3. Compilar el proyecto:
    javac -d bin src/**/*.java

4. Ejecutar el programa:
    java -cp bin src.principal.principal

Uso
1. Ejecuta el programa.
2. Selecciona una opción del menú (por ejemplo, convertir de dólar a peso argentino).
3. Ingresa la cantidad de la moneda de origen.
4. Obtén el resultado convertido en la moneda destino.

Estructura del Proyecto

├── src
│   ├── principal
│   │   └── principal.java        # Clase principal que contiene el menú.
│   ├── modelos
│       ├── ConsultaMoneda.java   # Clase para interactuar con la API.
│       ├── MonedaExchange.java   # Clase record que mapea los datos de la API.
├── README.md                     # Documentación del proyecto.

API Utilizada
Este proyecto utiliza [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener datos actualizados de las tasas de cambio.

URL base: https://v6.exchangerate-api.com/v6/
Formato de respuesta: JSON
Monedas soportadas: Más de 150 monedas internacionales.
