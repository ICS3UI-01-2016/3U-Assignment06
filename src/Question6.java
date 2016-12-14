
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question6 {

    public static int lastDigit(int last) {
        //find the remainder
        int r = last % 10;
        //if the remainder is a negative, multiply it by negative 1 to make it positive 
        if (r < 0) {
            r = -1 * r;
            
        }
        //return statement 
        return r;
        }

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            //create a scanner
        Scanner input = new Scanner(System.in);
//ask user for number 
        System.out.println("What is the number");
        //save the integer as last 
        int last = input.nextInt();
        //plug number into method and save integer 
        int number = lastDigit(last);
        //tell user the number
        System.out.println(number);
    }
}
