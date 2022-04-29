package herencia.domain;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }
    public Date getDate() {
        return this.fechaRegistro;
    }
    public void setDate(Date fecha) {
        this.fechaRegistro = fecha;
    }
    public boolean isVip() {
        return this.vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Cliente]\nID-Cliente: "+this.idCliente).append("\t Fecha de Registro: "+this.fechaRegistro)
        .append("\tVip: "+this.vip).append("\n"+super.toString());

        return sb.toString();
    }
    
}
