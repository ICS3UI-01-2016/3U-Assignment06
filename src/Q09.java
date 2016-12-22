
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q09 {

    //Create a method to determine if all numbers in an integer are Odd or not
    public static boolean AllDigitsOdd(int num) {
        //create for loop to go through the number from last digit to first digit
        for (num = num; num >= 10; num = num / 10) {
            //create algorithm to go through the number and find the last digit
            //divide the number by 10 and round down to get rid of last digit
            int lastDecimal = num / 10;
            //multiply by 10 to add 0 to the end of the number
            int roundedNumber = lastDecimal * 10;
            //subtract the number from the rounded number to get the last digit
            int lastDigit = num - roundedNumber;
            //create if statement to determine if last digit is Even, return False.
            if (lastDigit == 2 || lastDigit == 4 || lastDigit == 6 || lastDigit == 8 || lastDigit == 0) {
                return false;
            }
        }
        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test method
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //loop
        while (true) {
            //Ask for number
            System.out.println("Please enter a number");
            //Store in variable
            int num = input.nextInt();
            //Run method
            boolean answer = AllDigitsOdd(num);
            //sout
            System.out.println(answer);

        }
    }
}