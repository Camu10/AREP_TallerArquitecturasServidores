package co.edu.escuelaing.sparkd.SpringBoot;

public class PojoController {
    @RequestMapping("/hola")
    static public String hola() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/Bienvenido")
    static public String Bienvenido() {
        return "Este es un servidor provee un framework IoC para la construccio n de aplicaciones web a partir de POJOS";
    }

    @RequestMapping("/Descripcion")
    static public String Descripcion() {
        return "Taller de Arquitecturas de Servidores de Aplicaciones, Meta protocolos de objetos, Patron IoC, Reflexion";
    }
}