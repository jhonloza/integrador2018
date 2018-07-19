/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import olap.dao.*;
import olap.entidades.*;
import olap.impl.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Salgado
 */
public class EscuelaTest {
    
    public EscuelaTest() {
    }
     @Test
     public void TestGenetal() {
        IEscuela escuelaDao = new EscuelaImpl();

// TEST INSERTAR
        boolean filas = false;
        Escuela esc = new Escuela(2,"ING MECANICA","EEEEEE",1);
        try {
            filas = escuelaDao.insertar(esc);
            System.out.println("Ingreso de " + filas + " Filas Correctas");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        assertTrue(filas != false);
}
}
