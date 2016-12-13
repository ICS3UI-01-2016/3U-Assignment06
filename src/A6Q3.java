
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q3 {
//create a method that will give you factor
    public static void factors(int num) {
        //if the i is less than the number, keep dividing
        for (int i = 1; i < num; i = i + 1) {
            //using % operator to get the remainder
            int answer = num % i;
            //if there is no remainder, print out the answer
            if (answer == 0) {
                System.out.println(i);
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask for the number
        System.out.println("Please enter the number");
        //get the number
        int number = input.nextInt();
        //put the number to use the method
        factors(number);
        // TODO code application logic here
    }
}
