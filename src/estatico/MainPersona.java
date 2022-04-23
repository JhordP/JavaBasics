package estatico;
import estatico.dominio.Persona;

public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");     
        //Como tiene un ToString, la clase automaticamente al utilizar el objeto, utiliza ese metodo.
        System.out.println("Persona 1:\n"+p1); 

        Persona p2 = new Persona("Karla");
        System.out.println("Persona 2:\n"+p2); 

    }
}
