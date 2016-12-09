
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A6Q9 {
// vreate a method 
    // the int number is where the user inserts the number
    public static boolean allDigitOdd(int number) {
       // As the number is more than o divide by 10; 
        while (number > 0) {      
            number = number / 10;
       // if the number is divide by 2 and has a remainder of 0 return false
            if (number % 2 == 0) {
                return false;
            }
        }
      // if the previous statement deos not work then default the answer the to true
        return true;
    }
    /**
     * @param args the command line arguments
     */
  // tests out the method and make sure that it works 
    public static void main(String[] args) {
  // Create a scanner  
        Scanner input = new Scanner(System.in);
  // Ask the user for the number   
        System.out.println("Please enter a number");
        int number = input.nextInt();
 // Apply the boolean and the method and print the asnwers out   
        boolean allDigitOdd = allDigitOdd(number);
        System.out.println(allDigitOdd);
        
    }
}
