/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap.dao;


import java.util.List;
import olap.entidades.Ambito;

/**
 *
 * @author stian
 */
public interface IAmbito {
    
 boolean insertar(Ambito ambito)throws Exception;
    boolean modificar(Ambito ambito)throws Exception;
    boolean eliminar(Ambito ambito)throws Exception;
    Ambito obtener(int codigo_ambito)throws Exception;
    List<Ambito> obtener()throws Exception; 
}