//you wont see this comment
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question3 {

    public static void factors(int number) {
//set the integer to start at 1 
        int integer = 1;
        //while the interger is more or equal to number, run the loop
            while (integer <= number) {
                //check for integer
                if (number % integer == 0) {
                    System.out.println(integer);
                }
                //always increase integer by 1
                integer = integer + 1;
            }
        }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        //tell user the number 
        System.out.println("Enter the number");
        //save the number they input as the next variable 
        int number = input.nextInt();
        //run the command using the static void method
        factors(number);
    }
}
