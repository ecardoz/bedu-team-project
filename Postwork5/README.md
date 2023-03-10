 <h2 align="center"><b>Postwork Sesión 5: Inversión de Control (IoC) en Spring Boot</b></h2>

## 🎯Objetivo
- Extender el programa de línea de comandos para utilizar el IoC de Spring Boot.

## 📝Desarrollo
- En esta sesión aprendimos qué es la Inversión de Control y cómo usar los JavaBeans junto con la Inyección de Dependencias en Spring Boot.
- En el Postwork de la sesión anterior implementamos una línea de comandos que solicitaba un nombre y número de teléfono de una Persona. En esta ocasión tu misión será extender este programa para que la línea de comandos para que:
  1.	Valide que el número de teléfono solo contenga caracteres válidos: números, guion medio y espacio en blanco.
  2.	Valide que el número de teléfono contenga 10 dígitos.
  3.	Si se tiene un número válido, elimine todos los caracteres que no sean numéricos.
  4.	De al número de teléfono un formato de (##)-####-#### antes de imprimirlo en la consola.
- Dicha implementación debe estar contenida en dos clases “servicio” que deben ser inyectada en la clase principal.
## Resultados
