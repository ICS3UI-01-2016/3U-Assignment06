
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A6Q5 {

    public static void chaotic(int numLines) {

        // let lines be equa; to zero
        int lines = 0;
        // while lines is not equal to the number of lines, repeat counted loop
        while (lines != numLines) {

            // create a random number between 1 and 5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

            // if the random number is equal to 1
            if (randNum == 1) {
                System.out.println("*");
            }
            // if the random number is equal to 2
            if (randNum == 2) {
                System.out.println("**");
            }
            // if the random number is equal to 3
            if (randNum == 3) {
                System.out.println("***");
            }
            //  if the random number is eqaul to 4
            if (randNum == 4) {
                System.out.println("****");
            }
            // if the random number is equal to 5
            if (randNum == 5) {
                System.out.println("*****");
            }

            // counted loop 
            lines = lines + 1;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create system input
        Scanner input = new Scanner(System.in);

        // ask the user how many lines of astericks they want
        System.out.println("How many lines?");
        int numLines = input.nextInt();
        
        // input method
        chaotic(numLines);

    }
}
