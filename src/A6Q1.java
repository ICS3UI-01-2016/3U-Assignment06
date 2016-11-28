
import java.util.Scanner;

/**A6Q1
 *
 * @author micla1676
 */
public class A6Q1 {

    //create method to calculate area of circle
    public static double circleArea(double radius){
        //calculate pi * r^2
        double answer = Math.PI * Math.pow(radius, 2);
        //return answer
        return answer;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner (System.in);
        
        //ask user for radius
        System.out.println("Please enter the radius in meteres:");
        
        //store user input
        double radius = input.nextDouble();
        
        //calculate area of circle
        double area = circleArea(radius);
        
        //output to screen
        System.out.println("The area of your circle is " + area + "m^2" );
    }
}
