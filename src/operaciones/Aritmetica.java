package operaciones;

public class Aritmetica 
{
    //Attribs
    int a,b;
    public Aritmetica()
    {
        
    }

    public Aritmetica(int a, int b) 
    {
        this.a = a;
        this.b = b;
    }

    //Function/Method
    public void sumar() 
    {
        int resultado = a+b;
        System.out.println("Resultado =" + resultado); 
    }

    public int sumar(int a, int b)
    {
        return (a+b);
    }

}
