package progra_taller.rnegocio.entidades;
import java.util.Date;
public class Niveles {
    private int idniveles;
    private String nombre;
    private Date creado;
    private Date actualizado;

    public Niveles() {
    }

    public Niveles(int idniveles, String nombre, Date creado, Date actualizado) {
        this.idniveles = idniveles;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    }

    public int getIdniveles() {
        return idniveles;
    }

    public void setIdniveles(int idniveles) {
        this.idniveles = idniveles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }
    
}
