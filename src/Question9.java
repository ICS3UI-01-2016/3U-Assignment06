
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question9 {

    public static void allDigitsOdd(int num) {

        while (num > 9) {
            //get last digit
            int last = num % 10;
            //get rid of last digit
            num = num / 10;
            //test to see if "int last" is even
            if ((last == 0) || (last == 2) || (last == 4) || (last == 6) || (last == 8)) {
                //tell the user this
                System.out.println("False: this number contains even digits");
                //stop the loop
                break;
            }
        }
        //if the number has passed the above test it should be able to pass this one:
        if ((num == 1)||(num == 3)||(num == 5)||(num == 7)||(num == 9)){
            //tell the user this
            System.out.println("True: This number is composed entirely of odd digits");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for the number
        System.out.println("Please enter a number");
        //get input from user
        int num = input.nextInt();
        //use method
        allDigitsOdd(num);
    }
}
