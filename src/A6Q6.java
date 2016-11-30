
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q6 {
    
    public static void lastDigit (int number){
        // make a variable to store in the result
        // use the % sign to find the remainder of the number when you divide it by 10
       int result = number % 10;
       // if the number is greater than 0
       if (number < 0){
           // multiply the result by -1 to change it to positive
           result = result * -1;
           // the computer will print out the result
           System.out.println(result);
       } else {
           // else if the number is less than 0 or negative
           if (number > 0){
               // the computer will print out the result
               System.out.println(result);
           }
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  create a Scanner for the input
        Scanner input = new Scanner (System.in);
        // ask the user to enter the number they want
        System.out.println("Please enter the number:");
        int number = input.nextInt();
        // checking if the method above is being appplied properly
        lastDigit (number);
        
        
        
    }
}
