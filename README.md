# AREP_TallerArquitecturasServidores
Para este taller se construyó un servidor Web(tipo Apache) en Java el cual es capaz de entregar páginas html e imágenes tipo PNG. De igual manera el servidor provee un framework IoC para la construcción de aplicaciones web a partir de POJOS.

## Pre-requisitos
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
Para estar seguro de las versiónes que posee de maven, git y de java ejecute los siguientes comandos:
```
mvn -version  
git --version  
java -version  
```
## Instalación 
Para descargar el proyecto desde GitHub ejecute la siguiente linea:
```
https://github.com/Camu10/AREP_TallerArquitecturasServidores.git
```

## Ejecutar
Dentro del directorio AREP_LAB2, desde la consola de comandos para compilar ejecutamos la siguiente linea:
```
mvn package
```
Para ejecutar el proyecto de manera local desde la consola de comandos ejecutamos la siguiente linea y desde un navegador buscamos `localhost:35000/` :
```
java -cp target/classes co.edu.escuelaing.sparkd.SpringBoot.MicroSpringBoot
```

## Ejecutando las pruebas
Para correr las pruebas ejecutamos la siguiente linea:
```
mvn test
```
## Despliegue en Heroku
Para ingresar a la aplicación web desde cualquier navegador puede hacerlo dando click [aqui](https://tallerarquitecturasservidores.herokuapp.com/).  
Se puede acceder a `/index.html` `/Apps/hola` `/Apps/Bienvenido` `/Apps/Descripcion`.

## Construido con
* [MAVEN](https://maven.apache.org/) - Administrador de dependencias.
* [GIT](https://git-scm.com/) - Control de versiones.
* [JUNIT](https://junit.org/junit5/) - Framework para realizar y automatizar pruebas.
* [HEROKU](https://www.heroku.com/) - Plataforma para el despliegue.
* JAVA - Lenguaje de programación.

## Autor
* **Carlos Murillo** - [Camu10](https://github.com/Camu10)

## Licencia
Este proyecto está bajo la Licencia GNU(General Public License) - mira el archivo [LICENSE](LICENSE) para detalles.
