package ventaspc.com.jhordp.mundopc;

public class Computadora {
    //Atributos
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorComputadoras;
    
    //Constructor
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }
    
    //Get&Set
        //idComputadora
    public int getIdComputadora() {
        return this.idComputadora;
    }
    
        //Nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        //Monitor
    public Monitor getMonitor(){
        return this.monitor;
    }
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    
        //Teclado
    public Teclado getTeclado() {
        return this.teclado;
    }
    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }
        //Mouse
    public Mouse getMouse(){
        return this.mouse;
    }
    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append("[Computadora]\nPC ID: "+this.idComputadora)
              .append("\nNombre PC: "+this.nombre).append("\nMonitor:\n"+this.monitor)
              .append("\nTeclado: "+this.teclado).append("\nMouse: "+this.mouse);
        return cadena.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
