//MainArrayObject:
package arreglos;
import dominio.Persona;

public class MainArrayObject{
    
    public MainArrayObject() {
        MainArrayObject.run();
    }
    public static void run(){
        Persona personas[] = new Persona[3]; //Se instancia un objeto colocandole los [] de arreglo.
        
        //Cada elemento del arreglo funciona como un objeto o instancia individial. Simplemente que se estan agrupando.
        personas[0] = new Persona("Jose");
        personas[1] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        
        System.out.println("persona 0: "+personas[0]);
        System.out.println("persona 1: "+personas[1]);
        System.out.println("persona 2: "+personas[2].getNombre());
        
    }
}