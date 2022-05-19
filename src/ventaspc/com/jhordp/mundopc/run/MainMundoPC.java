package ventaspc.com.jhordp.mundopc.run;
import ventaspc.com.jhordp.mundopc.*;

public class MainMundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("Hewlett-Packard", 14);
        Teclado tecladoHP = new Teclado("Bluetooth", "Hewlett-Packard");
        Mouse mouseHP = new Mouse("Alambrico", "Hewlett-Packard");

        Monitor monitorMSI = new Monitor("MSI", 32);
        Teclado tecladoMSI = new Teclado("Inalambrico", "MSI");
        Mouse mouseMSI = new Mouse("Inalambrico", "MSI");

        Computadora pcHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHP);
        Computadora pcMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, mouseMSI);

        Monitor tv = new Monitor("Winia", 34);
        Teclado tecladoacer = new Teclado("Acer", "Nitro-5");
        Computadora laptopC = new Computadora("EsclavaPC", tv, tecladoacer, mouseMSI);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(pcHP);
        orden1.agregarComputadora(pcMSI);
        orden1.agregarComputadora(laptopC);

        orden1.mostrarOrden();
    }
}
