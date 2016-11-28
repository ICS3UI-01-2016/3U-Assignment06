
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question7 {

    public static void firstDigit(int num) {
        //figue out if the number is negative
        if (num < 0) {
            //make the number positive
            num = num * -1;
        }
        while (num > 9) {
            num = num / 10;        
        }
        System.out.println("The first digit is " + num);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for a number
        System.out.println("What number do you want the first digit of?");
        //get input from user
        int num = input.nextInt();
        //use the method
        firstDigit(num);
    }
}
