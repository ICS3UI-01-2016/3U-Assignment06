
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static void digitsOdd(int num) {
        //CHECK EVERY DIGIT TO SEE IF ITS odd
        while (num < 10) {
            // if there is an even number print out false
            if (num % 10 == 0 && num % 10 == 2 && num % 10 == 4 && num % 10 == 6 && num % 10 == 8) {
                System.out.println("false");
                break;
            }
            num = num / 10;
        }
        //if the number is odd print out true
        if (num % 10 == 1 && num % 10 == 3 && num % 10 == 5 && num % 10 == 7 && num % 10 == 9) {
            System.out.println("true");
        }
    }

    public static void main(String[] args) {
        // get the number and start the method
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        digitsOdd(numb);
    }
}
