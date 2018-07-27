
package aplicacion_tutorias.impl;
import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import aplicacion_tutorias.entidades.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
public class EscuelaImpl implements Serializable{
        public static boolean Insertar( Escuela escuela ) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * From  actividades.fninsertar_escuela(?,?,?,?,?)";
            lstP.add(new Parametro(1, escuela.getCodigo_e()));
            lstP.add(new Parametro(2, escuela.getCodigo_facultad()));
            lstP.add(new Parametro(3, escuela.getNombre()));
            lstP.add(new Parametro(4, escuela.getDescripcion()));
            lstP.add(new Parametro(5, escuela.getCodigo_sicoa()));
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
    
    
    public static ArrayList< Escuela> llenarEscuela(ConjuntoResultado rs) throws Exception {
        ArrayList<Escuela> lst = new ArrayList<Escuela>();
        Escuela escuela = null;
        try {
            while (rs.next()) {
                escuela = new  Escuela (rs.getInt("pcodigo"),rs.getInt("pcodigo_facultad"),rs.getString("pnombre"), rs.getString(" pdescripcion"), rs.getInt(" pcodigo_sicoa"));
                lst.add(escuela);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
     public static ArrayList<Escuela> ObtenerEscuela() throws Exception {
        ArrayList<Escuela> lst = new ArrayList<Escuela>();
        try {
            String sql = "SELECT  * from actividades.fn_obtener_datos_escuela()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarEscuela(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    public static Escuela ObtenerEscuelaDadoCodigo(int codigo_e) throws Exception {
        Escuela lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * from actividades.fn_obtener_tipo_escuela_dado_codigo(?); ";
            lstP.add(new Parametro(1, codigo_e));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Escuela();
            lst = llenarEscuela(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
public static boolean actualizar(Escuela escuela) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT  * from actividades.fnactualizar_escuela(?,?,?,?,?)";
            lstP.add(new Parametro(1, escuela.getCodigo_e()));
            lstP.add(new Parametro(2, escuela.getCodigo_facultad()));
            lstP.add(new Parametro(3, escuela.getNombre()));
            lstP.add(new Parametro(4, escuela.getDescripcion()));
            lstP.add(new Parametro(5, escuela.getCodigo_sicoa()));
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
 public static boolean eliminar(Escuela escuela) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "SELECT * from actividades.fneliminar_escuela(?)";
            lstP.add(new Parametro(1, escuela.getCodigo_e()));
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
