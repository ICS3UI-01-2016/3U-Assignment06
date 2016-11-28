
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q9 {

    public static boolean allDigitsOdd(double numEntered) {
        while (numEntered >= 10) {
            if ((((numEntered / 10) - Math.floor(numEntered / 10)) * 10) % 2 > 0) {
                return false;
            } else {


                while (((numEntered / 10 - Math.floor(numEntered / 10)) * 10) % 2 > 0) {
                    return true;

                }
                {
                    
                }
            }
        }

        if (numEntered < 10 && numEntered % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input  
        Scanner input = new Scanner(System.in);
        // ask the user for a number they wish to find if all the digits are odd
        System.out.println("Please enter a number you wish to find if all its digits are odd:");
        // store the number entered
        double numEntered = input.nextInt();
        // run the method
        boolean ans = allDigitsOdd(numEntered);
        System.out.println(ans);
    }
}
