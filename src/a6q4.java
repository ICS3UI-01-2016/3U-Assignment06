
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q4 {

    /**
     * @param args the command line arguments
     */
    //create method & variables for interest rate(r), num years(n), & initial $(P)
    public static double compoundInterest(double r, int n, double P){
        //insert formula used to calculate compound interest B=P(1+r)^n 
        double B = P*Math.pow((1+r),n);
        //return the answer of the account balance once interest is added
        return B;
    }
        
    
    public static void main(String[] args) {
        //test code
        //create input for the user
    	Scanner input= new Scanner(System.in);
        //ask user to input interest rate 
        System.out.println("Please enter interest rate in percent");
        //let user answer
        double intr = input.nextDouble();
        //divide user's input of rate by 100
        intr = intr/100;
        //ask user to input number of years 
        System.out.println("Please enter number of years");
        //let user answer
        int numyrs = input.nextInt();
        //ask user to input initial balance
        System.out.println("Please enter initial balance");
        //let user answer
        double initial = input.nextDouble();
        //call method
        double newbalance = compoundInterest(intr,numyrs,initial);
        //print 
        System.out.println(newbalance);
        //test it
    }
}
