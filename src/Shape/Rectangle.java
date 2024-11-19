/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 * This is the Rectangle Shape class that implements the Shape Interface
 * @author danie
 * @version 1.0.0
 */
public class Rectangle implements Shape{
    /**
     * Default constructor of Rectangle Shape that Initialize a new instance of the Rectangle class
     */
    public Rectangle() { 
    }
    /**
     * This Method Draw the Rectangle based on interface Shape
     * @return String value of the method draw() Rectangle
     * @author Duc Nguyen
     * @version 1.0.0
     */
    @Override 
    public String draw() { 
        System.out.println("Rectangle::draw()");
        return "Rectangle::draw()";
    }
}
