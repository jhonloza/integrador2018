/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import olap.dao.IAmbito;
import olap.entidades.Ambito;
import olap.impl.AmbitoImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stian
 */
public class AmbitoTest {
    
    public AmbitoTest() {
    }
 
    @Test
     public void TestGenetal() {
        IAmbito ambitoDao = new AmbitoImpl();

// TEST INSERTAR
        boolean filas = false;
        Ambito mat = new Ambito("materia 1","no",1);
        try {
            filas = ambitoDao.insertar(mat);
            System.out.println("Ingreso de " + filas + " Filas Correctas");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        assertTrue(filas != false);
//
//            //TEST OBTENER POR CODIGO
////        
   /*     Materia mater = new Materia();
        try {
            mater = materiaDao.obtener(5);
            System.out.println("            " + mater.getCodigo()+ "    " + mater.getNombre());
        } catch (Exception e) {
        }
        assertEquals(mater!=null, true);

//            //TEST LISTADO
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            materias = materiaDao.obtener();
            System.out.println("Codigo de Materia \t" + "Nombre \t" + " \t Descripcion\t");

            for (Materia cate : materias) {
                System.out.println(cate.getCodigo()+ "\t\t" + cate.getNombre() + "\t\t");
            }
        } catch (Exception e) {
        }
        assertTrue(materias.size()>0);
*/
    }

}
