# Spring_Tp3Ev2

## Requisitos:  
Debe tener instalado:

-Java

-Maven

-Apache

-Redis-server

-Python 

-Spring se instalará automáticamente al desplegar si no lo tiene al ser una dependencia del proyecto.

## Funcionamiento: 
      
		-Hay que cargar la base de datos en redis antes de desplegar, para ello ejecutamos: $python datos_redis.py

		-Despliegue con: $mvn install jetty:run 

		-Uso de la aplicación: En localhost:9999/employee podemos utilizar la aplicación.
		
**Aún tiene problemas de compilación, no ejecuta**
