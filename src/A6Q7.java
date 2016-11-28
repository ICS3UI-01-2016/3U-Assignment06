
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
         if (number < 0){
         number = number * -1;
         }
         while (number > 9){
             number = number / 10;
         }
         if (number <= 9){
             System.out.println(number);
         }
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the number:");
        int number = input.nextInt();
        firstDigit (number);
        
        
    }
}
