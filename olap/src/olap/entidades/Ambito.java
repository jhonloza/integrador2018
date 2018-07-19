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
public class Ambito {
    
    //private int codigo_ambito;
    private String nombre;
    private String observacion;
    private int estado;

    public Ambito() {
    }

    public Ambito( String nombre, String observacion, int estado) {
        //this.codigo_ambito = codigo_ambito;
        this.nombre = nombre;
        this.observacion = observacion;
        this.estado = estado;
    }

   // public int getCodigo_ambito() {
       //return codigo_ambito;
  //}

   // public void setCodigo_ambito(int codigo_ambito) {
     //   this.codigo_ambito = codigo_ambito;
   // }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
