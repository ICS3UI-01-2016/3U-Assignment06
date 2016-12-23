
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q4 {

    public static double compoundIntrest(double principal, double rate, double years) {
        // create the equation so that the program can calculate the new balance
        double balance = (principal * (Math.pow((1 + rate), years)));
        // return the balance to the user
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the variables to calculate the new balance
        System.out.println("Please enter the intrest ");
        // input the principal
        double principal = input.nextDouble();
        // input the rate
        double rate = input.nextDouble();
        // input the years
        double years = input.nextDouble();
        // get the user to input the number they want to calculate in the brackets below
        double balance = compoundIntrest(990, 0.35, 5.0);
        // tel the user the new balance
        System.out.println("The new balance is " + balance);
    }
}
