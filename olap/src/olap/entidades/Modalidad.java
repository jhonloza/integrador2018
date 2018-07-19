/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.entidades;

/**
 *
 * @author stian
 */
public class Modalidad {
 private int codigo_modalidad;
 private String nombre;
 private String descripcion;
 private int estado;

    public Modalidad() {
    }

    public Modalidad(int codigo_modalidad, String nombre, String descripcion, int estado) {
        this.codigo_modalidad = codigo_modalidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_modalidad() {
        return codigo_modalidad;
    }

    public void setCodigo_modalidad(int codigo_modalidad) {
        this.codigo_modalidad = codigo_modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

 
}
