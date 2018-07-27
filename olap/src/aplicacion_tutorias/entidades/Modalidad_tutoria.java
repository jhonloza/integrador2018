/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_tutorias.entidades;

/**
 *
 * @author Mi Pc
 */
public class Modalidad_tutoria {
 private int  codigo_m;
 private  String nombre; 
 private String descripcion ;
 private int estado;

    public Modalidad_tutoria() {
    }

    public Modalidad_tutoria(int codigo_m, String nombre, String descripcion, int estado) {
        this.codigo_m = codigo_m;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo_m() {
        return codigo_m;
    }

    public void setCodigo_m(int codigo_m) {
        this.codigo_m = codigo_m;
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