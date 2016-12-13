
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q9 {
    //create method that will return even number
    public static boolean allDigitsOdd(int number) {
        //while the number is greater than 0 keep dividing into 10
        while (number > 0) {
            number = number / 10;
            //if the number is divided into 2 and the remainder is 0
            if (number % 2 == 0) {
                //say that this is false
                return false;
            }
        }
        //else return true
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask for the number
        System.out.println("Please enter your number");
        //get the number
        int number=input.nextInt();
        //put the number to the method
        boolean allDigitsOdd= allDigitsOdd(number);
        //print out the answer
        System.out.println(allDigitsOdd);
        // TODO code application logic here
    }
}
