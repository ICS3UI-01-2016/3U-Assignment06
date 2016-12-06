
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bulka4927
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static boolean sameDashes(String a, String b) {
        boolean abc = false;
        //first word check
        int i = 0;
        //test to see outcome of program
        String test = "";
        while (i < a.length()) {
            test = a.substring(i, i + 1);
            if (!test.equals("-")) {
                a = a.substring(0, i) + "0" + a.substring(i + 1, a.length());

            }
            i = i + 1;
        }
        //second word check
        i = 0;
         //test to see outcome of program
        test = "";
        while (i < b.length()) {
            test = b.substring(i, i + 1);
            if (!test.equals("-")) {
                b = b.substring(0, i) + "0" + b.substring(i + 1, b.length());

            }
            i = i + 1;
        }
        //if same number of dashes in same place, output true
        if (a.equals(b)) {
            abc = true;
            System.out.println("True");
        }
        return abc;



    }

    public static void main(String[] args) {
        //ask for words from user to compare 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String a = input.nextLine();
        System.out.println("Enter second word: ");
        String b = input.nextLine();
        boolean sameDashes = sameDashes(a, b);



    }
}
