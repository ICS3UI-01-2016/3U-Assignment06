
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class Question10 {

    public static void sameDashes(String string1, String string2) {
        //Word length for reading
        int length1 = string1.length();
        int length2 = string2.length();
        int length3 = 0;
        //Checking variable
        int trueZero = 0;

        //Substring extra length
        if (length1 > length2) {
            String sub1 = string1.substring(length2);
            length3 = length2;
            if (sub1.contains("-")) {
                trueZero++;

            }
        }
        if (length2 > length1) {
            String sub2 = string2.substring(length1);
            length3 = length1;
            if (sub2.contains("-")) {
                trueZero++;

            }
        }
        //Search 
        for (int counter = 0; counter < length3; counter++) {
            if (string1.charAt(counter) == '-' && string2.charAt(counter) != '-' || string1.charAt(counter) != '-' && string2.charAt(counter) == '-') {
                trueZero++;
            }
        }
        //Checking 
        if (trueZero == 0) {
            System.out.println("True");
        }
        if (trueZero >= 1) {
            System.out.println("False");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string with or without dashes  (-) ");
        String string1 = input.nextLine();
        System.out.println("Enter the second string with or without dashes (-) ");
        String string2 = input.nextLine();
        sameDashes(string1, string2);
    }
}
