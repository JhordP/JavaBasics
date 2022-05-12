package sistemaventas.com.jhordp.ventas.dominio;

public class Orden {
    //Atributos de la clase
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //Metodos
    public void agregarProducto(Producto producto) {

        //Si la cantidad de productos del objeto(Orden) es menor que el maximo de productos
        //Entonces, para que no de un OutOfBoundsException, se continua el proceso.
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {

            //Se agrega el producto(objeto) en posicion del arreglo y luego se aumenta la variable.
            productos[contadorProductos++] = producto;
        }
        else {
            System.out.println("Se ha superado el limite de productos por orden.");
            System.out.println("Existen en la compra "+contadorProductos+" productos de "+MAX_PRODUCTOS+" permitidos.");
        }
    }

}
