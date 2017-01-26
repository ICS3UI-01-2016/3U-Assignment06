
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A6Q1 {
    
    public static double circleArea(double radius){
        double area = ((radius * radius) * 3.14); 
        return area; 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // get the radius of the circle from the user
        System.out.println("Please enter the radius.");
        double radius = input.nextDouble();
        
        // give user the area of the circle 
        double area = circleArea(radius);       
        System.out.println("The area of the circle is " + area);   
    } 
}
