
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q5 {

    public static void chaotic(int printLines) {
        // run the method a certain number of times until it is equal to the number of lines the user wants
        for (int i = 1; i <= printLines; i = i + 1) {
            // generate a random number between 1 and 5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // if the random number is 1, then output one asteriks
            if (randNum == 1) {
                System.out.println("*");
            }
            // if the random number is 2, then output two asteriks
            if (randNum == 2) {
                System.out.println("**");
            }
            // if the random number is 3, then output three asteriks
            if (randNum == 3) {
                System.out.println("***");
            }
            // if the random number is 4, then output four asteriks
            if (ranNum == 4) {
                System.out.println("****");
            }
            // if the random number is 5, then output five asteriks
            if (randNum == 5) {
                System.out.println("*****");
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        // ask user for how many lines to print off
        System.out.println("How many lines of random numbers would you like to print off?");
        // store the answer
        int printLines = input.nextInt();
        // runt the method
        chaotic(printLines);
    }
}
