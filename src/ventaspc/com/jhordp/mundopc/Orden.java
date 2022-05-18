package ventaspc.com.jhordp.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }

        else{
            System.out.println("Has superado el limite de PC por orden: "+Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        for (Computadora computadora : this.computadoras) {
            System.out.println(computadora+"\n----"); 
        }
    }
}
