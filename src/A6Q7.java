

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q7 {
    
    public static void firstDigit(int num){
        if(num < 0){
            num = num * -1;
        }
        int digit = num;
        while(digit >= 10){
        digit = digit / 10;
        }
        System.out.println(digit);
        
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input number");
        int num = input.nextInt();
        
        firstDigit(num);
        
        
        
        
        
        
    }
}
