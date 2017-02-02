
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class A6Q6 {
    public static void lastDigit (int num){
        int lastDigit = num % 10;
        System.out.println("" + lastDigit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for user
        Scanner input = new Scanner (System.in);
        //ask user for number
        System.out.println("Enter number for last digit: ");
        //store number
        int num = input.nextInt();
        lastDigit(num);
    }
}
