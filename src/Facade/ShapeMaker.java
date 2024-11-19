/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Square;

/**
 * ShapeMaker class act as the Facade structure to create different Shape
 * @author Duc Nguyen
 * @version 1.0.0
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    /**
     * Default constructor of ShapeMaker that Initialize a new instance to each of the Shape class
     */
    public ShapeMaker() { 
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    /**
     * This method return the draw of Circle shape, which is initialized from Circle
     * @return String of Circle draw()
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public String drawCircle() { 
        circle.draw();
        return circle.draw();
    }
    
    /**
     * This method return the draw of Rectangle shape, which is initialized from Rectangle
     * @return String of Rectangle draw()
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public String drawRectangle() { 
        rectangle.draw();
        return rectangle.draw();
    }
    
    /**
     * This method return the draw of Square shape, which is initialized from Square
     * @return String of Square draw()
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public String drawSquare() { 
        square.draw();
        return square.draw();
    }
}
