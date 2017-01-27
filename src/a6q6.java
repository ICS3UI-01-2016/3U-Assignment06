
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q6 {

    /**
     * @param args the command line arguments
     */
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
        int lastd =lastDigit(num1);
        //print 
        System.out.println(lastd);
        
        
    }
}
