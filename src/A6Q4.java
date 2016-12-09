
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q4 {

    public static double compundInterest(double p, double r, double n) {

        // calculate the balance of the account after adding the rate in decimal form by 1, then putting this value to the power of the amount oy years, multiplied by the principal
        double balance = (Math.pow(1 + r, n) * p);
        // return the new balance
        return balance;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for the user
        Scanner input = new Scanner(System.in);
        // ask the user for the principle and store it
        System.out.println("What was the principle amount invested?");
        double p = input.nextDouble();
        // ask the user for the principle rate and store it
        System.out.println("What was the rate of intrest in decimal form?");
        double r = input.nextDouble();
        // ask the user for the number of years the principle was invested
        System.out.println("How many years was the principle invested?");
        double n = input.nextDouble();

        double amount = compundInterest(p, r, n);
        System.out.println("The new balance of your account will be " + amount);
    }
}
