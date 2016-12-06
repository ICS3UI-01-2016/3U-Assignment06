
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question10 {

    /**
     * @param args the command line arguments
     */
    //new method that determines if the word has dashesd in the same place
    public static boolean sameDashes(String first, String second) {
        int count = 0;
        //goes through the whole word to find the postion of dashes
        int length = first.length();
        while (count < length) {
            int dash = first.indexOf("-", count);
            int dash2 = second.indexOf("-", count);
            if (dash < dash2 || dash > dash2) {
                return false;
            }
            count = count + 1;
        }
        // when the second word is longer it checks if it is false
        if(second.length() > first.length()){
            int dash2 = second.indexOf("-", count);
            if(dash2  != -1){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word with dashes");
        String first = input.nextLine();
        System.out.println("Please enter the second word with dashes");
        String second = input.nextLine();
        boolean sameDashes = sameDashes(first, second);
        System.out.println(sameDashes);
    }
}
