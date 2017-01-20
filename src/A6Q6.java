
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A6Q6 {

    public static int lastDigit(int integer) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        // let the user input the number
        System.out.println("Input a Number");
        int number = input.nextInt();
        // use the percent operator to determine the remainder
        number = number % 10;
        // return the number inputed by the user
        return number;

    
}
/**
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        // output method     
        int number = lastDigit(15);
        System.out.println(number);


    }
}
