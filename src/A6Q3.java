
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
public class A6Q3 {
    
    public static double factors(double integer){
        // make a loop
        for(int i = 1; i<integer; i=i+1){
            // store the remainder
            double remainder = integer % i; 
            // when it equals 0 print the statement 
            if(remainder == 0){
                System.out.println(i);
                
            }
        }
        // apply the entered integer in the numbers
        System.out.println(integer);
        return integer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // get the user to input input an integer 
        System.out.println("Please input an Integer:");
        double integer = input.nextDouble(); 
        
        // give user the factors of that integer 
        System.out.println("The numbers are: ");
        factors(integer); 
        
        
        
        
        
        
        
        
    }
}
