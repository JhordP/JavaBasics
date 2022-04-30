package palabrafinal;

import herencia.domain.Persona;

public class mainFinal {
    public static void main(String[] args) {
        final int variable = 5; //Es una constante y no se puede modificar.
        //variable = 10;

        System.out.println(variable);

        //Las clases definidas con final (ej. public final class Clase) no pueden tener clases hijas.
        //Los metodos definidos como final no pueden ser sobreescritos en las clases hijas.

        //final con objetos
        final Persona persona1 = new Persona();

        //No puedes reasignar el constructor del objeto, osea: persona1 = new Persona();
        //Puedes modificar los atributos del objeto
        persona1.setNombre("Jose");
        System.out.println(persona1.getNombre());
    }
}
