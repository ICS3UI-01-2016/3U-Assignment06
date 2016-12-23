
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q1 {
    // make a variable called radius for user to input

    public static double calCircleArea(double radius) {
        // get the area of the circle by multiplying the radius by its self and then by the math symbol pie
        double answer = ((radius * radius) * Math.PI);
        // return the answer to the user
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the radius of the circle
        System.out.println("Please enter the radius ");
        // create a double to store the radius
        double radius = input.nextDouble();
        // get the area of the circle by multiplying the radius by its self and then by the math symbol pie
        double area = calCircleArea(radius);
        // tell the user what the area of the circle is
        System.out.println("Your answer is " + area);
    }
}
