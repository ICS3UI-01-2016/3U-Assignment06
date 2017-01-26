
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
public class A6Q2 {
    
    public static double examGrade(double percentage){
        if(percentage <= 50 && percentage >= 0){ 
            System.out.println("Your grade is an F"); 
        }
        if(percentage >= 50 && percentage <= 59){
            System.out.println("Your grade is an D"); 
        }
        if(percentage >= 60 && percentage <= 69){ 
            System.out.println("Your grade is an C");
        }
        if(percentage >= 70 && percentage <= 79){
            System.out.println("Your grade is an B");
        }
        if(percentage >= 80 && percentage <= 100){ 
            System.out.println("Your grade is an A"); 
        }
        return percentage;  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in);
        
        // get the user to enter their percentage 
        System.out.println("Please enter your percentage.");
        double percentage = input.nextDouble();
        
        // give user the exam grade 
        examGrade(percentage);
        
    }   
}
