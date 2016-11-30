
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
        // find all the dashes in word one begining from the first character (0)
        int dashes = 0;
        for(int i=0;  i<=length ;  i=i+1){
             dashes = wordOne.indexOf('-', 0)+dashes;

        }
        int dashesTwo =0;
        for(int r=0;  r<=length ;  r=r+1){
             dashesTwo = wordOne.indexOf('-', 0)+dashesTwo;
        }
        // find all the dashes in word two begining from the first character (0)
        
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
