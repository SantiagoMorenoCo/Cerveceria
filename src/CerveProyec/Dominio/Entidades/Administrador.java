
package CerveProyec.Dominio.Entidades;


public class Administrador {

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
  private int idAdmin;
  private String nombre;
  private String cargo;
 
public Administrador(int idAdmin, String nombre, String cargo){
 this.idAdmin = idAdmin;
 this.cargo = cargo;
 this.cargo = cargo;
 
 }
}
