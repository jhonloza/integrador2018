/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_tutorias.impl;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.Modalidad_tutoria;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mi Pc
 */
public class Modalidad_tutoriaImpl implements  Serializable   {
    
    public static boolean Insertar( Modalidad_tutoria modalidad_tutoria ) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * From  actividades.fninsertar_modalidad_tutoria(?,?,?,?)";
            lstP.add(new Parametro(1, modalidad_tutoria.getCodigo_m()));
            lstP.add(new Parametro(2, modalidad_tutoria.getNombre()));
            lstP.add(new Parametro(3, modalidad_tutoria.getDescripcion()));
            lstP.add(new Parametro(4, modalidad_tutoria.getEstado()));
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
    
     public static ArrayList<Modalidad_tutoria> llenarModalidades(ConjuntoResultado rs) throws Exception {
        ArrayList<Modalidad_tutoria> lst = new ArrayList<Modalidad_tutoria>();
        Modalidad_tutoria modalidad_tutoria = null;
        try {
            while (rs.next()) {
                modalidad_tutoria = new Modalidad_tutoria (rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pdescripcion"), rs.getInt("pestado"));
                lst.add(modalidad_tutoria);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
     
       public static ArrayList<Modalidad_tutoria> ObtenerModalidades() throws Exception {
        ArrayList<Modalidad_tutoria> lst = new ArrayList<Modalidad_tutoria>();
        try {
            String sql = "select * from actividades.fn_obtener_modalidad_tutoria()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarModalidades(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
       public static Modalidad_tutoria ObtenerModalidadDadoCodigo(int codigo_m) throws Exception {
       Modalidad_tutoria lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_modalidad_tutoria_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_m));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Modalidad_tutoria();
            lst = llenarModalidades(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
       
       
       public static boolean actualizar(Modalidad_tutoria modalidad_tutoria) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fnactualizar_modalidad_tutoria(?,?,?,?)";
             lstP.add(new Parametro(1, modalidad_tutoria.getCodigo_m()));
            lstP.add(new Parametro(2, modalidad_tutoria.getNombre()));
            lstP.add(new Parametro(3, modalidad_tutoria.getDescripcion()));
            lstP.add(new Parametro(4, modalidad_tutoria.getEstado()));
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
        public static boolean eliminar(Modalidad_tutoria modalidad_tutoria) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_modalidad_tutoria(?)";
            lstP.add(new Parametro(1, modalidad_tutoria.getCodigo_m()));
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
