import java.util.Scanner;

public class Libro {
    public static void main(String[] args) {
        
        Scanner write = new Scanner(System.in);

        // String nombre;
        // int id;
        // double precio;
        // boolean envioGratuito;

        // System.out.println("Proporciona el nombre:");
        // nombre = write.nextLine();

        // System.out.println("Proporciona el id:");
        // id = write.nextInt();

        // System.out.println("Proporciona el precio:");
        // precio = write.nextDouble();

        // System.out.println("Proporciona el envio gratuito:");
        // envioGratuito = write.nextBoolean();

        // System.out.println(nombre + " " + '\u0023' + id);
        // System.out.println("Precio: " + '\u0024' + precio);
        // System.out.println("Envio gratuito: " + envioGratuito);
        String titulo, autor;

        System.out.println("Proporciona el titulo:");
        titulo = write.nextLine();

        System.out.println("Proporciona el titulo:");
        autor = write.nextLine();

        System.out.println("<"+titulo+">"+" fue escrito por \t" + "<"+autor+">");

        write.close();
    }
}
