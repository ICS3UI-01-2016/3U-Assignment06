
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A6Q7 {
    
    public static int firstDigit(int integer){
        
        // let number be equal to integer
        int number = integer;
        // make a loop to determine the value of the first digit of the number
        while(true){
            // if the number is greater than or equal to 1 or less than or equal to 9 break the program
            if (number >= 1 && number <=9){
                break;
            }
            // divde number by 10
            number = number / 10;
             // if the number is greater than or equal to 1 or less than or equal to 9 break the program
            if (number >= 1 && number <=9){
                break;
            }
        }
        // return the number
        return number;
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // outpud method 
        int firstDigit = firstDigit(9928);
        System.out.println(firstDigit);
    }
}
