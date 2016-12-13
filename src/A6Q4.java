
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q4 {
    //create a method that will return a new balance of an account
    public static double compoundInterest(double iprincipal, double interestRate, double years) {
        //calculate the answer
        double answer = iprincipal * Math.pow(1 + interestRate, years);
        //return answer
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask the balance
        System.out.println("Please enter your current balance");
        //get the number
        double bal = input.nextDouble();
        //ask for the interest rate
        System.out.println("Please enter your interst rate");
        //get the number
        double rate = input.nextDouble();
        //ask for the years
        System.out.println("Please enter the number of years");
        //get the number
        double yrs = input.nextDouble();
        //using compoundInterest method to get the answer
        double balance = compoundInterest(bal, rate, yrs);
        //print out the answer
        System.out.println(balance);
        // TODO code application logic here
    }
}
