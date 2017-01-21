
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q9 {

    /**
     * @param args the command line arguments
     */
    
    
    public static boolean allDigitsOdd(int num){
        //initialize variable for if num is all odd #s
        boolean allodd = true;
        
        while(num>9){
            //get last digit of number, then get remainder and if 0 then =even
            if(lastDigit(num)%2==0){
                allodd= false;
            }
            num = num/10;
        }
        if(num%2==0){
                allodd= false;
            }    
        return allodd;
        
    }
    
    public static int lastDigit(int num){
        //create variable for last digit
        int ld = num%10;
        //if input # is negative
        if(num<0){
            ld= (num%10)*-1;
        }
        //return the last digit
        return ld;
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        //test code
        //create input for the user
        Scanner input= new Scanner(System.in);
        //let user type in #
        int num1 = input.nextInt();
        //call method & create variable for last digit
        boolean allodd =allDigitsOdd(num1);
        //print 
        System.out.println(allodd);
    }
}
