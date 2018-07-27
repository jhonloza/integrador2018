/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_tutorias.impl;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.Estudiante;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Pc
 */
public class EstudianteImpl implements Serializable {
     public static boolean Insertar( Estudiante estudiante ) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * From  actividades.fninsertar_estudiante(?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, estudiante .getCodigo_e()));
            lstP.add(new Parametro(2, estudiante .getNombre()));
            lstP.add(new Parametro(3, estudiante .getApellido()));
            lstP.add(new Parametro(4, estudiante .getCedula()));
            lstP.add(new Parametro(5, estudiante .getCodigo_sicoa()));
            lstP.add(new Parametro(6, estudiante .getCodigo_periodo()));
            lstP.add(new Parametro(7,estudiante.getCodigo_nivel()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
     //   estudiante = new Estudiante(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("papellido"), rs.getString("pcedula"), rs.getInt("pcodigo_sicoa"), rs.getInt("pcodigo_periodo"), rs.getInt("pcodigo_nivel");
public static ArrayList<Estudiante> llenarEstudiantes(ConjuntoResultado rs) throws Exception {
        ArrayList<Estudiante> lst = new ArrayList<Estudiante>();
        Estudiante estudiante = null;
        try {
            while (rs.next()) {
                 estudiante = new Estudiante (rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("papellido"), rs.getString("pcedula"), rs.getInt("pcodigo_sicoa"), rs.getInt("pcodigo_periodo"), rs.getInt("pcodigo_nivel"));
                lst.add( estudiante);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
 public static ArrayList<Estudiante> ObtenerEstudiantes() throws Exception {
        ArrayList<Estudiante> lst = new ArrayList<Estudiante>();
        try {
            String sql = "select * from actividades.fn_obtener_estudiante()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarEstudiantes(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
 
 
  public static Estudiante ObtenerEstudianteDadoCodigo(int codigo_e) throws Exception {
      Estudiante lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_estudiante_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_e));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new  Estudiante();
            lst = llenarEstudiantes(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
  public static boolean actualizar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fnactualizar_estudiante(?,?,?,?,?,?,?)";
               lstP.add(new Parametro(1, estudiante .getCodigo_e()));
            lstP.add(new Parametro(2, estudiante .getNombre()));
            lstP.add(new Parametro(3, estudiante .getApellido()));
            lstP.add(new Parametro(4, estudiante .getCedula()));
            lstP.add(new Parametro(5, estudiante .getCodigo_sicoa()));
            lstP.add(new Parametro(6, estudiante .getCodigo_periodo()));
            lstP.add(new Parametro(7,estudiante.getCodigo_nivel()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
  
   public static boolean eliminar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_estudiante(?)";
            lstP.add(new Parametro(1, estudiante.getCodigo_e()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
}