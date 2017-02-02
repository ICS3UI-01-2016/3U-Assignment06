
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class A6Q7 {
    public static void firstDigit (int num){
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
        //create input for user
        Scanner input = new Scanner(System.in);
        //ask user for number to find first digit
        System.out.println("Enter number: ");
        //store number
        int num = input.nextInt();
        //apply method
        firstDigit(num);
        
        
        
    }
}
