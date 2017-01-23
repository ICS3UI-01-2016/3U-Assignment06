
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q9 {
    public static void allDigitsOdd(int num){
        num = num / 10;
        num = num % 2;
        if(num == 0){
            System.out.println("False");
        if(num > 0){
            System.out.println("True.");
        }    
            
        }
      
        }
        
        
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for series of numbers on the same line
        System.out.println("Enter number: ");
        int num = input.nextInt();
        //apply method
        allDigitsOdd(num);
    }
}
