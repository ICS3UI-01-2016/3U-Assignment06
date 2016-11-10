/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call method
        int num = lastDigit(-5534);
        System.out.println(num);
    }
    public static int lastDigit(int number) {
        // Find the last digit by finding the remainder of the number divided by 10
        number = number % 10;
        //If the number was negative change it to a positive
        if (number < 0) {
            number = number * -1;
        }
        //return the last digit of the number given
        return number;
    }
}
