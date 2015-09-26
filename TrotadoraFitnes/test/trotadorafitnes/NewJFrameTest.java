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
public class NewJFrameTest {
    
    public NewJFrameTest() {
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
    /**
     * Test of aumentarVelocidad method, of class NewJFrame.
     */
    @Test
    public void testAumentarVelocidad() {
        System.out.println("aumentarVelocidad");
        NewJFrame instance = new NewJFrame();
        instance.aumentarVelocidad();
        
    }

    /**
     * Test of disminuirVelocidad method, of class NewJFrame.
     */
    @Test
    public void testDisminuirVelocidad() {
        System.out.println("disminuirVelocidad");
        NewJFrame instance = new NewJFrame();
        instance.disminuirVelocidad();
        
    }

    /**
     * Test of aumentarInclinacion method, of class NewJFrame.
     */
    @Test
    public void testAumentarInclinacion() {
        System.out.println("aumentarInclinacion");
        NewJFrame instance = new NewJFrame();
        instance.aumentarInclinacion();
        
    }

    /**
     * Test of disminuirInclinacion method, of class NewJFrame.
     */
    @Test
    public void testDisminuirInclinacion() {
        System.out.println("disminuirInclinacion");
        NewJFrame instance = new NewJFrame();
        instance.disminuirInclinacion();
        
    }

    /**
     * Test of setGr method, of class NewJFrame.
     */
    @Test
    public void testSetGr() {
        System.out.println("setGr");
        double gr = 0.0;
        NewJFrame instance = new NewJFrame();
        instance.setGr(gr);
        
        
    }

    /**
     * Test of setKm method, of class NewJFrame.
     */
    @Test
    public void testSetKm() {
        System.out.println("setKm");
        double km = 0.0;
        NewJFrame instance = new NewJFrame();
        instance.setKm(km);
        
    }
    
}
