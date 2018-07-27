/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_tutorias.impl;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.Ambitos;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Pc
 */
public class AmbitosImpl implements Serializable{
   
     public static boolean Insertar( Ambitos ambito) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * From  actividades.fninsertar_ambito(?,?,?,?)";
            lstP.add(new Parametro(1, ambito.getCodigo()));
            lstP.add(new Parametro(2, ambito.getNombre()));
            lstP.add(new Parametro(3, ambito.getObservacion()));
            lstP.add(new Parametro(4, ambito.getEstado()));
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
    
    
    public static ArrayList< Ambitos> llenarAmbitos(ConjuntoResultado rs) throws Exception {
        ArrayList<Ambitos> lst = new ArrayList<Ambitos>();
        Ambitos ambito = null;
        try {
            while (rs.next()) {
                ambito = new  Ambitos (rs.getInt("pcodigo"),rs.getString("pnombre"), rs.getString("pobservacion"), rs.getInt("pestado"));
                lst.add(ambito);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
     public static ArrayList<Ambitos> ObtenerAmbitos() throws Exception {
        ArrayList<Ambitos> lst = new ArrayList<Ambitos>();
        try {
            String sql = "SELECT  * from actividades.fn_obtener_datos_ambito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarAmbitos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Ambitos ObtenerAmbitoDadoCodigo(int codigo) throws Exception {
        Ambitos lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * from actividades.fn_obtener_tipo_ambito_dado_codigo(?); ";
            lstP.add(new Parametro(1, codigo));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Ambitos();
            lst = llenarAmbitos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
public static boolean actualizar(Ambitos ambito) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT  * from actividades.fnactualizar_ambito(?,?,?,?)";
            lstP.add(new Parametro(1, ambito.getCodigo()));
            lstP.add(new Parametro(2, ambito.getNombre()));
            lstP.add(new Parametro(3, ambito.getObservacion()));
            lstP.add(new Parametro(4, ambito.getEstado()));
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
 public boolean eliminar(Ambitos ambito) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_ambito(?)";
            lstP.add(new Parametro(1, ambito.getCodigo()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) 
            {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;   
    }
}
