
package CerveProyec.Dominio.Entidades;

import java.util.Date;


public class Factura {

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCalcularImpuestos() {
        return calcularImpuestos;
    }

    public void setCalcularImpuestos(double calcularImpuestos) {
        this.calcularImpuestos = calcularImpuestos;
    }
    
private int idFactura;
private Pago pago;
private Date fechaEmision;
private double subtotal;
private double impuestos;
private double total;
private double calcularImpuestos;

public Factura (int idFactura, Pago pago, Date fechaEmision, double subTotal, double impuestos, double total, double calcularImpuestos){
 this.idFactura = idFactura;
 this.pago = pago;
 this.fechaEmision = fechaEmision;
 this.subtotal = subTotal;
 this.impuestos = impuestos;
 this.total = total;
 this.calcularImpuestos = calcularImpuestos;

}
  
}


