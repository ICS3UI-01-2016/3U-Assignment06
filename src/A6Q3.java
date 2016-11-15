
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl
 */
public class A6Q3 {

    // make a procedure

    public static void factor(int number) {
        // create loop for finding the cators in the number
        for (int factor = 1; factor <= number; factor++) {
            // find remainder of every number the user inputted
            int remainder = number % factor;
            // if the remainder is 0, print out the factor
            if (remainder == 0) {
                // output the factors to the user
                System.out.println(factor);
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factor(10);

    }
}
