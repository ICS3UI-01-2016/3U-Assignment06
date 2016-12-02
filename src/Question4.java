
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class Question4 {

    public static double compoundInterest(double r, double P, double n) {
        double R = r + 1;
        double B = P * Math.pow(R, n);
        return B;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current balance of the account");
        double P = input.nextDouble();
        System.out.println("How many years was the money interested");
        double n = input.nextDouble();
        System.out.println("What is the interest rate");
        double r = input.nextDouble();
        double B = compoundInterest(r, P, n);
        System.out.println("The balance at the end is " + B);

    }

}
