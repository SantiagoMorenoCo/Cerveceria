
package CerveProyec.Dominio.Entidades;

import java.util.Date;
import java.util.List;


public class Venta {
private int idVenta;
private Date fecha;
private Cliente cliente;
private List<DetalleVenta> detalles;
private double calcularSubTotal;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public double getCalcularSubTotal() {
        return calcularSubTotal;
    }

    public void setCalcularSubTotal(double calcularSubTotal) {
        this.calcularSubTotal = calcularSubTotal;
    }

public  Venta (int idVenta,Date fecha,Cliente clientE, List<DetalleVenta> detalles
, double calcularSubTotal){

 }
    
}
