
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q3 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void factors(int num){
        //for every number up to the number inputed by the user...
        for(int i=1; i<=num; i++){
            //if there is no remainder when dividing print i
            if(num%i==0){
                System.out.println(i);
            }
        }
        
        return; 
    }
    
    
    
    
    
    public static void main(String[] args) {
        //create input for the user
    	Scanner input= new Scanner(System.in);
        //let user input number
        int number = input.nextInt();
        //call method
        factors(number);
        
        
    }
}
