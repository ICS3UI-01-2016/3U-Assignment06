
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class Question1 {
public static double circleArea(double radius){
    //create a method 
    double area = (radius * radius)* Math.PI;
    return area;
}
    public static void main(String[] args) {
        //input scanner
          Scanner input = new Scanner(System.in);
          //ask fir radius of the circle
          System.out.println("Please enter the radius of the circle");
          //save integer
          double radius = input.nextInt(); 
          //use method to preform action 
          double area= circleArea(radius); 
          //tell user the area of the circle
          System.out.println("The area of the circle is  "+ area);                          
    }
    
}
