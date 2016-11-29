
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q5 {
    
    public static void chaotic (int numbers){
        // use the for loop to find
        for (int n = 0 ; n < numbers ; n++){
         // to return a value from 0 up to, but not including 1 use the equation below
        int randNum = (int)(Math.random()*(5 - 1 + 1)) + 1;
        //use an if loop to find if 
        if (randNum == 5){
            System.out.println("*****");
        }
        if (randNum == 4){
            System.out.println("****");
        }
        if (randNum == 3){
            System.out.println("***");
        }
        if (randNum == 2){
            System.out.println("**");
        }
        if (randNum == 1)
            System.out.println("*");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter the amount of asterisks you want to have");
        
        int numbers = input.nextInt();
        
        chaotic (numbers);
    }
    
    
              
        
    }

