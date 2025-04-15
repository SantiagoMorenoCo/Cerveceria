
package CerveProyec.Dominio.Entidades;

import java.util.Date;


public class Pago {

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isProcesarPago() {
        return procesarPago;
    }

    public void setProcesarPago(boolean procesarPago) {
        this.procesarPago = procesarPago;
    }
 private int idPago;
 private Venta venta;
 private double monto;
 private Date fechaPago;
 private String metodoPago;
 private boolean procesarPago;

 
 public Pago (int idPago, Venta venta, double monto, Date fechaPago, String metodoPago, boolean procesarPago){
  this.idPago = idPago;
  this.venta = venta;
  this.monto = monto;
  this.fechaPago = fechaPago;
  this.metodoPago = metodoPago;
  this.procesarPago = procesarPago;
 
 }
}
