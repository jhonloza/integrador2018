/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;

import olap.entidades.Nivel;
import java.util.List;

/**
 *
 * @author stian
 */
public interface INivel {
    boolean insertar(Nivel nivel)throws Exception;
    boolean modificar(Nivel nivel)throws Exception;
    boolean eliminar(Nivel nivel)throws Exception;
    Nivel obtener(int codigo)throws Exception;
    List<Nivel> obtener()throws Exception;
    
}
