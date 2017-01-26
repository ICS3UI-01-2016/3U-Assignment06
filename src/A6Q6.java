
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A6Q6 {
    
    public static int lastdigit(int num){
        // find the last digit 
        int lastD = num % 10;
        
        // multiply the remainder by negative 1 to make the number positive
        if(lastD < 0){
            lastD = lastD * (-1);
            System.out.println(lastD);
        }
        return lastD;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in);
        
        // get the user to enter the number 
        System.out.println("Please enter in the number: ");
        int num = input.nextInt();
        int lastD = lastdigit(num); 
        System.out.println("The last digit is " + lastD);
         
        
    } 
}
