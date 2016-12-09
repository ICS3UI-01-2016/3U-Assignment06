
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A6Q4 {
// Get the user to input intial amount, intrest rate and number of years

    public static double compoundIntrest(double r, double P, int n) {
// The formula to return the new balance of an account after the compound interest is added
        double B = P * Math.pow(1 + r, n);
        return B;


    }

    /**
     * @param args the command line arguments
     */
    // Test method to make sure that it works
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask the users to input the intials amount. 
        System.out.println(" Please input the intial amount that is represented by the varaible P");
        double P = input.nextDouble();
        // Ask the users to input the intrest rate
        System.out.println(" Please input the intrest rate that is represented by the varaible r");
        double r = input.nextDouble();
        // Ask the users to input the number of years.
        System.out.println(" Please input the number of years that is represented by the varaible n");
        int n = input.nextInt();
        //Get the program to state the results
        // After applying the method print out the answer 
        System.out.println(compoundIntrest(r, P, n));


    }
}
