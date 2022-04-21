package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("Nombre: "+persona.nombre);
        System.out.println("Apellido: "+persona.apellido);

    }
}

class Persona {
    String nombre;
    String apellido;

    Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("Usando this: "+this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    public void imprimir(Persona persona) {
        System.out.println("Persona desde imprimir: "+persona); //Imprime la referencia de memoria del objeto persona en uso.
        System.out.println("Usando this desde imprimir para el objeto actual: " +this); //Imprime la referencia de memoria del objeto Imprimir ya que this en este caso es imprimir.

    }
}