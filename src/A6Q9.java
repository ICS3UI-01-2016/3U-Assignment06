
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q9 {
    
    public static void allDigitsOdd(int digit){
        
        if(digit % 10 == 0){
            System.out.println("False");
        }else if(digit % 10 == 2){
            System.out.println("False");
        }else if(digit % 10 == 4){
            System.out.println("False");
        }else if(digit % 10 == 6){
            System.out.println("False");
        }else if(digit % 10 == 8){
            System.out.println("False");
        }
        if(digit % 10 == 1){
            System.out.println("True");
        }else if(digit % 10 == 3){
            System.out.println("True");
        }else if(digit % 10 == 5){
            System.out.println("True");
        }else if(digit % 10 == 7){
            System.out.println("True");
        }else if(digit % 10 == 9){
            System.out.println("True");
        }
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input digit");
        int digit = input.nextInt();
        
        allDigitsOdd(digit);
        
        
        
        
    }
}
