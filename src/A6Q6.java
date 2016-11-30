
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q6 {
    
    public static void lastDigit (int number){
        // to 
       int result = number % 10;
       if (number < 0){
           result = result * -1;
           System.out.println(result);
       } else {
           if (number > 0){
               System.out.println(result);
           }
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the number:");
        int number = input.nextInt();
        lastDigit (number);
        
        
        
    }
}
