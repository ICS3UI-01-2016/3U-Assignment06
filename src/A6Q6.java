
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manok5757
 */
public class A6Q6 {
public static int lastDigit(int enteredNum){
    int answer = enteredNum/10;
    return answer;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        // ask the user for a number they wish to know the last digit of
        System.out.println("Please enter a number you wish to discover the last digit of:");
        // store the number
        int numEntered = input.nextInt();
        // run the method
        int answer = lastDigit(numEntered);
        System.out.println(""+answer);
    }
}
