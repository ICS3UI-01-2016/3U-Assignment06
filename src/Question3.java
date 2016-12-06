
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    // new method that finds all the factors
    public static void factors(int number) {
        int count = 1;
        // factoring
        while (count <= number) {
            int factor = number % count;
            if (factor ==0){ 
                System.out.println(count);
            }
            count = count + 1;
            
        }
        
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
         System.out.println("Please enter the number you would like factor");
         int number = input.nextInt();
         factors(number);
    }
}
