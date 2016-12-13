
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
            if (firsterm.charAt(i) == '-') {
                if (secondterm.charAt(i) == '-') {
                    return true;
                } else {
                   return false;
                }
        }
        }
    }
//           
            

            /**
             * @param args the command line arguments
             */
    

    public static void main(String[] args) {
        //create an input for the user
        Scanner input = new Scanner(System.in);
        
        // ask the user to the enter the first term 
        System.out.println("Enter the first term:");
        String firsterm = input.nextLine();
        
        // ask the user to enter the secondterm they want to have
        System.out.println("Enter the second term:");
        String secondterm = input.nextLine();
        
        // the computer will print our the answer usign the methiod 
        System.out.println(sameDashes(firsterm, secondterm));






    }
}
