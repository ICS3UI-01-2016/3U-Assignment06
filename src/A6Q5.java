
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class A6Q5 {
    // create a method that will count the number of lines and multiply it by the number in chaotic
    public static void chaotic(int numlines){
        // create a for loop that will get the lines to equal zero then get lines to add itself 
        for (int lines = 0; numlines > lines; lines = lines + 1) {
            // create a variable that will get a random number
            int randNum = (int) (Math.random()* (5-1+1))+1;
            // create a for loop that will get the the number of stars to add itself
            for (int stars = 0; randNum > stars; stars = stars +1) {
                // output the stars for the program
                System.out.println("*");
            }
            System.out.println("");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // put the number you want the program to run in the brackets below
        chaotic(7);
    }
}
