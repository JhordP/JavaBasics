import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // int num = 10;
        // System.out.println(num);

        // num /=5;
        // System.out.println(num);

        // String cadena = "Cad";
        // System.out.println(cadena);

        // var x = 10;
        // var y = "10";

        // System.out.println(x+y);

        //= \t significa tabulador de texto, a diferencia de \n que es un salto de linea.
        // System.out.println("Nombre \t \t Apellido\nJhordany\tPolanco\nCarlaFra\tAvendano");

        //=Por alguna razon hay un comando \b para Backspace en el texto.
        // System.out.println("Borrar \b\bEspacio."); //Cada vez que se use el comando borrara un caracter.

        //=Comillas simples y dobles en un texto
        // System.out.println(" \'Comillas Simples\' ");
        // System.out.println(" \"Comillas dobles\" ");

        // System.out.println("Cual es tu nombre?");
        Scanner writter = new Scanner(System.in); //belongs to the java.util package.
        // String nombre = writter.nextLine();

        // System.out.println("Saludos, "+ nombre);

        // System.out.println("Valor min de short:" +Short.MIN_VALUE);
        // System.out.println("Valor max de short:" +Short.MAX_VALUE);

        // System.out.println(Double.MAX_VALUE);

        //=Traer el tipo de dato siempre que no sea un tipo de dato primitivo.
        // var varVar = "10";
        // System.out.println(varVar.getClass().getName());

        //=boolean
        // boolean bool = true;
        // System.out.println(bool);

        // int numero = 5;

        // bool = numero<5; //Se le puede asignar una expresion de consulta, que en este caso es false.
        // System.out.println(bool);

        //=aritmetica

        // int a=3, b=2;
        // var result = a+b;
        // System.out.println(result);

        // result = a-b;
        // System.out.println(result);

        // result = a*b;
        // System.out.println(result);

        // result = a/b;
        // System.out.println(result);

        //=Invertir valores

        // var a = 2;
        // var b = -a;
        // System.out.println(a); System.out.println(b);

        // var c = true;
        // var d = !c;
        // System.out.println(c); System.out.println(d);

        // //=Incremento
        // var e = 3;
        // var f = ++e; //pre-incremento
        // System.out.println(e); //El valor de 'e' se modifica tambien al incrementarlo para asignarlo a 'f'.
        // System.out.println(f);

        // var g = 5;
        // var h = g++; //post-incremento

        // System.out.println(g); 
        // System.out.println(h); //Asigna el valor a 'h' primero, con el valor que tiene, y luego 'g' se aumenta.
        // //NOTA: Funciona igual con el decremento.

        //=Relacionales
        // var a = 3;
        // var b = 2;
        // var c = (a == b); //Algo nuevo, esto causa un booleano que evalua lo que esta en los parentesis. 
        // System.out.println(c); //Arroja false.

        // var d = (a != b);
        // System.out.println(d);//Arroja true.

        
        // var cadena1 = "Hola";
        // var cadena2 = "Holaa";
        // var e = (cadena1==cadena2); //Dice el profe que esto evalua la referencia de memoria, pero...
        // System.out.println(e);//...Al validarlo funciona correctamente.

        // var f = (cadena1.equals(cadena2)); //Por eso dique hay que usar .equals() pero BUEH.
        // System.out.println(f); //La vaina es que parece como si funcionan igual.

        //==Condicionales
        // var a = -1;
        // var valorMin = 0;
        // var valorMax = 10;

        // //(booleana)Puede incluso tomar operaciones de condiciones multiples como AND, OR, ETC.
        // var result = ((a >= valorMin) && (a <= valorMax)); 

        // System.out.println(result);

        //==Ternario
        // var a=3;
        // var b=2;

        // /*Esto asigna a la variable un valor u otro de los que esta despues del signo de interrogacion
        // dependiendo si la condicion es TRUE o FALSE. En caso de TRUE el valor izq, de lo contrario el derecho.*/
        // var resultado = (a > b) ? "verdadero" : "falso";
        // System.out.println(resultado); //Imprime verdadero por razones obvias de que la condicion se cumple.
        
        //==Condiciones

        // var condicion = false;

        // if(condicion) //Valida si la condicion es verdadera porque es un booleano y el default es TRUE.
        // {
        //     System.out.println("Condicion verdadera.");
        // } else 
        // {
        //     System.out.println("Condicion falsa.");
        // }

        //==Switch
        // int num;
        // var numText = "";
        
        // System.out.println("Escriba un numero del 1 al 4.");
        // num = Integer.parseInt(writter.nextLine());

        // switch (num) {
        //     case 1:
        //         numText = "Uno.";
        //         break;
        //     case 2:
        //         numText = "Dos.";
        //         break;
        //     case 3:
        //         numText = "Tres.";
        //         break;
        //     case 4:
        //         numText = "Cuatro.";
        //         break;

        //     default:
        //         numText = "Numero fuera de rango.";
        //         break;
        // }

        // System.out.println(numText);

        // System.out.println("Escribe el mes para saber la estacion.");
        // var mes = Integer.parseInt(writter.nextLine());
        // var estacion = "Estacion desconocida.";

        // switch (mes) {
        //     case 12: case 1: case 2: //Tu ve yo no sabia que esto funcionaba como un OR. Switch multiple
        //         estacion = "Invierno.";
        //         break;
        //     case 3: case 4: case 5:
        //         estacion = "Primavera.";
        //         break;
        //     case 6: case 7: case 8:
        //         estacion = "Verano.";
        //         break;
        //     case 9: case 10: case 11:
        //         estacion = "Otono.";
        //         break;
        
        //     default:
        //         break;
        // }
        // System.out.println(estacion);

        //==While
        //     int contador = 0;

        //     while (contador < 3) {
        //         System.out.println(contador);
        //         contador++;
        //     }

        // //==For
        //     for (int i = 0; i > -5; i--) 
        //     {
        //         System.out.println(i);    
        //     }
        
        //==Break y continue
        // for (int i = 0; i < 1; i--) 
        // {
        //     System.out.println(i);    
        //     if (i == -100) {
        //         break;
        //     }
        // }

        // for (int i = 0; i < 100; i++) 
        // {    
        //     if (i%2 == 0) {
        //         continue; //Pasa a la proxima validacion en el ciclo saliendo de la que está en el momento.
        //     }
        //     System.out.println(i); //Muestra solo los numeros impares.
        // }

        writter.close();
    }
}
