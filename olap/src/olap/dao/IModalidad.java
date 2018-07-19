/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;

import olap.entidades.Modalidad;
import java.util.List;

/**
 *
 * @author stian
 */
public interface IModalidad {
     boolean insertar(Modalidad modalidad)throws Exception;
    boolean modificar(Modalidad modalidad)throws Exception;
    boolean eliminar(Modalidad modalidad)throws Exception;
    Modalidad obtener(int codigo_mod)throws Exception;
    List<Modalidad> obtener()throws Exception;
}
