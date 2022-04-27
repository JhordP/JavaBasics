package herencia;


import java.util.Date;

import herencia.domain.Cliente;
import herencia.domain.Empleado;

public class MainHerencia {
    public static void main(String[] args) {
        // Empleado empleado1 = new Empleado("Juan", 50000.00);
        // System.out.println(empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Villa Mella");
        System.out.println(cliente1);

        
    }
    
}
