package progra_taller.rnegocio.entidades;

import java.util.*;

public class Etiqueta_publicaciones {

    private int Id_Eti_pub;
    private Etiquetas etiquetas;
    private Publicaciones publicaciones;
    private Date Creado;
    private Date Actualizado;

    public Etiqueta_publicaciones() {
    }

    public Etiqueta_publicaciones(int Id_Eti_pub, Etiquetas etiquetas, Publicaciones publicaciones, Date Creado, Date Actualizado) {
        this.Id_Eti_pub = Id_Eti_pub;
        this.etiquetas = etiquetas;
        this.publicaciones = publicaciones;
        this.Creado = Creado;
        this.Actualizado = Actualizado;
    }

    public Date getActualizado() {
        return Actualizado;
    }

    public void setActualizado(Date Actualizado) {
        this.Actualizado = Actualizado;
    }

    public int getId_Eti_pub() {
        return Id_Eti_pub;
    }

    public void setId_Eti_pub(int Id_Eti_pub) {
        this.Id_Eti_pub = Id_Eti_pub;
    }

    public Etiquetas getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Etiquetas etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Date getCreado() {
        return Creado;
    }

    public void setCreado(Date Creado) {
        this.Creado = Creado;
    }

}
