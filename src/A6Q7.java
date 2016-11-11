/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call method
        int num = firstDigit(-987);
        System.out.println(num);
    }
    public static int firstDigit(int number) {
        //immediately change the number to a positive if it is negative
        if(number < 0){
            number = number * -1;
        }
        /**
         * repeatedly divide the number by 10 until it's less than one
         * leaving only the first digit of the original number
         */
        while(number / 10 >= 1){
            number = number / 10;
        }
        //return the first digit of the original number
        return number;
    }
}
