package sistemaventas.com.jhordp.ventas.dominio;

public class Producto
{
    //Atributos de la clase
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //Constructores
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;  
    }
    
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Get & Set
    
        /*idProducto*/
    public int getIdProducto() { 
        return this.idProducto;
    }
        
        /*Nombre*/
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        /*Precio*/
    public double getPrecio() {
        return this.precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nID Producto: "+this.idProducto+"\n").append("Nombre Producto:"+this.nombre+"\n")
          .append("Precio Producto: "+this.precio+" pesos\n");
        
        return "[PRODUCTO]\n"+sb.toString();
    }
    
}
