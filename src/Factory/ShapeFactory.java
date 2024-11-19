/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Shape.Shape;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;
/**
 * ShapeFactory class that return specific type of each Shape based on the input
 * @author Duc Nguyen
 * @version 1.0.0
 */
public class ShapeFactory {
    /**
     * Default constructor of ShapeMaker that Initialize a new instance to each of the Shape class
     */
    public ShapeFactory() { 
    }
    
    /** 
     * Method returning each class Initialization of different shapeType, if not existing shape is inputted, return NULL
     * @param shapeType Input type of shaped that user wanted to get
     * @return Shape type or null
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) { 
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")) { 
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) { 
            return new Square();
        }
        return null;
    }
}
