
package CerveProyec.Dominio.Entidades;


public class DetalleVenta {
  private Producto producto;
  private int cantidad;
  private double calcularSubtotal;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCalcularSubtotal() {
        return calcularSubtotal;
    }

    public void setCalcularSubtotal(double calcularSubtotal) {
        this.calcularSubtotal = calcularSubtotal;
    }
  
public DetalleVenta (Producto producto, int cantidad, double calcularSubtotal){
  this.calcularSubtotal = cantidad;
  this.cantidad = cantidad;
  this.producto = producto;
 }
}
