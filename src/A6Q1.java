
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author annt0773
 */
public class A6Q1 {
    //create a method and get the number
    public static double circleArea(double radius){
        //calculate the area of a circle
        double answer= 3.14* Math.pow(radius, 2);
        //return answer
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input=new Scanner(System.in);
        //ask for the radius
        System.out.println("Please enter a radius");
        //get the number of the radius
        double radius=input.nextDouble();
        //using the method to get the answer
        double area=circleArea(radius);
        //print out the answer
        System.out.println("The area of circle is "+ area);
        // TODO code application logic here
    }
}
