
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundInterest(double principal, double growth, int years) {
        // initiate the loop
        growth = growth + 1;
        // multiply the interest rate by the number of years to get the interest
        double interest = Math.pow(growth, years);
        // multiply the intial amount by the interest
        double account = principal * interest;
        // reutrn the answer to the user
        return account;

    }

    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for their account balance
        System.out.println("How much money is in your account?");
        // store user data with "principal" variable
        double principal = input.nextDouble();
        // ask user for their interest rate
        System.out.println("What is the interest rate of the account?");
        // store user data with "irate" variable
        double irate = input.nextDouble();
        // ask user for how long the money will be in there account.
        System.out.println("How long is your money going to be in the account?");
        // store user data with "years" variable
        int years = input.nextInt();
        // link both variable
        double account = compoundInterest(principal, irate, years);
        // return the balance of the accoun to the user
        System.out.println("Your account balance will be $ " + account);


    }
}
