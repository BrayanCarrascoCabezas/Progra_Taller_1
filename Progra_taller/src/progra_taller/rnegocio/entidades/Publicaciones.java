/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra_taller.rnegocio.entidades;

import java.util.Date;

/**
 *
 * @author flavi
 */
public class Publicaciones {
    private int idpublicaciones;
    private int usuario_id;
    private int nivel_id;
    private String titulo;
    private String contenido;
    private int publicado;
    private int vistas;
    private Double votos;
    private Date creado;
    private Date actualizado;

    public Publicaciones() {
    }

    public Publicaciones(int idpublicaciones, int usuario_id, int nivel_id, String titulo, String contenido, int publicado, int vistas, Double votos, Date creado, Date actualizado) {
        this.idpublicaciones = idpublicaciones;
        this.usuario_id = usuario_id;
        this.nivel_id = nivel_id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.publicado = publicado;
        this.vistas = vistas;
        this.votos = votos;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdpublicaciones() {
        return idpublicaciones;
    }

    public void setIdpublicaciones(int idpublicaciones) {
        this.idpublicaciones = idpublicaciones;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(int nivel_id) {
        this.nivel_id = nivel_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPublicado() {
        return publicado;
    }

    public void setPublicado(int publicado) {
        this.publicado = publicado;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public Double getVotos() {
        return votos;
    }

    public void setVotos(Double votos) {
        this.votos = votos;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    }
    
    
    
}
