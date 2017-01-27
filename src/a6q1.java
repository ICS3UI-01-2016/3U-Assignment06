
import java.util.Scanner;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q1 {

    /**
     * @param args the command line arguments
     */
    //
   public static double circleArea(double radius){
    	//variable for pi
    	double pi = 22/7;
    	//circle area+return area
    	double answer = pi*Math.pow(radius,2);
    	return answer;
    	
	}
	
	public static void main(String[] args) {
    	//test code
    	//create input for the user
    	Scanner input = new Scanner(System.in);
    	//get user to input radius
    	double r = input.nextDouble();
    	double a = circleArea(r);
	//print area
    	
    	System.out.println(a);
	}
}

