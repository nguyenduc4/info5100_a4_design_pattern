/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4_designpatterns;
import Singleton.SingleObject;
/**
 * This Class run the demo of SingletonPattern Demo
 * @author Duc Nguyen
 * @version 1.0.0
 */
public class SingletonPatternDemo {
    /**
     * Main method demonstrating how Singleton pattern work
     * @param args List of execution commands
     * @author Duc Nguyen
     * @version 1.0.0
     */
    public static void main(String[] args) { 
        SingleObject object = SingleObject.getInstance();
        
        object.showMessage();
    }
}
