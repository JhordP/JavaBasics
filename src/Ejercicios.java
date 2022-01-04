import java.util.Scanner;

public class Ejercicios {

    Scanner in;
    public Ejercicios () {
        in = new Scanner(System.in);
    }

    public void Rectangulo(int base, int altura) {
        int area = base*altura;
        int perimetro = (base*2)+(altura*2);

        System.out.println("El area del rectangulo de "+ base +"cm de base y "
        +altura+"cm de altura es: "+area+"cm cuadr.");

        System.out.println("\nEl perimetro del rectangulo es: "+perimetro+"cm.");
    }

    public void mayorDe2Numeros(int num1, int num2) {
        var mayor = (num1>num2) ? "El numero mayor es "+num1 : "El numero mayor es "+num2;
        System.out.println(mayor); 
    }

    public String Calificacion() 
    {
        System.out.println("Escriba la calificacion del 0 al 10.");
        var nota = Double.parseDouble(in.nextLine());

        if (nota>=0 && nota<=10)
        {
            if (nota>=9 && nota<=10) 
            {
                return "A.";   
            }
            else if (nota>=8 && nota<9)
            {
                return "B.";   
            }
            else if (nota>=7 && nota<8)
            {
                return "C.";   
            }
            else if (nota>=6 && nota <7)
            {
                return "D.";   
            }
            else
            {
                return "F.";   
            }
            
        }
        else
        {
            return "Valor desconocido.";
        }
    }
    public static void main(String[] args) {
        var ejercicio = new Ejercicios();
        System.out.println(ejercicio.Calificacion());

    }
}
