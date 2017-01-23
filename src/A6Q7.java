
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int number) {
        // divide the number by 10 to get no remainder
        int firstdigit = number / 10;
        // if first digit is greater than or eqaul to 9
        while (firstdigit >= 9) {
            // divide the digit by 10 again to ensure there is no remainder
            firstdigit = firstdigit / 10;
        }
        // reutnr the answer to the user
        return firstdigit;
    }

    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for a number to input
        System.out.println("Please enter a number to find the first digit of");
        // declare variable to print user the answer
        int first = input.nextInt();
        // call previous loop
        int number = firstDigit(first);
        // print user the first digit of the number
        System.out.println("The first digit of the number is " + number);

    }
}
