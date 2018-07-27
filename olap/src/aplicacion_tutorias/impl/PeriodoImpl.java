
package aplicacion_tutorias.impl;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;


public class PeriodoImpl implements Serializable{
    public static boolean Insertar( Periodo periodo ) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * From  actividades.fninsertar_periodo(?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, periodo .getCodigo_p()));
            lstP.add(new Parametro(2, periodo .getNombre()));
            lstP.add(new Parametro(3, periodo .getFecha_inicio()));
            lstP.add(new Parametro(4, periodo .getFecha_fin ()));
            lstP.add(new Parametro(5, periodo .getTipo ()));
            lstP.add(new Parametro(6, periodo .getObservaciones()));
            lstP.add(new Parametro(7,periodo.getCodigo_sicoa()));
            lstP.add(new Parametro(8,periodo.getEstado()));
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
   public static ArrayList<Periodo> llenarPeriodo(ConjuntoResultado rs) throws Exception {
        ArrayList<Periodo> lst = new ArrayList<Periodo>();
        Periodo periodo = null;
        try {
            while (rs.next()) {
                 periodo = new Periodo (rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getDate("pfecha_inicio"), rs.getDate("pfecha_fin"),rs.getInt("ptipo"), rs.getString("pobservacion"), rs.getInt("pcodigo_sicoa"), rs.getInt("ptipo"));
                lst.add( periodo);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
 public static ArrayList<Periodo> ObtenerPeriodo() throws Exception {
        ArrayList<Periodo> lst = new ArrayList<Periodo>();
        try {
            String sql = "select * from actividades.fn_obtener_periodo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarPeriodo(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
 
 
  public static Periodo ObtenerPeriodoDadoCodigo(int codigo_p) throws Exception {
      Periodo lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_periodo_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_p));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new  Periodo();
            lst = llenarPeriodo(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
  public static boolean actualizar(Periodo periodo) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fnactualizar_periodo(?,?,?,?,?,?,?,?)";
             lstP.add(new Parametro(1, periodo .getCodigo_p()));
            lstP.add(new Parametro(2, periodo .getNombre()));
            lstP.add(new Parametro(3, periodo .getFecha_inicio()));
            lstP.add(new Parametro(4, periodo .getFecha_fin ()));
            lstP.add(new Parametro(5, periodo .getTipo ()));
            lstP.add(new Parametro(6, periodo .getObservaciones()));
            lstP.add(new Parametro(7,periodo.getCodigo_sicoa()));
            lstP.add(new Parametro(8,periodo.getEstado()));
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
  
   public static boolean eliminar(Periodo periodo) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_periodo(?)";
            lstP.add(new Parametro(1, periodo.getCodigo_p()));
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
