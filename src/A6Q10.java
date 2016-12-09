
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gavra1870
 */
public class A6Q10 {
// Get the user to input the two statements in the method called sameDash
    public static boolean sameDash(String statement1, String statement2) {
       // Program to find the length of both statement1 and statement2
        int length1 = statement1.length();
        int length2 = statement2.length();
       // add length3 to store the bigger length. Default the string to "length1" in case the two statement are the same. 
        int length3 = length1;


       // Create a string called comparestate1
        String comparestate1 = "";
       // if length1 is bigger than length2 than cut of string1 at the end of length2  
        if (length1 > length2) {
            comparestate1 = statement1.substring(length2);    
            length3 = length2;
        }
        // if length2 is bigger than length1 than cut of string2 at the end of length1 
        if (length2 > length1) {
            comparestate1 = statement2.substring(length1);
            length3 = length1;
        }
       // create a for loop count using the stored infromation in length3
        for (int count = 0; count < length3; count = count + 1) {
       // if statement1 has a dash and statement two does not have a dash or statement2  has a dash and statement1 deos not have a dash than return false      
            if ((statement1.charAt(count) == '-') && (statement2.charAt(count) != '-') || (statement2.charAt(count) == '-') && (statement1.charAt(count) != '-')) {
                return false;

            }

        }
        
        // if the bigger statement has a dash and is equal or greater than 0 return false
        if(comparestate1.indexOf("-") >= 0){
        return false;                                                                                               
        }
       // if none of the options apply inorder to return false, default to true.
        return true;

    }

    public static void main(String[] args) {
        // Create a scanner  
        Scanner input = new Scanner(System.in);
        // Ask the user for the number   
        System.out.println("Please enter a the first statement");
        String statement1 = input.nextLine();
        // Ask the user for the number   
        System.out.println("Please enter a the second statement");
        String statement2 = input.nextLine();
        // Apply the boolean and the method and print the asnwers out   
        boolean sameDash = sameDash(statement1, statement2);
        System.out.println(sameDash);
    }
}
