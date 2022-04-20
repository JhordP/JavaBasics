package pasoPorReferencia;
import person.*;

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        System.out.println("Nombre p1:"+p1.nombre);

        cambioValor(p1); //Se envia la instancia (la referencia de memoria a la que apunta)
        System.out.println("Nombre p1 modificado:"+p1.nombre); //Al cambiar el valor dentro de la instancia, se muestra el valor modificado.
    }

    public static void cambioValor(Persona persona) { //El metodo recibe por argumento la referencia, es decir, la instancia como tal.
        
        persona.nombre = "Karla"; 
        //Se modifica el valor, pero NO como una copia de variable en el scope del metodo, sino como la instancia
        // de la clase a la que se le hizo referencia de memoria, y cambia el valor de a la que apunta la referencia. (Ir a linea 12)
    }
    
}
