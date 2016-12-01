
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q7 {
    
     public static void firstDigit (int number){
         // if the number is greater than 0
         if (number < 0){
             // multiply it by -1 to make the number positive
         number = number * -1;
         }
         // make a loop to find if the remainder is less than 9
         while (number > 9){
             // divide the number by 10 to know that is positive
             number = number / 10;
         }
         // if the remainder is not greater than 10
         if (number <= 9){
             // the computer will print the number
             System.out.println(number);
         }
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a input for the user
        Scanner input = new Scanner (System.in);
        // aks the user for the number they want to enter
        System.out.println("Please enter the number:");
        int number = input.nextInt();
        // try to apply the method using this method
        firstDigit (number);
        
        
    }
}
