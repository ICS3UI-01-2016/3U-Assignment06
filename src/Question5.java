
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question5 {

    public static void chaotic(int Lines) {
//create a counted loop
        //start integer input at 0
        int input = 0;
        //create while loop, while the integer is not equal to entered number, repeat loop
        while (input != Lines) {
            //use the formula to make sure the random number is between 1 and 5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

            if (randNum == 1) {
                //if it is one then print one asterik
                System.out.println("*");
            }
            if (randNum == 2) {
                //if it is two then print two asterik
                System.out.println("**");
            }
            if (randNum == 3) {
                //if it is 3 then print 3 asteriks
                System.out.println("***");
            }
            if (randNum == 4) {
                //if it is 4 then print 4 asteriks

                System.out.println("****");
            }
            if (randNum == 5) {
                //if it is 5 then print 5 asteriks
                System.out.println("*****");
            }
            input = input + 1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //Ask user for number
        System.out.println("Give the number ");
        //save interger
        int Lines = input.nextInt();
        //run method with the integer
        chaotic(Lines);

    }
}
