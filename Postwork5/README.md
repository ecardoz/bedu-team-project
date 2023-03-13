# Postwork 5 del curso Java Backend Basico

## Tema: Inversión de Control (IoC) en Spring Boot

### Indicaciones
En el Postwork de la sesión anterior implementamos una línea de comandos que solicitaba un nombre y número de teléfono de una Persona.

En esta ocasión tu misión será extender este programa para que la línea de comandos para que:

Valide que el número de teléfono solo contenga caracteres válidos: números, guion medio y espacio en blanco.
Valide que el número de teléfono contenga 10 dígitos.
Si se tiene un número válido, elimine todos los caracteres que no sean numéricos.
De al número de teléfono un formato de (##)-####-#### antes de imprimirlo en la consola.
Dicha implementación debe estar contenida en dos clases “servicio” que deben ser inyectada en la clase principal.

### Solucion propuesta
* **Dos modelos:**
  * Persona - Establece la estructura de un objeto del tipo Persona
  * Telefono - Establece la estructura de un objeto del tipo Telefono 
#####
* **Dos servicios:**
  * PersonaService - Implementa el servicio que inyecta la dependencia de Persona
  * TelefonoService - Implementa el servicio que inyecta la dependencia de Telefono <br>
#####
* **Una clase principal:**
  * Main - Clase principal que inyecta las dependencias de PersonaService y TelefonoService
#####
* La clase *ErrorManager* para el Manejo de los errores
* La clase *Utils* con utilerias para las validaciones del numero de telefono


https://user-images.githubusercontent.com/12447707/224785403-9e288a8c-eadf-4a5c-879a-9c35def1b5d3.mp4

