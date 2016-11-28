/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q1 {
    
    public static double circleArea (double radius){
        double answer = 3.14 * radius * radius ;
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //to run the program properly and to know is the method above is being applied properly
        
        double area = circleArea (2.5);
        System.out.println("The area is " + area + " m^2.");
    }
}
