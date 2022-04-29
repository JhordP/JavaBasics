package paquetes.main;
import paquetes.net.jhordp.clasepaquetes.Utileria;

//import static: Permite utilizar atributos y funciones estaticas de una clase sin necesidad de instanciarla o mencionar la clase.
import static paquetes.net.jhordp.clasepaquetes.Utileria.imprimir;
public class mainPaquetes {
    public static void main(String[] args) {
        Utileria.imprimir("Hola Mundo");

        //Utiliza el metodo como si fuera de una clase o clase padre.
        imprimir("Hola Universo [import static]");

        //Por ultimo utilizando el nombre completamente calificado, que es usar toda la referencia.
        paquetes.net.jhordp.clasepaquetes.Utileria.imprimir("Adios");
    }
}
