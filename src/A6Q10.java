
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
        int lengthone = firsterm.length();
        int lengthtwo = secondterm.length();
        int count = 0;
        char ch;
        for (int i = 0; i < lengthone; i++) {
            if (firsterm.indexOf("-", 1) != secondterm.indexOf("-", 1)) {
                return false;
            }
        }
        return true;


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first term:");
        String firsterm = input.nextLine();
        System.out.println("Enter the second term:");
        String secondterm = input.nextLine();
        System.out.println(sameDashes(firsterm, secondterm));






    }
}
