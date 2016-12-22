
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q01 {

    //Create a method to calculate the area of a circle
    public static double circleArea(double radius) {
        //create a variable called answer and square the radius then multiply by Pi
        double answer = (radius * radius) * 3.14;
        //return answer in order to be able to be fetched
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test method
        while (true) {
            //Create a scanner
            Scanner input = new Scanner(System.in);
            //Ask for a radius
            System.out.println("Please enter the radius value");
            //Put in variable
            double radius = input.nextDouble();
            //calculate area
            double answer = circleArea(radius);
            //System outprint answer to user
            System.out.println("The area of the circle is " + answer + " m^2.");
        }
    }
}