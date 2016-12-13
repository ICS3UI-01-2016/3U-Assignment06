
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q6 {
    //create a new method that will give you last digit of an integer
    public static void lastDigit(int ld) {
        //get the remainder at 10 digit
        int answer = ld % 10;
        //if the answer is negative get the positive number
        if(answer<0){
            //multiply it by negative to get positive
            answer= answer*-1;
        }
        //print out the answer
        System.out.println(answer);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask for the number
        System.out.println("Please enter your number");
        //get the number
        int number = input.nextInt();
        //use lastDigit method to get the answer
        lastDigit(number);
        // TODO code application logic here
    }
}
