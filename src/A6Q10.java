
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A6Q10 Dashes checker
 *
 * @author micla1676
 */
public class A6Q10 {
    //create method called sameDashes
    public static void sameDashes(String x, String y) {
        //find the length of x and store it
        int lengthX = x.length();
        //find the length of x and store it    
        int lengthY = y.length();

        //create a integer to store the position of -
        int position = -1;

        //if length of x is greater then length of y
        if (lengthX > lengthY) {
            //create new string called temp and set it equal to y
            String temp = y;
            //set y equal to x
            y = x;
            //set x equal to temp
            x = temp;
        }
        //reset the length of x and store it
        lengthX = x.length();
        //reset the length of x and store it    
        lengthY = y.length();

        //set beginningY equal to all the character from index 0 - lengthx
        String beginningY = y.substring(0, lengthX);

        //create a string to store the second part of lengthy
        String endY = "";

        //if lengthx  is less then lengthy
        if (lengthX < lengthY) {
        
            //seperate lengthy
            //set endY equal to all the characters from lengthx to lengthy
            endY = y.substring(lengthX - 1, lengthY);
            //search for - in endY
            position = endY.indexOf("-");
            //if - exists within the second half of lengthy
            if (position >= 0) {
                //print false
                System.out.println("False");
                //end method
                return;
            }
        }
        //if the length of x is equal to y, and position is less then 0
        if (lengthX <= lengthY || position < 0) {
            //for loop that loops until the end of length of x
            for (int z = 0; z < lengthX; z = z + 1) {
                //check for the character at index z 
                //if both strings have dashes at the same index number, go back 
                //to the beginning of the loop
                if (x.charAt(z) == '-' && beginningY.charAt(z) == '-') {
                } 
                //if a dash is found in x but not in y, return false
                else if (x.charAt(z) == '-' && beginningY.charAt(z) != '-') {
                    //print false
                    System.out.println("False");
                    //end method
                    return;
                } 
                //if a dash is found in y but not in x, return false
                else if (x.charAt(z) != '-' && beginningY.charAt(z) == '-') {
                    //print false
                    System.out.println("False");
                    //exit method
                    return;
                } 
                //if no dashes are found, repeat loop
                else if (x.charAt(z) != '-' && beginningY.charAt(z) != '-') {
                }
            }
            //if all dashes are in the same place, print true
            System.out.println("True");
            //exit method
            return;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);

        //create an infinite loop
        while (true) {

            //ask for first string
            System.out.println("Please enter the string you want checked:");

            //store first string
            String x = input.nextLine();

            //ask for second string
            System.out.println("Please enter the next string you want checked:");

            //store second string
            String y = input.nextLine();

            //run method sameDashes
            sameDashes(x, y);

        }
    }
}