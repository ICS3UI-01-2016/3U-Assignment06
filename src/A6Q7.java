
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void firstDigit(int num) {
        int first = num;
        while (first > 10) {
            first = first / 10;
        }
        if (first < 0) {
            first = first * (-1);
        }
        System.out.println("your first digit is " + first);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input an number");
        int num = input.nextInt();
        firstDigit(num);
    }
}
