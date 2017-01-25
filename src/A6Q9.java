/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A6Q9 {

    public static void allDigitsOdd(int integer) {
        // if the integer is equal to zero
        if (integer == 0){
            // print out false
            System.out.println(false);
        }
        // create while loop while integer is greater than zero
        while (integer > 0) {
            // if the integer is 1,3,5,7 or 9
            if(integer == 1 || integer == 3 || integer == 5 || integer == 7 || integer == 9){
                // print true and break
                System.out.println("true");
                break;
            }
            // int number is equal to the remainder of the integer when divided by 10
            int number = integer % 10;
            // if the integer is 2,4,6,8 or 0
            if (number == 2 || number == 4 || number == 6 || number == 8 || number == 0) {
                // print false and break
                System.out.println("false");
                break;
            } else {
                // divide integer by 10
                integer = integer / 10;
            } 
            // if the integer is 2,4,6 or 8
            if(integer == 2 || integer == 4 || integer == 6 || integer == 8){
                // print false and break
                System.out.println("false");
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // output method
        int integer = 4242;
        allDigitsOdd(integer);
    }
}
