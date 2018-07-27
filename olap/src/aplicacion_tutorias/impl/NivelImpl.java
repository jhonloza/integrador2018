/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_tutorias.impl;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class NivelImpl implements Serializable{
     public static boolean Insertar( Nivel nivel ) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * From  actividades.fninsertar_nivel(?,?,?,?,?,?)";
            lstP.add(new Parametro(1, nivel .getCodigo_n()));
            lstP.add(new Parametro(2, nivel .getCodigo_sicoa()));
            lstP.add(new Parametro(3, nivel.getNombre()));
            lstP.add(new Parametro(4, nivel .getParalelo()));
            lstP.add(new Parametro(5, nivel .getModalidad()));
            lstP.add(new Parametro(6, nivel .getCodigo_escuela()));
            
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
public static ArrayList<Nivel> llenarNivel(ConjuntoResultado rs) throws Exception {
        ArrayList<Nivel> lst = new ArrayList<Nivel>();
        Nivel nivel = null;
        try {
            while (rs.next()) {
                 nivel = new Nivel (rs.getInt("pcodigo"),rs.getInt("pcodigo_sicoa"), rs.getString("pnombre"), rs.getString("pparalelo"), rs.getString("pmodalidad"), rs.getInt("pcodigo_escuela"));
                lst.add( nivel);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
 public static ArrayList<Nivel> ObtenerNivel() throws Exception {
        ArrayList<Nivel> lst = new ArrayList<Nivel>();
        try {
            String sql = "select * from actividades.fn_obtener_nivel()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNivel(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
 
 
  public static Nivel ObtenerNivelDadoCodigo(int codigo_n) throws Exception {
      Nivel lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_nivel_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_n));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new  Nivel();
            lst = llenarNivel(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
  public static boolean actualizar(Nivel nivel) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fnactualizar_nivel(?,?,?,?,?,?)";
           lstP.add(new Parametro(1, nivel .getCodigo_n()));
            lstP.add(new Parametro(2, nivel .getCodigo_sicoa()));
            lstP.add(new Parametro(3, nivel.getNombre()));
            lstP.add(new Parametro(4, nivel .getParalelo()));
            lstP.add(new Parametro(5, nivel .getModalidad()));
            lstP.add(new Parametro(6, nivel .getCodigo_escuela()));
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
  
   public static boolean eliminar(Nivel nivel) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_nivel(?)";
            lstP.add(new Parametro(1, nivel.getCodigo_n()));
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
