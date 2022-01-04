package operaciones;

public class MainAritmetica 
{
    public static void main(String[] args) {
        var arit1 = new Aritmetica();
        arit1.a = 5;
        arit1.b = 3;
        arit1.sumar();

        var arit2 = new Aritmetica(2,7);
        // arit2.a = 2;
        // arit2.b = 7;
        arit2.sumar();

        int result = arit1.sumar(arit1.a,arit2.b);
        System.out.println("Resultado return: "+result);
    }    
}
