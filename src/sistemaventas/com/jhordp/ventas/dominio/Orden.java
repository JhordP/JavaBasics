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
            this.productos[this.contadorProductos++] = producto;
        }
        else {
            System.out.println("Se ha superado el limite de productos por orden.");
            System.out.println("Existen en la compra "+this.contadorProductos+" productos de "+Orden.MAX_PRODUCTOS+" permitidos.");
        }
       
    }

    public double calcularTotal() 
        {
            double total = 0;

            //La variable contadorProductos posee la cantidad de productos que estan en el arreglo en ese momento
            for (int i = 0; i < this.contadorProductos; i++) {
                var producto = this.productos[i]; //almacena en un objeto del tipo Producto el producto del arreglo que se esta iterando.
                total+=producto.getPrecio(); //La variable total se va aumentando en cada ciclo utilizando el precio de cada producto iterado.

                //Forma de como hacer lo de arriba en una sola linea.
                /*total += this.productos[i].getPrecio();*/
            }
            
            return total;
        }

        public void mostrarOrden() {
            System.out.println("Id Orden:"+ this.idOrden);
            System.out.println("Total de la orden: " +this.calcularTotal());

            System.out.println("Productos de la orden: ");
            for (int i = 0; i < this.contadorProductos; i++) {
                System.out.println(this.productos[i]);
                
            }
        }

}
