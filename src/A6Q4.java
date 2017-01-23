
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q4 {
    public static void compoundInterest(int years, double R, int p){
        //brackets
        double a = (R+1);
        //exponents
        double c = Math.pow(a,years);
        //multiplication
        double interest = a * c;
        //total balance
        double balance = interest + p;
        //tell the user their total balance
        System.out.println("Your total balance is $" + balance);
        
       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for initial balance
        System.out.println("Balance prior to interest:");
        int p = input.nextInt();
        
        //ask user for interest rate
        System.out.println("Interest rate: ");
        double rate = input.nextDouble();
        
        //ask for years
        System.out.println("Years: ");
        int years = input.nextInt();
        
        //final balance
        compoundInterest(years,rate,p);
        
        
    }
}
