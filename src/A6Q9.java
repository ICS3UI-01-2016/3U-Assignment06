
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q9 {
     
    public static boolean allDigitsOdd (int number){
        
        while (number > 0){
            number = number % 10;
        }
        if (number %2 ==0){
            return false;     
        } 
        return true;
    }


        
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your number:");
        int number = input.nextInt();
        boolean allDigitsOdd = allDigitsOdd(number);
        System.out.println(allDigitsOdd);
        
        
        
        
    }
}
