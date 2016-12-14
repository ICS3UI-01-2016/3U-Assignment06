
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wangk9757
 */
public class Question10 {

     public static boolean sameDashes(String first, String second) {
        //the length of first word
        int length = first.length();
        //find the length of second word
        int length2 = second.length();
        //create a counted loop
        int count = 0;
        //create where the charat will scan 
        int i = 0;
        //loop that while the length of the first word is more than count, 
        while (length > count && length2 > count) {
            //set the string for loop
            if (first.charAt(i) == '-' && (second.charAt(i) == '-')) {
                //continue the loop if the dashes are in the same place
                i = i + 1;
                //check if one word has a dash but the other doesnt 
            }else if (first.charAt(i) != '-' && (second.charAt(i) == '-')) {
                //if that is the case, return false
                return false;
                //check if one word has a dash but not the other
            }else if (first.charAt(i) == '-' && (second.charAt(i) != '-' || (second.charAt(i) == ' '))) {
                //if so, return false
                return false;
                //if they both dont have dashes, continue loop
            }else if (first.charAt(i) != '-' && (second.charAt(i) != '-')) {
                i = i + 1;
            }
            //continue main loop until the whole word is planned
            count = count + 1;
        }
        //return true if they match
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask user for the first word
        System.out.println("Enter word");
        //save variable into variable f 
        String f = input.nextLine();
        //ask user for second word
        System.out.println("Enter word ");
        //save variable into variable j 
        String j = input.nextLine();
        // input variables into method 
        boolean sameDashes = sameDashes(f, j);
        //tell user the answer
        System.out.println(sameDashes);
        //end
    }
}
