//package ventaspc.com.jhordp.mundopc

public class Mouse extends DispositivoEntrada{
    //Atributos
    private final int idMouse;
    private static int contadorMouse;
    
    //Constructor
    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = ++Mouse.contadorMouse;
    }
    
    //toString
    @Override 
    public String toString(){
        return "Mouse ID: "+this.idMouse+"\n"+super.toString();
    }
}