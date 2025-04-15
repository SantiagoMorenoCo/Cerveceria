
package CerveProyec.Dominio.Entidades;


public class Cliente {
 private int idcliente;
 private String nombre;
 private String telefono;
 private String correo;

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
 
 public Cliente (int idcliente, String nombre, String telefono, String correo){
 this.idcliente = idcliente;
 this.correo = correo;
 this.nombre = nombre;
 this.telefono = telefono;
 
 
 }
    
}
