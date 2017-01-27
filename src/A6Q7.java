
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q7 {
// create an integer that will be used in the method
    public static int firstDigit(int num1) {
        // create an if statement that will turn a negetive number into a positive one    
        if (num1 < 0) {
            num1 = num1 * -1;
        }
        // divide the number by 100 
        int answer = num1 / 100;
        // give the user the final answer
        System.out.println("The first digit of the number is " + answer);
        // return the answer to the user
        return answer;
    }
        /**
         * @param args the command line arguments
         */
   
     public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input the number they wish to use in the program in the brackets below
        firstDigit(-852);
     }
}


