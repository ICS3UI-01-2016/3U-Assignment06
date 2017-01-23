
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int repeat) {
        // start loop by creating a count
        int count = 1;
        // while count is  less than or equal to repeat loop
        while (count <= repeat) {
            // multiply random number by (5-1+1) +1
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // if random number is 5
            if (randNum == 5) {
                // print out asterisk
                System.out.println("*****");
            }
            // if random number is 4
            if (randNum == 4) {
                // print out asterisk
                System.out.println("****");
            }
            // if random number is 3
            if (randNum == 3) {
                // print out asterisk
                System.out.println("***");
            }
            // if random number is 2
            if (randNum == 2) {
                // print out asterisk
                System.out.println("**");
            }
            // if random number is 1
            if (randNum == 1) {
                // print out asterisk
                System.out.println("*");
            }
            // loop by adding one each time
            count = count + 1;
        }
    }

    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for their account balance
        System.out.println("Please enter a number you wiah to be repeated randomly.");
        // store user number with variable
        int repeat = input.nextInt();
        // print user the answer
        chaotic(repeat);









    }
}
