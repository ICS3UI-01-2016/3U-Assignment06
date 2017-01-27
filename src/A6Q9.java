
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayyaf3300
 */
public class A6Q9 {
     
    public static int allDigitsodd(int num1) {

              // put the last digit to integer
         int last = num1 % 10;
         // make loop to find if users number is odd
         while (last % 2 == 1) {
             num1 = num1 / 10;
             last = num1 % 10;
         }
         // output if the users number is true or false
         if (num1 <= 10) {
             System.out.println("True");
         } else {
             System.out.println("False");
         }
 return last;
     }
    

    /**
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the number they wish to use in the program in the brackets below
        allDigitsodd(5791);
    }
}