
package CerveProyec.Dominio.Entidades;
import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private int idInventario;
    private Map<Producto, Integer> productos;

    public Inventario(int idInventario) {
        this.idInventario = idInventario;
        this.productos = new HashMap<>();
    }

    public void actualizarStock(Producto producto, int cantidad) {
        productos.put(producto, cantidad);
    }

    public boolean verificarDisponibilidad(Producto producto, int cantidad) {
        return productos.getOrDefault(producto, 0) >= cantidad;
    }

    public void generarAlertaStockBajo(int umbral) {
        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            if (entry.getValue() < umbral) {
                System.out.println("Alerta: stock bajo de " + entry.getKey().getNombre());
            }
        }
    }

    public void registrarEntrada(Producto producto, int cantidad) {
        productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
    }

    public void registrarSalida(Producto producto, int cantidad) {
        if (verificarDisponibilidad(producto, cantidad)) {
            productos.put(producto, productos.get(producto) - cantidad);
        } else {
            System.out.println("No hay suficiente stock de " + producto.getNombre());
        }
    }

    // Getters y setters si los necesitas
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public Map<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(Map<Producto, Integer> productos) {
        this.productos = productos;
    }
}
