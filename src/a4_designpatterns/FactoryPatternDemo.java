/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_designpatterns;

import Factory.ShapeFactory;
import Shape.Shape;
/**
 * This Class run the demo of Factory Pattern Pattern, which get shaped from getShape() method
 * @author Duc Nguyen
 * @version 1.0.0
 */
public class FactoryPatternDemo {
    /**
     * Main method demonstrating how Factory pattern work, ShapeFactory class is created and return different Shape Class for its purpose
     * @param args List of execution commands
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public static void main(String[] args) { 
        ShapeFactory shapeFactory = new ShapeFactory();
        
        // get object of Circle and call it draw circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        // get object of Rectangle and call it draw circle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        
        // get object of Square and call it draw circle
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
