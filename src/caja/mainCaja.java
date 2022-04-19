package caja;

public class MainCaja {
    public static void main(String[] args) {

        var calcular1 = new Caja();
        calcular1.ancho = 3;
        calcular1.alto = 2;
        calcular1.profundo = 6;
        System.out.println("Desde constr vacio: "+calcular1.volumenCaja());

        //Hace lo mismo que las lineas anteriores, mas simplificado.
        var calcular2 = new Caja(3,2,6).volumenCaja();
        System.out.println("Desde constr con args: "+calcular2);
    }
}
