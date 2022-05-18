package ventaspc.com.jhordp.mundopc;

public class Teclado extends DispositivoEntrada{
    //Atributos
    private final int idTeclado;
    private static int contadorTeclado;
    
        //Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }
    
    //toString
    @Override 
    public String toString(){
        return "Teclado ID: "+this.idTeclado+"\n"+super.toString();
    }
}