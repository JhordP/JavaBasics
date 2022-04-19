package person;

public class Persona {

    public Persona() {
        
    }

    //Atributos
    public String nombre;
    public String apellido;
    
    //Metodos
    public void desplegarInfo() 
    {
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu apellido es: "+apellido);
    }

}
