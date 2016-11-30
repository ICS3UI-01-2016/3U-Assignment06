
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void lastDigit(int num) {
        int last = num % 10;
        if (last < 0) {
            last = last * (-1);
        }
        System.out.println("your last digit is " + last);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input an number");
        int num = input.nextInt();
        lastDigit(num);
    }
}
