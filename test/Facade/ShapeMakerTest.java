/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Facade;

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
public class ShapeMakerTest {
    
    public ShapeMakerTest() {
    }
    

    /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("Test 1: drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();
        assertEquals(expResult, result);
        assertNotEquals("Rectangle::draw()", instance.drawCircle());
        assertNotEquals("Square::draw()", instance.drawCircle());
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("Test 2: drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Rectangle::draw()";
        String result = instance.drawRectangle();
        assertEquals(expResult, result);
        assertNotEquals("Circle::draw()", instance.drawRectangle());
        assertNotEquals("Square::draw()", instance.drawRectangle());
    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("Test 3: drawSquare");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Square::draw()";
        String result = instance.drawSquare();
        assertEquals(expResult, result);
        assertNotEquals("Circle::draw()", instance.drawSquare());
        assertNotEquals("Rectangle::draw()", instance.drawSquare());
    }
    
}
