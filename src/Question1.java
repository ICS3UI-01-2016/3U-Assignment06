
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    // created a methoded to find the area of any given circle
    // new method
    public static double 
            circleArea(double radius) {
        //squaring the radius
        double squared = radius *radius;
        // timesing the squared radius by PI
        double area = squared * 3.14;
        return area;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        // created a scanner 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius");
        double radius = input.nextDouble();
        double area = circleArea(radius);
        System.out.println("The circles area is " + area);
    }
}
