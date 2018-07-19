/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;
import olap.entidades.Estudiante;
import java.util.List;
/**
 *
 * @author stian
 */
public interface IEstudiante {
    
    boolean insertar(Estudiante estudiante)throws Exception;
    boolean modificar(Estudiante estudiante)throws Exception;
    boolean eliminar(Estudiante estudiante)throws Exception;
    Estudiante obtener(int codigo_e)throws Exception;
    List<Estudiante> obtener()throws Exception; 
}
