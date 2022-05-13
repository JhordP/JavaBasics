package sistemaventas.com.jhordp.ventas;
import sistemaventas.com.jhordp.ventas.dominio.*;

public class MainVentas {

    public static void main(String[] args) {
        var Prod1 = new Producto("Camisa", 50.45);
        var Prod2 = new Producto("Pantalon", 100.00);

        var orden = new Orden();
        orden.agregarProducto(Prod1);
        orden.agregarProducto(Prod2);
        orden.mostrarOrden();
    }

}
