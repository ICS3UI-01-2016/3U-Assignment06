
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static int lastDigit(int num) {
        int a = num;
        //pull apart number into its digits
        a = a % 10;
        //shift number over
        //negative number
        if (a < 0) {
            a = a * -1;
        }
        //return "a" value if true
        System.out.println(a);
        return a;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //while loop true show "a" value
        while (true) {
            System.out.println("Enter number: ");
            int num = input.nextInt();
            int lastDigit = lastDigit(num);
        }
    }
}
