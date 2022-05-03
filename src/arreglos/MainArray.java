package arreglos;

public class MainArray {
    public static void main(String args[]) {
        int edades[] = new int[3]; //Declaracion de arreglo
        System.out.println("edades :" + edades); //Imprime la ref de memoria del array
        
        edades[0] = 10; //Asignando un valor al index 0 del array
        edades[1] = 5; //Al index 1
        edades[2] = 1; //Y al index 2
        System.out.println("Index 0:"+ edades[0]
        +"\nIndex 1:"+ edades[1]+"\nIndex 2:"+edades[2]);
        
        System.out.println("Utilizando for:\n");
        for(int i = 0; i < edades.length; i++) 
        {
            System.out.println("edades["+i+"]"+": "+edades[i]);
        }
        
    }
}