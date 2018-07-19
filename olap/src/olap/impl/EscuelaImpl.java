package olap.impl;


import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import olap.dao.*;
import olap.entidades.*;


public  class EscuelaImpl implements IEscuela{
    
    @Override
    public boolean insertar(Escuela escuela) throws Exception {
            boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fninsertar_escuela(?,?,?,?)";
           // lstP.add(new Parametro(1, escuela.getCodigo_escuela()));
            lstP.add(new Parametro(1, escuela.getCodigo_facultad()));
            lstP.add(new Parametro(2, escuela.getNombre()));
            lstP.add(new Parametro(3, escuela.getDescripcion()));
            lstP.add(new Parametro(4, escuela.getCodigo_sicoa()));
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
    public static ArrayList<Escuela> llenarEscuela(ConjuntoResultado rs) throws Exception {
        ArrayList<Escuela> lst = new ArrayList<Escuela>();
        Escuela escuela = null;
        try {
            while (rs.next()) {
                escuela = new Escuela(/*rs.getInt("pcodigo_escuela"),*/ rs.getInt("pcodigo_facultad"), rs.getString("pnombre"), rs.getString("pdescripcion"),rs.getInt("pcodigo_sicoa"));
                lst.add(escuela);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
  
     @Override
    public boolean modificar(Escuela escuela) throws Exception {
boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?,?)";
            
            lstP.add(new Parametro(1, escuela.getCodigo_facultad()));
            lstP.add(new Parametro(2, escuela.getNombre()));
            lstP.add(new Parametro(3, escuela.getDescripcion()));
            lstP.add(new Parametro(4, escuela.getCodigo_sicoa()));
            //lstP.add(new Parametro(5, escuela.getCodigo_escuela()));
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
    public Escuela obtener(boolean codigo_esc) throws Exception {
        Escuela lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_esc));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Escuela();
            lst = llenarEscuela(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    @Override
    public boolean eliminar(Escuela escuela) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            //lstP.add(new Parametro(1, escuela.getCodigo_escuela()));
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
    public List<Escuela> obtener() throws Exception {
           ArrayList<Escuela> lst = new ArrayList<Escuela>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarEscuela(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    } 
    
}

   
    

    
