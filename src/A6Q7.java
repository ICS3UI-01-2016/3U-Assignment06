
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A6Q7 {
// Create a method that will only return the first digit of the number 
// User inputs a number   

    public static void firstDigit(int number) {
        // if it return back a 0, take the remainder and multiplied  by a negative 1   
        if (number < 0) {
            number = number * -1;
        }
        // If the number is not less than 9 less create a loop that divide by 10. 
        while (number > 9) {
            number = number / 10;
        }
        //if it is equal of less and than print the number reamining.
        if (number <= 9) {
            System.out.println(number);
        }

    }

    /**
     * @param args the command line arguments
     */
    //test out method and make sure that it works
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        // ask for the user to input the number
        System.out.println("Please enter a number");
        int number = input.nextInt();
        // Apply the method   
        firstDigit(number);
    }
}
