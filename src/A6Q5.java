
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
        //use an if loop to find if the answer from the equation equals to 5 
        if (randNum == 5){
            // the computer will print out five asterisks
            System.out.println("*****");
        }
        // if the random number equals to 4
        if (randNum == 4){
            // the computer will print out four asterisks
            System.out.println("****");
        }
        // if the random number is equal to 3
        if (randNum == 3){
            // the computer will print out three asterisks
            System.out.println("***");
        }
        // if the random number is equal to 2
        if (randNum == 2){
            // the computer will print out two asterisks
            System.out.println("**");
        }
        // if the random number is equal to 1
        if (randNum == 1)
            // the computer will print out one asterisks
            System.out.println("*");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner (System.in);
        // ask the the amount of asterisks they what to type in
        System.out.println("Please Enter the amount of asterisks you want to have");
        int numbers = input.nextInt();
        // applying the method above using this equation
        chaotic (numbers);
    }
    
    
              
        
    }

