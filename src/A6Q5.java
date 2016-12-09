//you wont notice this comment
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A6Q5 {
// Create a method that generates random patterns of asterisks between 1 and 5
// the user's input is going to use to determine the amount of times the pattern will generate  

    public static void chaotic(int number) {
        //Create a for loop count 
        for (int i = 0; i < number; i = i + 1) {
            // A formula to generate a number between 1 and 5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // If the number is 5 then print five asterisks 
            if (randNum == 5) {
                System.out.println("*****");
            }
            // If the number is 4 then print four asterisks      
            if (randNum == 4) {
                System.out.println("****");
            }
            // If the number is 3 then print three asterisks        
            if (randNum == 3) {
                System.out.println("***");
            }//what
            // If the number is 2 then print two asterisks        
            if (randNum == 2) {
                System.out.println("**");
            }
            // If the number is 1 then print one asterisks        
            if (randNum == 1) {
                System.out.println("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    // Test out method to make sure that it works.
    public static void main(String[] args) {
        // Create a scanner 
        Scanner input = new Scanner(System.in);
        // Make the user input how many time they want to generate the pattern.
        System.out.println(" Please enter in how many time you want the lines of symbols to print out");
        int number = input.nextInt();
        //Apply the number
        chaotic(number);



    }
}