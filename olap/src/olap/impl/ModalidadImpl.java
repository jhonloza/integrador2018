
package olap.impl;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import olap.dao.*;
import olap.entidades.*;

public class ModalidadImpl implements IModalidad{
    @Override
    public boolean insertar(Modalidad modalidad) throws Exception {
         boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, modalidad.getCodigo_modalidad()));
            lstP.add(new Parametro(2, modalidad.getNombre()));
            lstP.add(new Parametro(3, modalidad.getDescripcion()));
            lstP.add(new Parametro(4, modalidad.getEstado()));
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

    public static ArrayList<Modalidad> llenarModalidad(ConjuntoResultado rs) throws Exception {
        ArrayList<Modalidad> lst = new ArrayList<Modalidad>();
        Modalidad modalidad = null;
        try {
            while (rs.next()) {
                modalidad = new Modalidad(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pdescripcion"), rs.getInt("pestado"));
                lst.add(modalidad);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    @Override
    public boolean modificar(Modalidad modalidad) throws Exception {
boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, modalidad.getNombre()));
            lstP.add(new Parametro(2, modalidad.getDescripcion()));
            lstP.add(new Parametro(3, modalidad.getEstado()));
            lstP.add(new Parametro(4, modalidad.getCodigo_modalidad()));
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
    public boolean eliminar(Modalidad modalidad_tutoria) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            lstP.add(new Parametro(1, modalidad_tutoria.getCodigo_modalidad()));
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
    public Modalidad obtener(int codigo_mod) throws Exception {
         Modalidad lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_mod));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Modalidad();
            lst = llenarModalidad(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Modalidad> obtener() throws Exception {
            ArrayList<Modalidad> lst = new ArrayList<Modalidad>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarModalidad(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }   
}