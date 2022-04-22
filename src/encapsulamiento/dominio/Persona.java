package encapsulamiento.dominio;


public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //-Propiedades get & set. 
    //Get retorna el valor del atributo. Set recibe un parametro y modifica un atributo a traves de el.
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { //Al ser el Get del Boolean se utiliza is[Variable]
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String toString() {
        return "[PERSONA]\nNombre: "+this.nombre
              +"-- Sueldo: "+this.sueldo
              +"-- Estatus Elim. :"+this.eliminado;
    }
}
