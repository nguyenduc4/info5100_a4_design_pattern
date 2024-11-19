/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Singleton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
    
    /**
     * Test of getInstance method, of class SingleObject.
     */
    @Test
    public void testGetInstance() {
        System.out.println("Initialize 1: different object, to see if they are the same");
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        System.out.println(expResult);
        System.out.println(expResult);
        assertEquals(expResult, result);
    }

    /**
     * Test of showMessage method, of class SingleObject.
     */
    @Test
    public void testShowMessage() {
        System.out.println("Initialize 2:  different object, to see if they print the same content");
        SingleObject expResult = SingleObject.getInstance();
        SingleObject result = SingleObject.getInstance();
        
        String object1 = expResult.showMessage();
        String object2 = result.showMessage();
        assertEquals(object1, object2);
    }
    
}
