
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void factor(int number) {
        // start loop by in initiating the loop
        int count = 1;
        // if the count loop is less than or equal to the user input
        while (count <= number) {
            // take user number and divide to get a remainder
            int factor = number % count;
            // if the remained is zero, print answer to user
            if (factor == 0) {
                System.out.println(count);
            }
            // repeat loop by adding one each time
            count = count + 1;
        }
    }

    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for a number to find the variables of
        System.out.println("Please enter a number you wish to factor");
        // link previous void loop
        int number = input.nextInt();
        // user previous varable
        // return factors of the variable
        factor(number);
    }
}
