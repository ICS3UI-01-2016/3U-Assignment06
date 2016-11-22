
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manok5757
 */
public class A6Q7 {

public static void firstDigit(double numEntered){
    
    if(numEntered<=10){
      double answer=  Math.round(numEntered/10);
        System.out.println(""+answer);  
    }
    
}
        
        
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input 
        Scanner input = new Scanner(System.in);
        // ask the user for a number they wish to find the first digit of
        System.out.println("Please enter a number you wish to find the first digit of:");
        // store the number
        double numEntered = input.nextDouble();
    }
}
