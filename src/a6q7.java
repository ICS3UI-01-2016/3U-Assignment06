

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q7 {

    /**
     * @param args the command line arguments
     */
    
    public static int firstDigit(int num){
        
        //make num (first digit of #) always come back positive
        num = Math.abs(num);
        //loop while the input number is greater than 9 then divide by 10.
        while(num>9){
            num=num/10;
        }
        
        
        
        
        return num;
    }
    
    
    
    public static void main(String[] args) {
//test code
        //create input for the user
        Scanner input= new Scanner(System.in);
        //let user type in #
        int num1 = input.nextInt();
        //call method & create variable for last digit
        int firstd =firstDigit(num1);
        //print 
        System.out.println(firstd);
    }
}
