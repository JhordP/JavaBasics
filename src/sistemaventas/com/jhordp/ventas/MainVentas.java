package sistemaventas.com.jhordp.ventas;
import sistemaventas.com.jhordp.ventas.dominio.*;
import java.util.Scanner;

public class MainVentas {
    
    public static void main(String[] args) {
        Producto items[] = new Producto[10];    
        var in = new Scanner(System.in);
        int cantProd;
        do {
        System.out.println("¿Cuantos productos va a agregar?");
            cantProd = in.nextInt();
            if ((cantProd <= 10) && (cantProd >=1)) {
                Procesar(cantProd);
            } else {
                System.out.println("La cantidad de productos no puede ser mayor que 10 o menor que 1.");
            }
        } while((cantProd > items.length) || (cantProd < 1));
        in.close();

    }

    private static void Procesar(int cantidad) {
        var in = new Scanner(System.in);
        var orden = new Orden();
        String nomProd;
        Double precioProd;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Agregue el producto num "+i);
            System.out.println("\nNombre del Producto: "); nomProd = in.next();
            System.out.println("\nPrecio del Producto: "); precioProd = Double.parseDouble(in.next());
            orden.agregarProducto(new Producto(nomProd, precioProd));
        }
        in.close();
        orden.mostrarOrden();
    }
}
