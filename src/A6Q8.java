
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A6Q8 {
//Create a method that will determine that season based on the month and day
    // int mouth and int day is where the user is going to input their information. 

    public static String seasons(int month, int day) {
        //if the following opitons occur than return winter
        // if th month equals 12 and the days are between 16 and 31 
        // if th month equals 1 and the days are between 1 and 31 
        // if th month equals 2 and the days are between 1 and 31 
        // if th month equals 1 and the days are between 1 and 15 
        if (month == 12 && day >= 16 && day <= 31 || month == 1 && day > 1 && day < 31 || month == 2 && day > 1 && day < 31 || month == 3 && day > 1 && day < 15) {
            return "Winter";
        }
        //if the following opitons occur than return winter
        // if th month equals 3 and the days are between 16 and 31 
        // if th month equals 4 and the days are between 1 and 31 
        // if th month equals 5 and the days are between 1 and 31 
        // if th month equals 6 and the days are between 1 and 15 
        if (month == 3 && day >= 16 && day <= 31 || month == 4 && day > 1 && day < 31 || month == 5 && day > 1 && day < 31 || month == 6 && day > 1 && day < 15) {
            return "Spring";
        }
        //if the following opitons occur than return winter
        // if th month equals 6 and the days are between 16 and 31 
        // if th month equals 7 and the days are between 1 and 31 
        // if th month equals 8 and the days are between 1 and 31 
        // if th month equals 9 and the days are between 1 and 15     
        if (month == 6 && day >= 16 && day <= 31 || month == 7 && day > 1 && day < 31 || month == 8 && day > 1 && day < 31 || month == 9 && day > 1 && day < 15) {
            return "Summer";
        } // If none of the past options occurs the result will automaticlly return Fall as a default.    
        else {
            return "Fall";
        }

    }

    /**
     * @param args the command line arguments
     */
    // Test out method and make sure that works
    public static void main(String[] args) {
    //Create a scanner 
        Scanner input = new Scanner(System.in);
    // Ask th user if they can enter the number of  month    
        System.out.println("Please enter the number of  month");
        int month = input.nextInt();
    // Ask the user if they can input the number of day  
        System.out.println("please enter the number of the day");
        int day = input.nextInt();
    // After applying the method print out the answer  
        System.out.println(seasons(month, day));
    }
}
