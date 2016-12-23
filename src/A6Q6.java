
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q6 {
    // make a variable for the user to 

    public static int lastDigit(int num1) {
        // tell the user to enter the number
        
        
        if (num1 < 0) {
            num1 = num1 * -1;
        }
        // get the number and use the 
        int answer = num1 % 10;
        // give the user the final answer
        System.out.println("The last digit of the number is " + answer);
        return answer;
    }

    /**
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the number they wish to use in the program in the brackets below
        lastDigit(352);
    }
}
