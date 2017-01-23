
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static void allDigitsOdd(String digit) {
        // if the digit entered contains 2,4,6,8, or 0 then print out false
        if (digit.contains("2") || digit.contains("4") || digit.contains("6") || digit.contains("8") || digit.contains("0")) {
            // if false, print out false to user
            System.out.println("False");
        } // if the digit does not contain 2,4,6,8, or ,0 then print out true
        else {
            // if true, print out true to user
            System.out.println("True");
        }
    }

    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for a number they would like to know if it is odd
        System.out.println("Please enter a number you would like to determine if it is true or false");
        // store user input with a variable
        String digit = input.nextLine();
        // call method to determine odd integers
        allDigitsOdd(digit);

    }
}
