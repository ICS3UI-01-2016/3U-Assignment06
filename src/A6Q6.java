/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A6Q6 {
    // create method

    public static void lastDigit(int num) {
        // multiply the input by -1 if the input is a negative number
        if (num < 0) {
            num = num * -1;
        }
        // percentage of input
        int endNum = num % 10;
        // divide input by 10
        num = num / 10;
        // output the last digit to user
        System.out.println("The last digit of your integer is " + endNum + ".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use method
        lastDigit(3572);
    }
}
