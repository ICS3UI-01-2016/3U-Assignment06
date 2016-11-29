
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
public static boolean sameDashes(String wordOne, String wordTwo){
    
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
        boolean answer = sameDashes(String wordOne, String wordTwo);
        // output the answer to the user
        System.out.println(answer);
    }
}
