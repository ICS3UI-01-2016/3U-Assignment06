/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A6Q9 {
    // create method

    public static void allDigitsOdd(int number) {
        // put the last digit to integer
        int last = number % 10;
        // make loop to find if users number is odd
        while (last % 2 == 1) {
            number = number / 10;
            last = number % 10;
        }
        // output if users number is true or false
        if (number <= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        allDigitsOdd(9145293);
    }
}
