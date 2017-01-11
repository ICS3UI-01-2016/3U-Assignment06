
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabed2976
 */
public class A6Q10 {

    public static boolean sameDashes(String firsterm, String secondterm) {
        //create a variable to find the length of firsterm and the secondterm
        int lengthone = firsterm.length();
        int lengthtwo = secondterm.length();
        
        // create a variable lengththree to store in the bigger length.
        int lengththree = lengthone;

        //Create a string called compare term one
        String comparetermone = "";
        //if lengthone is bigger than lengthtwo then take out the substring in firstterm at the end of length two
        if (lengthone > lengthtwo) {
            comparetermone = firsterm.substring(lengthtwo);
            lengththree = lengthtwo;
        }
        
        // if lengthtwo is bigger than lengthone then take ou the substring in secondterm at the end of length one
        if (lengthtwo > lengthone) {
            comparetermone = secondterm.substring(lengthone);
            lengththree = lengthone;
         
        }
        // create a foor loop using the data on lengththree
        for (int count = 0; count < lengththree; count = count + 1) {
            // if firsterm has a dash and secondterm does not have dash or second term has a dash and the first term does not have dash
            if ((firsterm.charAt(count) == '-') && (secondterm.charAt(count) != '-' || secondterm.charAt(count) == '-') && (firsterm.charAt(count) != '-')) {
                // return flase when you are outputing
                return false;
                
            }
        }
        // if the longer statement has a dash and is equal than 0
        if (comparetermone.indexOf("-") >= 0) {
            // return false when outputing
            return false;
        }
        // if none of the if statements are not inorder in the return false above
        // make return true as default
        return true;

    }


/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        //create an input for the user
        Scanner input = new Scanner(System.in);
        
        // ask the user to the enter the first term 
        System.out.println("Enter the first term:");
        String firsterm = input.nextLine();
        
        // ask the user to enter the secondterm they want to have
        System.out.println("Enter the second term:");
        String secondterm = input.nextLine();
        
        // apply the boolean method above if it works perfectly
       boolean sameDashes = sameDashes (firsterm, secondterm);
       // print the answers
       System.out.println(sameDashes);






    }
}
