
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
public class A6Q5 {
    
    public static double chaotic(int numlines){
        // create a for loop
        for(int i = 0; i<numlines; i=i+1){
            // generate a random number between 1 and 5
            int randnum = (int) (Math.random()*5-1+1)+1;
            // display the special symbol (don't know what it's called!)
            if(randnum == 1){
                System.out.println("*");
            }
            if(randnum == 2){
                System.out.println("**");
            }
            if(randnum == 3){
                System.out.println("***");
            }
            if(randnum == 4){
                System.out.println("****");
            }
            if(randnum == 5){
                System.out.println("*****");
            }  
        }
        return numlines;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in);
        
        // get the user to input how many line of symbols they want to print out
        System.out.println("How many lines do you want?");
        int numlines = input.nextInt();
        System.out.println("The lines are: ");
        chaotic(numlines);   
    }  
}
