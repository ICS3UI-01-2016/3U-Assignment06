
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A6Q3 {

    public static void factors(int integer) {

        // let the inital number be equal to 1
        int number = 1;
        // while the integer is greater than the number
        while (integer >= number) {
            // create int remainder to store the remainder
            int remainder = integer % number;
            // if it is equal to zero than print it out
            if (remainder == 0) {
                System.out.println(number);
            }
            // counted loop, stop when number is equal to integer
            number = number + 1;

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // output method
        factors(10);
    }
}
