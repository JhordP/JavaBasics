package encapsulamiento;

import encapsulamiento.dominio.Persona;

public class MainPersona {
    public static void main(String[] args) {
        Persona pers1 = new Persona("Juan", 500.00, false);
        System.out.println("Nombre Persona1: "+pers1.getNombre()); //Antes del setNombre
        pers1.setNombre("Juan Carlos");

        System.out.println("Nombre Persona1: "+pers1.getNombre()); //Despues del setNombre
        System.out.println("Sueldo Persona1: "+pers1.getSueldo());
        System.out.println("Estatus Elim. Persona2: "+pers1.isEliminado());

        System.out.println("To String:\n"+pers1);
    }
}
