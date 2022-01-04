package clases;
import java.util.*;

public class Objects 
{
    public static void main(String[] args) {
        var persona = new Persona();

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        persona.nombre = input.nextLine();
        System.out.println("Escribe tu apellido:");
        persona.apellido = input.nextLine();

        persona.desplegarInfo();
        input.close();
        
    }    
}
