
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static double circleArea(double radius) {
        // square the entered radius 
        double sqaure = radius * radius;
        // multiply the squared radius by 3.14
        double answer = sqaure * 3.14;
        // reutern the final answer to the user is an output line
        return answer;
    }

    public static void main(String[] args) {
        // create a scanner    
        Scanner input = new Scanner(System.in);
        // ask user for radius of cirlce
        System.out.println("Please enter the radius of the circle");
        // create the radius variable
        double radius = input.nextDouble();
        double area = circleArea(radius);
        // show user the answer 
        System.out.println("The radius of the cirlce is " + area);

    }
}
