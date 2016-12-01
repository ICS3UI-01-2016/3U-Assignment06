
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
        // get length of word one
        int length = wordOne.length();
        // get length of word two
        int lengthTwo = wordTwo.length();
        // set the variable dashes equal to 0
        int dashes = 0;
        //set the variable dashes two equal to 0
        int dashesTwo = 0;
        // run this loop the number of times equal to the length of the word
        for (int i = 0; i <= length; i = i + 1) {
            // find the position of all of the dashes starting from the first character until the length of the word is reached for word one
            dashes = wordOne.indexOf('-', i);
            // find the position of all of the dashes starting from the first character until the length of the word is reached for word two
            dashesTwo = wordTwo.indexOf('-', i);
            // if the first position of the dashes between the two words is not equal
            if (dashes != dashesTwo) {
                // return false
                return false;
            }


        }
        // if all the positions of the dashes are equal between both words
        if (dashes == dashesTwo) {
            // return true
            return true;
        }
        // if the both words do not contain dashes
        if (wordOne.indexOf('-') == -1 && wordTwo.indexOf('-') == -1) {
            // return true
            return true;
        } else {
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
