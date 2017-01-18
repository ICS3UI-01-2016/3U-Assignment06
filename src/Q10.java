
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q10 {

    //create method sameDashes return whether the dashes in both strings are in the same place
    public static boolean sameDashes(String string1, String string2) {

        //Go through the first string one character at a time until the variable is as long as the word
        for (int i = 0; i < string1.length() && i < string2.length(); i++) {

            //if the dashes match up in both strings, return true
            if (string1.charAt(i) == '-' && string2.charAt(i) == '-') {
                return true;

            }

            //if only one dash in first string, return false
            if (string1.charAt(i) == '-' && string2.charAt(i) != '-') {
                return false;
            }

            //if only one dash in second string, return false
            if (string1.charAt(i) != '-' && string2.charAt(i) == '-') {
                return false;
            }
            
        }
        
        //if no dashes match, return true else return false
        int i = 0;
        if (string1.charAt(i) != '-' && string2.charAt(i) != '-') {
            return true;
        } else {
            return false;
        }



    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1st string");
            String string1 = input.nextLine();

            System.out.println("Enter 2nd string");
            String string2 = input.nextLine();

            boolean answer = sameDashes(string1, string2);

            System.out.println(answer);
        }
    }
}
