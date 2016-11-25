
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl
 */
public class A6Q4 {
    // make a function

    public static void compoundInterest(double initial, double interest, int years) {
        // create integer for total balance and insert into the equation
        double rate = interest + 1;
        double balance = ((initial) * (Math.pow(rate, years)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner in = new Scanner(System.in);

        // ask for initial principle being added
        System.out.println("What is the initial principle being added into the account?");
        double initial = in.nextDouble();

        // ask for the interest rate
        System.out.println("What is the interest rate of the account?");
        double interest = in.nextDouble();

        // ask for the number of years you are investing for
        System.out.println("How many years are you investing for?");
        int years = in.nextInt();

        // run the function/method
        compoundInterest(initial, interest, years);
    }
}
