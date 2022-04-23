package estatico.dominio;

public class Persona {
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;

        //Incrementar el contador de persona
        Persona.contadorPersonas++;

        //Asignar el valor a la variable de id
        this.idPersona = Persona.contadorPersonas;
    }
    //Getters & Setters
    public int getIdPersona () {
        return this.idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public String toString() {
        return "[Persona]\n"
              +"ID: "+this.idPersona
              +"\tNombre: "+this.nombre;
    }
}
