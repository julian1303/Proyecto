/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trotadorafitnes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gis
 */
public class CalculoDeEstadisticasTest {
    
    public CalculoDeEstadisticasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalculoDeCalorias() {
        System.out.println("calculoDeCalorias");
        String sexo = "masculino";
        double peso = 75;
        int edad = 20;
        double v = 6.2;
        double I = 6;
        CalculoDeEstadisticas instance = new CalculoDeEstadisticas();
        double expResult = 49.005;
        double result = instance.calculoDeCalorias(sexo, peso, edad, v, I);
        assertEquals(expResult, result, 0.0);
       
    }

    @Test
    public void testCalcularDistacia() {
        System.out.println("calcularDistacia");
        double v = 10;
        CalculoDeEstadisticas instance = new CalculoDeEstadisticas();
        double expResult = 2.777;
        double result = instance.calcularDistacia(v);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
