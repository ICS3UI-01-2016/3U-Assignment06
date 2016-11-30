
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messr2578
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    // calculate the area of a circle
    public static double circleArea(double radius) {
        double area = (3.14) * (radius * radius);
         return area;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the radius");
        double r = input.nextDouble();
        double area = circleArea(r);
        System.out.println("the area is "+ area);
    }

}
