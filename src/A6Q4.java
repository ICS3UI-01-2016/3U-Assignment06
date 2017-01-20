
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A6Q4 {

    public static double compoundInterest(double principal, double interestRate, int numberOfYears) {

        // balence is equal to the principal amount multiplied by the interest rate plus 1 to the exponent of the number of years it is being applied
        double balence = principal * Math.pow((1 + interestRate), numberOfYears);
        // return the balence
        return balence;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // amount set for principal
        double principal = 1000;
        // amount set for interest rate
        double interestRate = .05;
        // amount set for number of years
        int numberOfYears = 20;
        // final balence 
        double balence = compoundInterest(principal, interestRate, numberOfYears);
        // round the balence to 2 decimal places
        balence = Math.round(balence * 100 / 100.0);
        // output the balence
        System.out.println(balence);

    }
}
