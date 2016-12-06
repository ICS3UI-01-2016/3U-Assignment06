
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    // new method that calculates the intrest
    public static double compoundInterest(double principal, double rate, int years) {
        // The forumula
        rate= 1+rate;
        double interest =Math.pow(rate, years);
        double balance =principal*interest;        
     return balance;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
         System.out.println("Please enter the balance of the account");
        double principal = input.nextDouble();
        System.out.println("Please enter the intrest rate"); 
        double rate = input.nextDouble();
        System.out.println("Please enter the years of the account");
        int years = input.nextInt();
         double balance = compoundInterest(principal, rate ,years);
         System.out.println("Your balance after compound intrest " + balance);
    }
}
