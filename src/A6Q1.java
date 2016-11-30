
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q1 {

    public static double circleArea(double radius){
        double answer = 3.14 * radius * 2;
        return answer;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input a radius");
        double radius = input.nextDouble();
        
        double area = circleArea(radius );
        System.out.println("Area is " + area);
    }
}
