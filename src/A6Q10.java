
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static void sameDashes(String word, String word2) {
        int dash = word.indexOf("-");
        int dash2 = word2.indexOf("-");
               // check the entire word for the dashes to be in the same spots 
        while (dash == dash2) {
            dash = word.indexOf("-");
            dash2 = word2.indexOf("-");
            word = word.substring(dash + 1);
            word2 = word2.substring(dash2 + 1);
            // if the dashes are in the same spots print out true
            if (dash == -1 && dash2 == -1) {
                System.out.println("true");
                break;
            }
            // if the dashes are not in the same spots print out false
            if (dash != dash2) {
                System.out.println("false");
                break;
            }
        }

    }

    public static void main(String[] args) {
        // get the words that need to be comared
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String word2 = input.nextLine();
        // activate the method
        sameDashes(word, word2);
    }
}
