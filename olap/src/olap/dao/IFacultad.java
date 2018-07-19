/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;

import olap.entidades.Facultad;
import java.util.List;

/**
 *
 * @author stian
 */
public interface IFacultad {
      boolean insertar(Facultad facultad)throws Exception;
    boolean modificar(Facultad facultad)throws Exception;
    boolean eliminar(Facultad facultad)throws Exception;
    Facultad obtener(boolean codigo_facultad)throws Exception;
    List<Facultad> obtener()throws Exception;
}
