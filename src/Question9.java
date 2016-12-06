
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    // new method that sees if it all odd digits
    public static boolean allDigitsOdd(int number) {
        int odd =0;
        //creating a loop to go trough the whole number
        while (number>9) {
                odd = number%2 ;
                number = number/10;
                if (odd == 0) {
                return false;
            }  

    }
          return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to know the odds for");
        int number = input.nextInt();
        boolean allDigitsOdd = allDigitsOdd(number);
        System.out.println(allDigitsOdd);
    }
}
