
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q1 {

    // create a method to find the area of a circle
    public static double circleArea(double radius) {
        // create a variable for the answer and define it as equal to the radius squared multiplied by pi
        double answer = (radius * radius) * Math.PI;
        // return the answer to the user
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask the user for the radius of the circle
        Scanner input = new Scanner(System.in);
        // ask the user for the radius
        System.out.println("Please enter the radius");
        // store the radius the user gave
        double radius = input.nextDouble();
        // calculate the answer using the method circleArea
        double answer = circleArea(radius);

        // output the answer 
        System.out.println("The area of the circle is " + answer);
    }
}
