
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question9 {

    public static boolean allDigitsOdd(int odd) {
        //create while loop
        while (odd > 0) {
            //check for even number
            int num = odd % 2;
            //cut off the digit to move onto the next digit
            odd = odd / 10;
            //return false if the integer equals zero meaning that it is a even number
            if (num == 0) {
                //return it false
                return false;
            }
        }
        //or return true if they are all odd numbers
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input a scanner
        Scanner input = new Scanner(System.in);
        //if the loop is true
        while (true) {
            //ask user for number
            System.out.println("Enter the number");
            //save integer as number
            int number = input.nextInt();
            //run it through the method
            boolean integer = allDigitsOdd(number);
            //tell user the answer
            System.out.println(integer);
        }

    }
}
