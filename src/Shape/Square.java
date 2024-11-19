/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 * This is the Square Shape class that implements the Shape Interface
 * @author danie
 * @version 1.0.0
 */
public class Square implements Shape{
    /**
     * Default constructor of Square Shape that Initialize a new instance of the Square class
     */
    public Square() { 
    }
    /**
     * This Method Draw the Square based on interface Shape
     * @return String value of the method draw() Square
     * @author Duc Nguyen
     * @version 1.0.0
     */
    @Override 
    public String draw() { 
        System.out.println("Square::draw()");
        return "Square::draw()";
    }
}
