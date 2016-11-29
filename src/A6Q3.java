
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q3 {

    public static void factors(int num){
        
        for(int f = 1; f <= num; f++){
            if(num % f == 0){
                System.out.println(num/f);
            }
            
        }
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number");
        int num = input.nextInt();
        
        factors(num);
        
    }
}
