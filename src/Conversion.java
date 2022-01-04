
public class Conversion {
    public static void main(String[] args) {
        //Los metodos parse de cada tipo toman un string como parametro por lo que no se puede
        //utilizar para conversiones que no impliquen un string.
        var edad = Integer.parseInt("10");

        //Realizando una conversion explicita, entonces se puede convertir de un tipo a otro siempre que se pueda.
        var num = (int)20.5F; 

        System.out.println(num);
        System.out.println(String.valueOf(edad));

        //De string a char.
        var caracter = "hola".charAt(0);
        System.out.println(caracter);

        //Inventando hacer un substring por mi cuenta
        String cadena = "HolaMundo";
        char[] caracteres = new char[3];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = cadena.charAt(i);
        }
        System.out.println(String.valueOf(caracteres)); //Convierto en string el char array

        //El metodo substring se utiliza desde la variable. Y el index del begin es inclusive en la nueva cadena.
        String cad = "Mochila";
        System.out.println(cad.substring(3));
        System.out.println(cad.substring(1,4)); //El index del End NO es inclusive dentro de la nueva cadena.

        

    }
}
