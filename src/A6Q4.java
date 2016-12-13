
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    //setrting parameters
    public static double compoundInterest(double r, double p, int n) {
        //number enetered to the power
        double amount = p * Math.pow((1 + r), n);
        return amount;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //get principal amount (p)
        System.out.println("Enter principal amount; ");
        double p = input.nextDouble();
        //get interest rate (r)
        System.out.println("Enter the interest rate; ");
        double r = input.nextDouble();
        //get number of years (n)
        System.out.println("Enter number of years; ");
        int n = input.nextInt();
        //add all together to find final amount
        System.out.println("The compound interest for your balance is $" + compoundInterest(r, p, n));



    }
}
