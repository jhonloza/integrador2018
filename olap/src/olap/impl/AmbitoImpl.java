
package olap.impl;


import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import olap.dao.IAmbito;
import olap.entidades.*;
import olap.entidades.Ambito;


public  class AmbitoImpl implements IAmbito{
    
  @Override
    public boolean insertar(Ambito ambito) throws Exception {
            boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fninsertar_ambito(?,?,?)";
////            lstP.add(new Parametro(1, ambito.getCodigo_ambito()));
            lstP.add(new Parametro(1, ambito.getNombre()));
            lstP.add(new Parametro(2, ambito.getObservacion()));
            lstP.add(new Parametro(3, ambito.getEstado()));
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
   public static ArrayList<Ambito> llenarAmbitos(ConjuntoResultado rs) throws Exception {
        ArrayList<Ambito> lst = new ArrayList<Ambito>();
        Ambito ambito = null;
        try {
            while (rs.next()) {
                ambito = new Ambito(rs.getString("pnombre"), rs.getString("pobservacion"), rs.getInt("pestado"));
                lst.add(ambito);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
   
    @Override
    public boolean modificar(Ambito ambito) throws Exception {
    boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, ambito.getNombre()));
            lstP.add(new Parametro(2, ambito.getObservacion()));
            lstP.add(new Parametro(3, ambito.getEstado()));
           // lstP.add(new Parametro(4, ambito.getCodigo_ambito()));
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

    @Override
    public boolean eliminar(Ambito ambito) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            //lstP.add(new Parametro(1, ambito.getCodigo_ambito()));
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

    @Override
    public Ambito obtener(int codigo_ambito) throws Exception {
         Ambito lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_ambito));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Ambito();
            lst = llenarAmbitos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Ambito> obtener() throws Exception {
           ArrayList<Ambito> lst = new ArrayList<Ambito>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarAmbitos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}