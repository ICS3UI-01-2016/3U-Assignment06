

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class Question7 {
    public static int firstDigit(int first){       
       while (first >=10 ){
          first = first/10;
       }     
       return first;
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
        int number = input.nextInt();
        //plug number into method and save integer 
        int first = firstDigit(number);
       
        //tell user the number
        System.out.println("The first digit is " +first);
    }
}
