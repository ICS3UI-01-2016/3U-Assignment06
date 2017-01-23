
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
    public static void compoundInterest(int years, double I, int p){
        //BEDMAS
        double a = (I+1);
        double c = Math.pow(a,years);
        double interest = a * c;
        //total balance
        double balance = interest + p;
        //print total balance
        System.out.println("Your total balance is $" + balance);
        
       
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input
        Scanner input = new Scanner(System.in);
        //ask for initial balance
        System.out.println("Balance before interest:");
        int p = input.nextInt();
        
        //ask for interest rate
        System.out.println("Interest rate: ");
        double rate = input.nextDouble();
        
        //ask for years
        System.out.println("Years: ");
        int years = input.nextInt();
        
        //final balance
        compoundInterest(years,rate,p);
        
        
        
    }
}
