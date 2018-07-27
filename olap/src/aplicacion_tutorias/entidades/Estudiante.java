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
public class Estudiante {
    private int codigo_e;
    private String nombre ;
    private String apellido ;
    private String cedula ;
    private int codigo_sicoa ;
    private int codigo_periodo ;
    private int codigo_nivel ;

    public Estudiante() {
    }

    public Estudiante(int codigo_e, String nombre, String apellido, String cedula, int codigo_sicoa, int codigo_periodo, int codigo_nivel) {
        this.codigo_e = codigo_e;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.codigo_sicoa = codigo_sicoa;
        this.codigo_periodo = codigo_periodo;
        this.codigo_nivel = codigo_nivel;
    }

    public int getCodigo_e() {
        return codigo_e;
    }

    public void setCodigo_e(int codigo_e) {
        this.codigo_e = codigo_e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }

    public int getCodigo_periodo() {
        return codigo_periodo;
    }

    public void setCodigo_periodo(int codigo_periodo) {
        this.codigo_periodo = codigo_periodo;
    }

    public int getCodigo_nivel() {
        return codigo_nivel;
    }

    public void setCodigo_nivel(int codigo_nivel) {
        this.codigo_nivel = codigo_nivel;
    }

}