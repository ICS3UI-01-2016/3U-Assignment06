
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
    // create a variable that will be used for the method

    public static int lastDigit(int num1) {
        
        
        // create an if statement that will get negative numbers and turn them into positive ones
        if (num1 < 0) {
            num1 = num1 * -1;
        }
        // divide the number
        int answer = num1 % 10;
        // give the user the final answer
        System.out.println("The last digit of the number is " + answer);
        // return tha answer to the user
        return answer;
    }

    /**
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the number they wish to use in the program in the brackets below
        lastDigit(-352);
    }
}
