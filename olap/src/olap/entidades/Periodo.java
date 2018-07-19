/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.entidades;

import java.sql.Date;

/**
 *
 * @author stian
 */
public class Periodo {
    private int codigo_periodo;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private int tipo;
    private String observaciones;
    private int codigo_sicoa;
    private int estado; 

    public Periodo() {
    }

    public Periodo(int codigo_periodo, String nombre, Date fecha_inicio, Date fecha_fin, int tipo, String observaciones, int codigo_sicoa, int estado) {
        this.codigo_periodo = codigo_periodo;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.tipo = tipo;
        this.observaciones = observaciones;
        this.codigo_sicoa = codigo_sicoa;
        this.estado = estado;
    }

    public int getCodigo_periodo() {
        return codigo_periodo;
    }

    public void setCodigo_periodo(int codigo_periodo) {
        this.codigo_periodo = codigo_periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
