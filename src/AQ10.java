
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class AQ10 {
    // create method
    public static boolean sameDashes(String wordOne, String wordTwo){
        // make while loop to find dashes 
        while(true){
            // make interger for the postion of dashes
            int dashOne = wordOne.indexOf("-");
            int dashTwo = wordTwo.indexOf("-");
            // keep loop going until there is no more dashes
            if(dashOne == -1 && dashTwo == -1){
                // return loop true if all dashes are in the same spot
                return true;
            }
            // remove words that come before the dashes
            if(dashOne == dashTwo){
                wordOne = wordOne.substring(dashOne + 1);
                wordTwo = wordTwo.substring(dashTwo + 1);
            } else {
                // return loop false if all dashes are not in the spot
                return false;
            }
        }

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner in = new Scanner(System.in);

        // ask user for word and store it
        System.out.println("Enter a word or number with a dash");
        String wordOne = in.nextLine();
        // ask user for word and store it 
        System.out.println("Enter another word or number with a dash");
        String wordTwo = in.nextLine();
        
        // run method
        System.out.println(sameDashes(wordOne,wordTwo));
    }
}
