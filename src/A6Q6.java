
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(int number) {
        // divide last digit to get a remainder
        int lastdigit = number % 10;
        // if lastdigit has no remainder
        if (lastdigit > 0) {
            // print answer to user
            System.out.println(lastdigit);
        }
        // return the answer
        return lastdigit;
    }

    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for a number to input
        System.out.println("Please enter a number to find the last digit of");
        // declare variable to print user the answer
        int last = input.nextInt();
        // call previous loop
        int number = lastDigit(last);
        // print user the last digit of the number
        System.out.println("The last digit of the number is " + number);
    }
}
