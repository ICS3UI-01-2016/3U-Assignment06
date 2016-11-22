
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
public static double lastDigit(double enteredNum){
    // if the number entered is negative, make it a positive by multiplying it by -1
    if(enteredNum<0){
        enteredNum = enteredNum*-1;
    }
    // store the value you get by divinding the number enterd by 10 and store the answer
    double answer = (enteredNum/10);
    // subtract the answer previously stored by the rounded down version of the answer previously stored
    double rightAnswer = answer- Math.floor(answer);
    // return the rounded verion of the rightAnswer multiplied by 10 to get the last digit of the number
    return Math.round(10*rightAnswer);
    
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
        double numEntered = input.nextDouble();
        // run the method
        double rightAnswer = lastDigit(numEntered);
        // output the last digit
        System.out.println(""+rightAnswer);
    }
}
