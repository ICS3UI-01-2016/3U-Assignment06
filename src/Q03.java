
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q03 {

    //Create a method to find factors of a number
    public static void factors(int number) {
        //create for loop to go through all possible numbers, starting from original number and going down by 1
        for (int i = number; i > 0; i = i - 1) {
            //create a precent operator to check if there is a remainder
            int factor = number % i;
            //create if statement to print the number in 'i' when it equals 0
            if (factor == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test method
        while (true) {
            //Create a scanner
            Scanner input = new Scanner(System.in);
            //ask user for a number 
            System.out.println("Please enter a number you want to find the factors to");
            //store that variable
            int number = input.nextInt();
            //Print the user his factors
            System.out.println("the factors for " + number + " are:");
            //run that method
            factors(number);

        }
    }
}