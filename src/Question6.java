
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question6 {
    
    public static void lastDigit(int num){
        //figure out if the number is negative
        if (num < 0){
            //make the number positive
            num = num * -1;         
        }
        //find the last digit
            num = num % 10;  
            //tell the user
        System.out.println("The last digit is " + num);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for a number
        System.out.println("What number do you want the last digit of?");
        //get input from user
        int num = input.nextInt();
        //use the method
        lastDigit(num);
    }
}
