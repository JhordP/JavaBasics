package herencia.domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorID;

    /*
    public Empleado(String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); //Super envia estos parametros al constructor de la clase padre (Debe estar como primera instruccion del metodo)

    }*/

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorID;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //Clase StringBuilder para que no se creen nuevos objetos por cada cadena.
        //Simplemente usar el metodo append para añadir informacion al objeto. 
        
        //En el caso de "Nombre" que es heredado se puede usar super.atributo o this.nombre porque es la misma instancia.
        sb.append("\nId Empleado: "+this.idEmpleado).append("\tSueldo: "+this.sueldo).append("\tNombre: "+super.nombre); 

        return sb.toString();
    }
}
