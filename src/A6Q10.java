
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q10 {
    
    public static void sameDashes(String s1, String s2){
        
        //get the length of the string 1
        int length1 = s1.length();
        //get the length of the string 2
        int length2 = s2.length();
        
         //walk through the characters using a loop
        int count1 = 0;
        int s1Position = 0;
        for (int i = 0; i < length1; i++) {
            //look at the character
            //is the character an -
            if (s1.charAt(i) == '-') {
                //count it
                count1 = count1 + 1;
            }
            //find the first l position
        s1Position = s1.indexOf("-");

        //found an l in the word
        if (s1Position != -1) {
            String beginning = s1.substring(s1Position);
        }
        }
         //walk through the characters using a loop
        int count2 = 0;
        int s2Position = 0;
        for (int i = 0; i < length2; i++) {
            //look at the character
            //is the character an -
            if (s2.charAt(i) == '-') {
                //count it
                count2 = count2 + 1;
            }
            //find the first l position
        s2Position = s2.indexOf("-");

        //found an l in the word
        if (s2Position != -1) {
            String beginning = s2.substring(s2Position);
        }
        }
        
        if(count1 == count2 && s1Position == s2Position){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input string 1");
        String s1 = input.nextLine();
        System.out.println("Please input string 2");
        String s2 = input.nextLine();
        
        sameDashes(s1, s2);
        
        
    }
}
