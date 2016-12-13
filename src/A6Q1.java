
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A6Q1 {

    public static double circleArea(double radius) {

        double area = radius * radius * 3.14;
        return area;
    }

    public static void enterRadius() {
        System.out.println("Please enter a radius");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //get radius from user
        Scanner input = new Scanner(System.in);
        System.out.println("Please the radius of the circle");
        double radius = input.nextDouble();

        double area = circleArea(radius);
        System.out.println("Area of the circle is " + area);


    }
}
