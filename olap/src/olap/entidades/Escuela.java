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
public class Escuela {
   //private int codigo_escuela;
   private int codigo_facultad;
   private String nombre;
   private String descripcion;
   private int codigo_sicoa;

    public Escuela() {
    }

    public Escuela(/*int codigo_escuela,*/ int codigo_facultad, String nombre, String descripcion, int codigo_sicoa) {
        //this.codigo_escuela = codigo_escuela;
        this.codigo_facultad = codigo_facultad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo_sicoa = codigo_sicoa;
    }

    //public int getCodigo_escuela() {
     //   return codigo_escuela;
   // }

   // public void setCodigo_escuela(int codigo_escuela) {
   //     this.codigo_escuela = codigo_escuela;
   // }

    public int getCodigo_facultad() {
        return codigo_facultad;
    }

    public void setCodigo_facultad(int codigo_facultad) {
        this.codigo_facultad = codigo_facultad;
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

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }
   
}