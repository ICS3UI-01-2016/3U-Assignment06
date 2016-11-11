/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call method
        allDigitsOdd(195993);
    }

    public static void allDigitsOdd(int number) {
        //Make a string out of the number given
        String num = String.valueOf(number);
        //replace any even numbers with an exclamation mark
        String check = num.replaceAll("[24680]", "!");
        //depending on if an ! exists, output true or false
        if (check.indexOf("!") != -1) {
            System.out.println("False");
        }
        if (check.indexOf("!") == -1) {
            System.out.println("True");
        }
    }
}
