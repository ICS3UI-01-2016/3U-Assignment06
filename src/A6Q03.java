
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A6Q03 {

    //method for the factors
    public static void factors(int num) {

        //begin at 1
        //divide number until factored
        for (int i = 1; i < num; i++) {
            //make int default+
            int b = num;
            //int will get rid of remainder
            int a = 0;
            //percent operator for remainder
            a = b % i;
            //divide by entered number
            b = b / i;
            //if the remainder of number entered is zero
            if (a == 0) {
                //show answer
                System.out.println(i);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //base point for code (number that will be 
        factors(100);


    }
}
