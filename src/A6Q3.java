
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q3 {
    // create a loop that stores the number 

    public static void factors(int num) {
        // create a loop that will go through all of the numbers between 1 and the number
        for (int factor = 1; factor <= num; factor++) {
            // creat a varaiable remainder to store the remainder of the number
            int remainder = num % factor;
            // if the number is 0 then print out the factor
            if (remainder == 0) {
                // tell the user what the factors are
                System.out.println(factor);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // put the number you want the program to run in the brackets below
        factors(30);

    }
}
