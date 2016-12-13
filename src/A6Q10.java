
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q10 {
    //create a boolean method that will retun whether or not they have dashed in the same palces

    public static boolean sameDashes(String one, String two) {
        //get the length of first statement
        int length1 = one.length();
        //get the length of second statement
        int length2 = two.length();
        //set new length that is equal to length1 so it can start as length1
        int nlength = length1;

        //create string so I can put substring
        String same = "";
        //if length1 is larger than length2, it is equal to length2
        if (length1 > length2) {
            //get the length from 0 to length2
            same = one.substring(0, length2);
            //nlength equals length2
            nlength = length2;
        }
        //if length2 is larger than length1, it is equal to length1
        if (length2 > length1) {
            //get the length from 0 to length1
            same = two.substring(0, length1);
            //nlength equals length1
            nlength = length1;
        }
        //make a for-loop that will check the '-''s position. 
        for (int i = 0; i < nlength; i++) {
            //if one statement and two statement's '-' is not equal, return false
            if ((one.charAt(i) == '-') && (two.charAt(i) != '-') || (two.charAt(i) == '-') && (one.charAt(i) != '-')) {
                return false;
            } else {
                //if the length1 is bigger than length2 and find the dash, return false
                if (length1 > length2) {
                    //get the length from length2 to the rest of length1
                    String ending1 = one.substring(length2);
                    //find the dash and return flase
                    if (ending1.indexOf('-') != -1) {
                        return false;
                    }
                }
                //if the length2 is bigger than length2 and find the dash, return false
                if (length2 > length1) {
                    //get the length from length1 to the rest of the length2
                    String ending2 = two.substring(length1);
                    //find the dash and return it is false
                    if (ending2.indexOf('-') != -1) {
                        return false;
                    }
                }
            }
        }
        //if '-'is matching, return true
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask for the statement
        System.out.println("Please enter the first statement");
        //get the statement
        String s1 = input.nextLine();
        //ask for another statement
        System.out.println("Please enter second statement");
        //get the statement
        String s2 = input.nextLine();
        //put the number to use the method
        sameDashes(s1, s2);
        //print out the answer
        System.out.println(sameDashes(s1, s2));
        // TODO code application logic here
    }
}
