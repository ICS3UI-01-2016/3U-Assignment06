
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    // new method that finds the last digit in a number
    public static int  lastDigit(int num){
      int last = num%10;
      // calculating the last digit
      if (last>0){
          System.out.println(last);
      }
       return last; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want the last digit for");
       int last = input.nextInt();
       int num = lastDigit(last);
        System.out.println("The last digit is " + num );
               
    }
}
