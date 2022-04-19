package pasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x ="+ x);

        cambioValor(x); //Se envia una copia de la variable debido a que es un valor primitivo y no un tipo object.
        
        System.out.println("nuevo x =" +x); 
        //Debido al scope, la variable modificada en cambioValor no afecta la variable del main. Esto ya que envia una copia de la variable al metodo y esa copia
        //es la que se modifica.

    }

    public static void cambioValor(int arg1) { //static para no tener que crear una instancia.
        System.out.println("arg1 ="+ arg1);
        arg1 = 15; //Este cambio no se refleja en la variable x en main ya que lo que se modifico fue la copia que esta en el scope del metodo.
        
    }
}
