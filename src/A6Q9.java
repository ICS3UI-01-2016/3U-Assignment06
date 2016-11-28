
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A6Q9 Odd number checker
 *
 * @author micla1676
 */
public class A6Q9 {
//create a method called allDigitsOdd
    public static void allDigitsOdd(String moon) {
        //create pattern of 24680
        Pattern checkRegex = Pattern.compile("[24680]");
        //check pattern
        Matcher regexMatcher = checkRegex.matcher(moon);
        //if match is found
        if (regexMatcher.find()) {
            //print false
            System.out.println("False");
        }
        //if no match is found, return true
        else if (!regexMatcher.find()) {
            //print true
            System.out.println("True");
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

            //ask for integer
            System.out.println("Please enter the integer you want checked:");

            //get integer
            String moon = input.nextLine();

            //run method
            allDigitsOdd(moon);
        }
    }
}
