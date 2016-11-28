
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question10 {

    public static void sameDashes(String first, String second) {
        //compare the lengths of each string
        int firstLength = first.length();
        int secondLength = second.length();
        //if they are different lengths, compare if the extra length of either contains a -
        //test to see if first is longer than second
        if (firstLength > secondLength) {
            //get the last part of the first string
            String firstLast = first.substring(secondLength);
            //determine if the last part of the first contains a dash
            if (firstLast.contains("-")) {
                //therfore the two strings are not equal
                System.out.println("False");
                //end method
                return;
            }
            //test to see if second is longer than first
        } else if (secondLength > firstLength) {
            //get the last part of the second string
            String secondLast = second.substring(firstLength);
            //determine if the last part of the second contains a dash
            if (secondLast.contains("-")) {
                //therfore the two strings are not equal
                System.out.println("False");
                //end method
                return;
            }
        }
        //determine if the dashes are in the same positions
        //this loop will go until it runs out of characters to check in the first string
        //do not have to do the same for the second string because... 
        //...we have determined that the extra characters do not contain dashes
        for (int i = 0; i < firstLength; i++) {
            //find the first dash in he first string
            int firstDash = first.indexOf("-");
            //find the first dash in the second string
            int secondDash = second.indexOf("-");
            //compare the positions of these dashes (not if it is non existent we'll deal with that later
            if ((secondDash == firstDash) && (firstDash != -1)) {
                //get rid of what we have already checked
                //subtract from the first string everything before its dash
                first = first.substring(firstDash);
                //subtract from the second string everything before its dash
                second = second.substring(secondDash);
            } else if (secondDash != firstDash) {
                //they are not the same
                //tell the user
                System.out.println("false");
                //end the method
                return;
            } else if ((secondDash == -1) && (firstDash == -1)) {
                //we have determined there are no dashes in either 
                //and thus it is true
                //tell the user
                System.out.println("True");
                //end the method
                return;
            }
            if (i == 0) {
                //thus we have determined all dash positions are the same or non existent
                //tell the user
                System.out.println("True");
                //end the method
                return;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for the strings
        System.out.println("Please enter 2 strings");
        //get inputs from user
        String first = input.nextLine();
        String second = input.nextLine();
        //use method
        sameDashes(first, second);
    }
}
