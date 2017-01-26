
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A6Q4 {
    
    public static double compoundinterest (double principal, double interestRate, double year){
        double balance = principal * (Math.pow(1 + interestRate, year)); 
        return balance;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in); 
        
        // get the initial principal from the user
        System.out.println("Please input your initial principal.");
        double principal = input.nextDouble(); 

        // get the interest rate from the user
        System.out.println("Pleae input your interest rate.");
        double interestRate = input.nextDouble(); 
        
        // get the number of years from the user 
        System.out.println("Please input the number of years.");
        double year = input.nextDouble(); 
        
        // give user the total balance
        double balance = compoundinterest(principal, interestRate, year); 
        System.out.println("Your total balance is " + balance);   
    }
}
