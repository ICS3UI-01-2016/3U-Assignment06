
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q6 {
    public static void finalDigit (int num){
        int finalDigit = num % 10;
        System.out.println("" + finalDigit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner
        Scanner input = new Scanner (System.in);
        //ask for number
        System.out.println("Enter number for final digit: ");
        //store the number
        int num = input.nextInt();
        finalDigit(num);
        
    }
}
