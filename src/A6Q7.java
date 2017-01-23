
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q7 {
    public static void finalDigit (int num){
        while (num > 10){
            num = num/10;
            System.out.println("" + num);
            
        }
        while (num < -10){
            num = num/10;
            System.out.println("" + num);
        }
    
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create input
        Scanner input = new Scanner(System.in);
        //ask for number to find final digit
        System.out.println("Enter number: ");
        //store number
        int num = input.nextInt();
        //apply method
        finalDigit(num);
        
        
        
        
    }
}
