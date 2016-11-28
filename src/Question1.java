
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Slatz8075
 */
public class Question1 {

    public static double circleArea(double radius) {
        //square the radius and multiply by PI
        double answer = (Math.pow(radius, 2)) * Math.PI;
        //return answer
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask them to input the radius of their circle
        System.out.println("Please enter the radius of the circle");
        //store radius
        double radius = input.nextDouble();                
        //use method
        double area = circleArea(radius);
        //tell the user the final answer
        System.out.println("The area of the circle is " + area);

    }
}
