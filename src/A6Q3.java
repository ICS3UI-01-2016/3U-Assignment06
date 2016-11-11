/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call method
        factors(1000000);
    }

    public static void factors(int num) {
        /**
         * create a factor int that will divide the number
         * loop ends once the factor divides the number by itself
         * factor starts at one so as not to divide by 0
         */
        for (int fact = 1; fact <= num; fact++) {
            //only show factors which result in whole numbers
            if (num % fact == 0) {
                System.out.println(num/fact);
            }
        }
    }
}
