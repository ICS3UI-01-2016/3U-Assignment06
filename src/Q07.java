
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class Q07 {

    //create method to fetch first digit of any number
    public static int firstDigit(int number) {
        //create algorithm to go through the number and find the first digit
        
        //create while loop to go up to the first digit
        while (number >= 10){
            //keep dividing
           number = number / 10;
            //once the number is less than 10, stop.
            if (number < 10){
                break; 
            }
        }
        return number;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Method
        //Create a scanner
        Scanner input = new Scanner (System.in);
        //create a loop
        while (true){
        //ask user for a number to find first digit
            System.out.println("Please enter a number");
            //store number in a variable
            int number = input.nextInt();
            //run method on number
            int ans = firstDigit(number);
            //print the result
            System.out.println("The first digit is " + ans);
        }
    }
}
