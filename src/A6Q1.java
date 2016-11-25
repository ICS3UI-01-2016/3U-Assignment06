
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl
 */
public class A6Q1 {
    // create method

    public static double areaCircle(double r) {
        // calculate area
        double area = Math.PI * r * r;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        // ask user for radius
        System.out.println("Please enter the radius of a circle");

        // store the radius
        double radius = input.nextDouble();

        // store the area 
        double answer = areaCircle(radius);

        // output the answer
        System.out.println("The area of the circle is " + answer);
    }
}
