/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call method
        compoundInterest(1000,.35,10);
    }
    public static void compoundInterest(double principle, double rate, int years) {
        //calculate the interest rate
        double balance = 1+rate;
        //calculate the overall increase due to interest rate
        balance = Math.pow(balance, years);
        //apply the increase to the initial principle
        balance = principle * balance;
        //show the final balance
        System.out.println(balance);
    }
}
