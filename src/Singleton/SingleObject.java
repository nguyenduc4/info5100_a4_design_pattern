/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 * SingleObject class act as the Singleton pattern, it can only be created once 
 * @author Duc Nguyen
 * @version 1.0.0
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
    /**
     * This private constructor means that this class cannot be instantiated
    */
    private SingleObject(){}
    
    /**
     * This method allow user to get the single instance of this single object class
     * @return SingleObject the only object that is created 
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public static SingleObject getInstance() { 
        return instance;
    }
    
    /**
     * This method return string of the message shown by single object
     * @return String of message from single object
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public String showMessage() { 
        System.out.println("Hello World from SingleObject");
        return "SingleObject::showMessage()";
    }
}
