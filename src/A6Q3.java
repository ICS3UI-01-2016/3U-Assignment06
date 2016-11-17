
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q3 {

    // create a method to list all the factors of a number
    public static void factors(int numEntered) {
        // make the method only test each number for possible factors from 0 the number inputed
        for (int numbers = 1; numbers <= numEntered; numbers = numbers + 1) {
            // if there is no remainder, then the number is a factor
            if (numEntered % numbers == 0) {
                // output the factor of the number if it divides evenley
                System.out.println("" + numbers);
            }



        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scenner to collect input
        Scanner input = new Scanner(System.in);
        // ask the user for the number they wish to find the factors of
        System.out.println("Please enter a number you wish to find the factors of");
        // store the number entered
        int numEntered = input.nextInt();
        factors(numEntered);
    }
}
