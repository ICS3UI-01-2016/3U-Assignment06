
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question4 {
    //
    public static double compoundInterest(int r, double n, double P) {
        //impliment the formula so that java can understand it 
        double B = P * Math.pow((1 + r), n);
        //return the method 
        return B;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner 
        Scanner input = new Scanner(System.in);
        //ask user to input the initial amount to perform the method in which the variable P is used 
        System.out.println("What was the initial amount?");
        //save the variable
        double P = input.nextDouble();
        //ask user to input the initial amount to perform the method in which the variable n is used 
        System.out.println("What is the interest rate? ");
        //save the variable
        double n = input.nextDouble();
        //ask user to input the initial amount to perform the method in which the variable r is used 
        System.out.println("How many years?");
        //save the variable       
        int r = input.nextInt();
        //apply the method 
        double B = compoundInterest(r, n, P);
        //tell the user the balance 
        System.out.println("Your balance is " + B);


    }
}
