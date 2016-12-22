
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q05 {
    //create method called chaotic that randomizes asterisks when a total number of lines is entered 
    public static void chaotic(int maxLines) {

        //make a loop to print how many lines needed
        for (maxLines = maxLines + 1; maxLines > 0; maxLines = maxLines - 1) {
            //Create a line to generate random integers between 1-5
            int randAsterisk = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //make a loop to go through each possible asterisk and print the result
            if (maxLines > 1 && maxLines == maxLines) {
                //System outprint the number of asterisks based on the random number
                if (randAsterisk == 5) {
                    System.out.println("*****");
                }
                if (randAsterisk == 4) {
                    System.out.println("****");
                }
                if (randAsterisk == 3) {
                    System.out.println("***");
                }
                if (randAsterisk == 2) {
                    System.out.println("**");
                }
                if (randAsterisk == 1) {
                    System.out.println("*");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Method
        //Create scanner
        Scanner input = new Scanner(System.in);
        //loop
        while (true) {
            //Ask user for number for max lines
            System.out.println("How many lines would you like to be printed?");
            //store that value in an integer
            int maxLines = input.nextInt();
            //run the method
            chaotic(maxLines);
        }
    }
}