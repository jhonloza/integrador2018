/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;

import olap.entidades.*;
import java.util.List;

/**
 *
 * @author stian
 */
public interface IPeriodo {
     boolean insertar(Periodo periodo)throws Exception;
    boolean modificar(Periodo periodo)throws Exception;
    boolean eliminar(Periodo periodo)throws Exception;
    Periodo obtener(int codigo_periodo)throws Exception;
    List<Periodo> obtener()throws Exception;
}
