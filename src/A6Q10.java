
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q10 {

    public static boolean sameDashes(String wordOne, String wordTwo) {
        // find all the dashes in word one begining from the first character (0)
        int dashes = wordOne.indexOf('-', 0);
        // find all the dashes in word two begining from the first character (0)
        int dashesTwo = wordTwo.indexOf('-', 0);
        // if the positions of the dashes in both words is the same
        if (dashes == dashesTwo) {
            // return true
            return true;
        }// if they are not in the same position in both words
        else {
            // return false
            return false;
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for the input
        Scanner input = new Scanner(System.in);
        // ask the user for two strings
        System.out.println("Please enter a word: ");
        // store this string
        String wordOne = input.nextLine();
        // ask the user for the second word
        System.out.println("Please enter another word: ");
        // store this string
        String wordTwo = input.nextLine();
        // store a variable for the method
        boolean answer = sameDashes(wordOne, wordTwo);
        // output the answer to the user
        System.out.println(answer);
    }
}
