
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**`76 
 *
 * @author vandl4973
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    // new method that finds the first digit
     public static int  firstDigit(int num){
     // breaking the number up
      int first = num/10;
      //sperating the number further
      if (first > 9){
          first= first/10;
      }
      if (first <= 9 ){
          System.out.println(first);
          
      }
       return first; 
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want the first digit for");
       int first = input.nextInt();
       int num = firstDigit(first);
        System.out.println("The first digit is " + num );
               
    }
}

