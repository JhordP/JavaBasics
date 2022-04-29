package operaciones;

public class MainOperaciones {
    public static void main(String[] args) {
        System.out.println(Operaciones.sumar(2, 3)); //Llama al sumar int porque recibe parámetros enteros
        System.out.println(Operaciones.sumar(2.5, 1.5)); //Llama al sumar int porque recibe parámetros tipo double
    }
}
