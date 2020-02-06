# Laboratorio3-CVDS
# Daniel Felipe Alfonso Bueno 

## Ejercicio Registraduria 


Construye el paquete y ejecuta las pruebas: 

_mvn package_

Ejecuta la aplicacion desde su clase principal:

_mvn exec:java -Dexec.mainClass="edu.eci.cvds"_

Ejecuta las pruebas pero no construye el paquete:

_mvn test_

## Clases de Equivalencia 

- VALID: Estado valido del registro 
- DEAD: La persona del registro esta muerta 
- UNDERAGE: La persona registrada es menor de edad 
- INVALID_AGE: La edad no esta dentro del parametro 
- DUPLICATED: La persona a registrar ya existe 
