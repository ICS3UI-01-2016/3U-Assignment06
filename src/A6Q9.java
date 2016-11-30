
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q9 {

    public static boolean allDigitsOdd(double numEntered) {
        // only do this loop while the number entered is greater than or equal to ten   
        while (numEntered >= 10) {
            // if the number entered divided by 2 has a remainder of zero, it is a even integer 
            if (((numEntered) % 2 == 0)) {
                // return false meaning that the integer is even
                return false;
            } // if the last digit is odd
            else {
                // continuously chop off the last digit and keep divifding the number by ten to check if each digit is odd
                numEntered = numEntered / 10;
            }

        }

        // when the number is a single digit (less than 10)
        // if the numbere divided by 2 has no remainder, it is an even number
        if (numEntered < 10 && numEntered % 2 == 0) {
            // return false meaning that the number or digit is even
            return false;
        } // if the number divided by 2 does not have a remainder of zero
        else {
            // return true, meaning that the number or digit is odd
            return true;


        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input  
        Scanner input = new Scanner(System.in);
        // ask the user for a number they wish to find if all the digits are odd
        System.out.println("Please enter a number you wish to find if all its digits are odd:");
        // store the number entered
        double numEntered = input.nextInt();
        // store a variable for the answer
        boolean ans = allDigitsOdd(numEntered);
        // run the method
        System.out.println(ans);
    }
}
