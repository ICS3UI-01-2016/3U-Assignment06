
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A6Q1 {

    // create a method for the area of the circle
    public static double circleArea(double radius) {
        // calculations to solve the area of the circle
        double answer = 3.14 * Math.pow(radius, 2);
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create system input
        Scanner input = new Scanner(System.in);

        // ask for radius of circle
        System.out.println("What is the radius of the circle");
        double radius = input.nextDouble();

        // set the pie value
        double pie = 3.14;

        // get the answer 
        double answer = circleArea(radius);

        // output the answer 
        System.out.println("The area of the circle is " + answer);

    }
}
