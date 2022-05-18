package ventaspc.com.jhordp.mundopc;

public class Monitor {
    //Atributos
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    //Constructor
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }
    
    //get&set
    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTamano(){
        return this.tamano;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Monitor ID: "+this.getIdMonitor()+"\n")
              .append("Marca Monitor: "+this.getMarca()+"\n")
              .append("Tamaño: "+this.getTamano());
        return cadena.toString();
    } 
}
