/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Factory;

import Shape.Shape;
import Shape.Circle;
import Shape.Rectangle;
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
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetShape() {
        System.out.println("Test 1: getShape Circle");
        String shapeType = "CIRCLE";
        ShapeFactory instance = new ShapeFactory();
        Circle expResult = new Circle();
        Shape result = instance.getShape(shapeType);
        assertEquals(expResult.draw(), result.draw());
        
    }
    
    /**
     * Test of getShape method, of class ShapeFactory.
     */
    @Test
    public void testGetDifferentShape() {
        System.out.println("Test 2: getShape Circle and Rectangle");
        String shapeType = "CIRCLE";
        ShapeFactory instance = new ShapeFactory();
        Rectangle expResult = new Rectangle();
        Shape result = instance.getShape(shapeType);
        assertNotEquals(expResult.draw(), result.draw());
    }
    
    /**
     * Test of getShape method, of class ShapeFactory. Get non existing
     */
    @Test
    public void testNonExistShape() {
        System.out.println("Test 3: getShape of Non existing Shape and Rectangle");
        String shapeType = "Oval";
        ShapeFactory instance = new ShapeFactory();
        Rectangle expResult = new Rectangle();
        Shape result = instance.getShape(shapeType);
        System.out.println(result);
        assertNull(result);
        assertNotEquals(expResult, result);
    }
}
