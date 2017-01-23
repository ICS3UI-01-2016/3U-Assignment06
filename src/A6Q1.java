
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q1 {
    //method for radius of circle 
    public static double calcCircleArea(double radius, double pi){
    double area = radius * radius * pi;
    return area;
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //pi
        double pi = 3.14;
        //ask user to input radius
        System.out.println("Enter radius of circle: ");
        Double radius = input.nextDouble();
        //calculate area
        double area = calcCircleArea(radius,pi);
        System.out.println("The area of the circle is " + area);
        
    }
}
