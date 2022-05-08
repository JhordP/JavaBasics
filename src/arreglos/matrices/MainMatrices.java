package arreglos.matrices;
import arreglos.matrices.dominio.Persona;

public class MainMatrices
{
	public static void main(String[] args) {
		int edades[][] = new int[3][2];
		edades[0][0] = 5; //Fila 1, columna 1. [index 0,0]
		edades[0][1] = 7; //Fila 1, columna 2. [index 0,1] etc.
		edades[1][0] = 8;
		edades[1][1] = 4;
		//Representacion grafica del arreglo matriz:
		/* 5 7
		   8 4
		   0 0 Aqui estan en 0 porque no fueron modificados los index [2,0] y [2,1]*/
		   
		//Mostrar los elementos:
		for (int fila=0;fila<edades.length; fila++ ) //length siempre trae el tamaño o la cantidad del renglon o fila del arreglo.
		{
		    for (int columna = 0;columna < edades[fila].length; columna++ ) //edades[fila].length se refiere al tamaño de ESA fila(0, 1 o 2) con respecto a las columnas. (Esa fila tiene x columnas).
		    {
		        System.out.print(edades[fila][columna]+" ");
		    }
		    System.out.println("\n");
		} 
		
		//Declaración simplificada.
		
		//{primera fila{columna1,columna2},segunda fila{columna1,columna2}etc...}
		String frutas[][] = {{"Naranja","Limon"},{"Fresa","Arandano"},{"Manzana","Pera"}}; 

		//Objetos en matrices
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Juan");
		personas[0][1] = new Persona("Karla");
		personas[0][2] = new Persona("Jose");
		personas[1][0] = new Persona("Lisbeth");
		personas[1][1] = new Persona("Raul");
		personas[1][2] = new Persona("Jaqueline");
		imprimir(personas);
	}

	//Metodo para el for
	public static void imprimir(Object matriz[][]) {
		System.out.println("\n"+matriz.getClass().getName());
		for (int f=0; f<matriz.length/*Filas*/ ;f++ ){
		    for (int c=0; c<matriz[f].length/*Cant. de Columnas en la fila*/ ;c++ ){
		        System.out.print(matriz[f][c]+"\t"); //Uso print en vez de println para que no salte la linea.
		    }
		    System.out.println("\n");
		} 
	}
}