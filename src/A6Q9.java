
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q9 {
     
    public static boolean allDigitsOdd (int number){
        // if the number is less than 0
        while (number > 0){
            // divide the number by 10 to find the remainder
            number = number % 10;
        }
        // if the number is even number
        if (number %2 ==0){
            // if it is not an odd number return false
            return false;     
        } 
        // if the number is an odd number
        return true;
    }


        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create an input for the user
        Scanner input = new Scanner (System.in);
        
        // ask the user ti enter the number they want
        System.out.println("Please enter your number:");
        int number = input.nextInt();
        boolean allDigitsOdd = allDigitsOdd(number);
        
        // try to check the method above is working using boolean allDigitsOdd
        System.out.println(allDigitsOdd);
        
        
        
        
    }
}
