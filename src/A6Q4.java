
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q4 {
    
    public static double compoundInterest (double rate , double principal, int years){
      // the  formula to find the the total compound interest
        // using the Math.pow to find toe the power of n^
     double amount = principal * Math.pow(1.0 + rate,years);
     return amount;
     }

    

    /**7
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // ask the user for the amount of the principal
        System.out.println("Enter the initial principal amout:");
        double principal = input.nextDouble ();
        
        // ask the user for for the intrest he / she gets 
        System.out.println("Enter the intrest rate:");
        double rate = input.nextDouble();
        
        // ask the user the number for the years
        System.out.println("Enter the number of years:");
        int years = input.nextInt();
        
       // print out the answer using the method you made above
        System.out.println(compoundInterest(rate, principal, years));
        
        
        
        
         
        
    }
}
