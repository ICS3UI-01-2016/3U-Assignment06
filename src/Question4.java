
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question4 {
    
    public static double compoundIntrest(double amount, double rate, int years){
        //do the calculation
        double balance = amount*(Math.pow((1 + rate), years));
        //return the answer 
        return balance;  
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask them to input amount in their bank account
        System.out.println("What is the initial amount you have in your bank account");
        //store amount
        double amount = input.nextDouble();
        
        //ask them to input the intrest rate
        System.out.println("What is the intrest rate in this bank account");
        //store rate
        double rate = input.nextDouble();
        
        //ask them to input the number of years it has been in there
        System.out.println("How many years has it been in the account");
        //store years
        int years = input.nextInt();
        //use method
        Double finalAmount =compoundIntrest(amount, rate, years);
        //tell the user
        System.out.println("The final balance in the acount is " + finalAmount);
        
    }
}
