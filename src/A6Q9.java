
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static int allDigitsOdd(int number) {
        String num = Integer.toString(number);

        //make number positive
        if (number < 0) {
            number = number * - 1;
        }
        //odd numbers output a true
        if (num.contains("1") || num.contains("3") || num.contains("5") || num.contains("7") || num.contains("9")) {
            System.out.println("True");
        } else {
            //even numbers output a false
            if (num.contains("0") || num.contains("2") || num.contains("4") || num.contains("6") || num.contains("8")) {
                System.out.println("False");

            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//while loop to continue the program
        while (true) {
            System.out.println("Enter numbers here; ");
            int a = input.nextInt();
            int allDigitsOdd = allDigitsOdd(a);
        }
    }
}
