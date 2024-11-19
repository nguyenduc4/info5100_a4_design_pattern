/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 * This is the Circle Shape class that implements the Shape Interface
 * @author danie
 * @version 1.0.0
 */
public class Circle implements Shape{
    /**
     * Default constructor of Circle Shape that Initialize a new instance of the Circle class
     */
    public Circle() { 
    }
    /**
     * This Method Draw the circle based on interface Shape
     * @return String value of the method draw() Circle
     * @author Duc Nguyen
     * @version 1.0.0
     */
    @Override 
    public String draw() { 
        System.out.println("Circle::draw()");
        return "Circle::draw()";
    }
}
