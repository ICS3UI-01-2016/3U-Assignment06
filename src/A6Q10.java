
import java.io.IOException;
import java.util.Scanner;

public class A6Q10 {

    public static void main(String[] args) throws IOException {
        sameDash();
    }

    public static void sameDash() {

        // create variables for the program
        String s1;
        String s2;
        char dash = '-';
        float count = 0;
        float s1dash = 0;
        float s2dash = 0;
        float totaldash = 0;
        int minimumlength = 0;

        // import the scanner
        Scanner in = new Scanner(System.in);

        // tell the user to imput the first word
        System.out.print("Enter the first word ");
        // store the word in this variable
        s1 = in.nextLine();

        // tell the user to imput the second word 
        System.out.print("Enter the second word");
        // store the second word in this variable
        s2 = in.nextLine();

        // if the first word is less than the second word get the minimum distance to equal the first word
        if (s1.length() < s2.length()) {
            minimumlength = s1.length();
        } else {
            // if the second word is less than the first word get the minimum distance to equal the second word
            minimumlength = s2.length();
        }

        // create a for loop that will get all of the dashes to see if they are equal to the variable
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == dash) {
                s1dash++;
            }
        }

        // create a for loop that will get all of the dashes to see if they are equal to the variable
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == dash) {
                s2dash++;
            }
        }

        // add both of the words
        totaldash = s1dash + s2dash;

        // if the dashes total divides evenly and have dashes in them = true if not = false
        if (totaldash % 2 == 0 && s1.contains("-") && s2.contains("-")) {
            // create a for loop that will count the dashes so that it equals the same
            for (int i = 0; i < minimumlength; i++) {
                if (s1.charAt(i) == dash && s2.charAt(i) == dash) {
                    count++;
                }
            }
            // if the count is more than one equal true
            if (count >= 1) {
                System.out.println("true");
            } else {
                // if not false
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
