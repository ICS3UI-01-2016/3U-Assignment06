
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class Q04 {

    //Create a method called compoundInterest to calculate the new balance of an account
    public static double compoundInterest(double P, double n, double r){
        //create equation to calculate new balance
        //convert r from percent to decimal
        r = r/100;
        //create a base for 1+r
        double base = 1 + r;
        //Power base by n
        double power =  Math.pow(base, n);
        //multiply P by power to get the balance
        double balance = P*power;
        //round the value to 2 decimal places
        balance = Math.round(balance*100)/100.0;
        //return the balance
        return balance;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Method
        //Create a scanner
        Scanner input = new Scanner (System.in);
        //ask user for initial principal
        System.out.println("Please Enter the Initial Principal");
        //store in variable
        double P = input.nextDouble();
        //ask user for interest rate
        System.out.println("Please Enter the Interest Rate");
        //store in variable
        double r = input.nextDouble();
        //ask user for number of years
        System.out.println("Please Enter the Number of Years");
        //store in variable
        double n = input.nextDouble();
        //run method
        double balance = compoundInterest (P, n, r);
        //print answer
        System.out.println("The Compund Interest is $" + balance);
    }
}
