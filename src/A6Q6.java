
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A6Q6 {
// Create a method that will only return the last digit of the number 
// User inputs a number   

    public static void lastDigit(int number) {
// Take the number and divide it so that it returns the remainder        
        int answer = number % 10;
// if it return back a 0, take the remainder and multiplied  by a negative 1       
        if (answer < 0) {
            answer = answer * -1;
// Print the answer
            System.out.println(answer);
        }
    }

    /**
     * @param args the command line arguments
     */
    // Test the method to make sure that works 
    public static void main(String[] args) {
        // create a scanner     
        Scanner input = new Scanner(System.in);
        // Ask the user to print the number     
        System.out.println("Please enter a number");
        int number = input.nextInt();
        // Apply the method   
        lastDigit(number);
    }
}
