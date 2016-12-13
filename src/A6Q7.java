
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int num) {
        int a = num;
        //shift number over
        //negative number
        if (a < 0) {
            a = a * - 1;

        }
        //divide by 10 to pull away digit
        while (a > 10) {
            a = a / 10;
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //while loop to allow continuation
        while (true) {
            System.out.println("Enter number: ");
            int num = input.nextInt();
            //show first digit
            int firstDigit = firstDigit(num);
        }
    }
}
