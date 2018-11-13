/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Dallas
 */
public class ComputeArea {
    public static void main(String[] args) {
        // Declare Variables
        double radius;
        double area;
        
        // Assign Variables;
        radius = 20;
        
        // Compute area
        
        area = radius * radius * Math.PI;
        
        // Display Results
        
        System.out.println("The area for the circle of radius " + radius + " is "
        + area);
    }
    
}
