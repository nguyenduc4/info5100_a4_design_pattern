/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_designpatterns;

import Facade.ShapeMaker;

/**
 * This Class run the demo of Facade Pattern, which is implemented through ShapeMaker
 * @author Duc Nguyen
 * @version 1.0.0
 */
public class FacadePatternDemo {
    /**
     * Main method demonstrating how Facade pattern work, shapeMaker class is created and draw method initiated
     * @param args List of execution commands
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public static void main(String[] args) { 
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
