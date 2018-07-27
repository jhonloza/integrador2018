
package aplicacion_tutorias.impl;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.*;
import static aplicacion_tutorias.impl.EstudianteImpl.llenarEstudiantes;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
public class FacultadImpl implements Serializable{
    public static boolean Insertar( Facultad facultad ) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * from actividades.fninsertar_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, facultad .getCodigo_f()));
            lstP.add(new Parametro(2, facultad .getNombre()));
            lstP.add(new Parametro(3, facultad .getDescripcion()));
            lstP.add(new Parametro(4, facultad .getCodigo_sicoa()));
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
     
public static ArrayList<Facultad> llenarFacultad(ConjuntoResultado rs) throws Exception {
        ArrayList<Facultad> lst = new ArrayList<Facultad>();
        Facultad facultad = null;
        try {
            while (rs.next()) {
                 facultad = new Facultad (rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pdescripcion"), rs.getInt("pcodigo_sicoa"));
                lst.add( facultad);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
 public static ArrayList<Facultad> ObtenerFacultad() throws Exception {
        ArrayList<Facultad> lst = new ArrayList<Facultad>();
        try {
            String sql = "select * from actividades.fn_obtener_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarFacultad(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
 
 
  public static Facultad ObtenerFacultadDadoCodigo(int codigo_f) throws Exception {
      Facultad lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_f));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new  Facultad();
            lst = llenarFacultad(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
  
  public static boolean actualizar(Facultad facultad) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fnactualizar_facultad(?,?,?,?)";
               lstP.add(new Parametro(1, facultad .getCodigo_f()));
            lstP.add(new Parametro(2, facultad .getNombre()));
            lstP.add(new Parametro(3, facultad .getDescripcion()));
            lstP.add(new Parametro(4, facultad .getCodigo_sicoa()));
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
  
   public static boolean eliminar(Facultad facultad) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_facultad(?)";
            lstP.add(new Parametro(1, facultad.getCodigo_f()));
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
