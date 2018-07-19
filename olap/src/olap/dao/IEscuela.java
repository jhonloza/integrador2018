/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;
import olap.entidades.Escuela;
import java.util.List;
/**
 *
 * @author stian
 */
public interface IEscuela {
     boolean insertar(Escuela escuela)throws Exception;
    boolean modificar(Escuela escuela)throws Exception;
    boolean eliminar(Escuela escuela)throws Exception;
    Escuela obtener(boolean codigo_escuela)throws Exception;
    List<Escuela> obtener()throws Exception;
    
}
