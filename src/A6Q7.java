
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q7 {
    //create a method that will give you the first digit of the number

    public static void firstDigit(int fd) {
        //if the number is negative, get the positive number
        if (fd < 0) {
            //multiply it by negative to get positive
            fd = fd * -1;
        }
        //if the number is greater than 9 keep divide the number into 10
        while (fd > 9) {
            fd = fd / 10;
        }
        //when you get the number is less than 9 print out the number
        if (fd <= 9) {
            System.out.println(fd);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask for the number
        System.out.println("Please enter your number");
        //get the number
        int number = input.nextInt();
        //using firstDigit method to get the answer
        firstDigit(number);
        // TODO code application logic here
    }
}
