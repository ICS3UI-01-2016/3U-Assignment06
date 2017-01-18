
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q06 {

    //create method to fetch last digit of any number
    public static int lastDigit(int number) {
        //create algorithm to go through the number and find the last digit
        //divide the number by 10 and round down to get rid of last digit
        int lastDecimal = number / 10;
        //multiply by 10 to add 0 to the end of the number
        int roundedNumber = lastDecimal * 10;
        //subtract the number from the rounded number to get the last digit
        int lastDigit = number - roundedNumber;
        //convert last digit into positive if negative
        if (lastDigit < 0) {
            lastDigit = lastDigit - lastDigit - lastDigit;
        }
        //return the last digit
        return lastDigit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test method
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //create loop
        while (true) {
            //ask user for number
            System.out.println("Please enter a number in order to find the last digit.");
            //store in a variable
            int number = input.nextInt();
            //print last digit using method
            System.out.println("The last digit is " + lastDigit(number));
        }
    }
}
