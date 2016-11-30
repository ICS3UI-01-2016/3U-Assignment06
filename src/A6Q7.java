
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q7 {

    public static double firstDigit(double numEntered) {
        // start this loop if the number entered is greater than and or less than 10 
        while (numEntered >= 10) {
            // keep on diving the number entered by 10 and rounding it until the number becomes one digit
            numEntered = Math.round(numEntered / 10);
        }
        // round the final answer down to get the first digit
        return Math.floor(numEntered);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input 
        Scanner input = new Scanner(System.in);
        // ask the user for a number they wish to find the first digit of
        System.out.println("Please enter a number you wish to find the first digit of:");
        // store the number
        double numEntered = input.nextDouble();
        // make 'answer' equal to the method firstDigit
        double answer = firstDigit(numEntered);
        // output the answer to the user
        System.out.println("The first digit is " + answer);
    }
}
