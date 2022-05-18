package ventaspc.com.jhordp.mundopc;

public class DispositivoEntrada {
    
    //Atributos
    private String tipoEntrada;
    private String marca;
    
    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    //Get&Set

    public String getTipoEntrada(){
        return this.tipoEntrada;
    }
    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void set(String marca){
        this.marca = marca;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Tipo de Entrada: "+this.tipoEntrada)
              .append("\tMarca: "+this.marca);
        
        return cadena.toString();
    }
    
}

