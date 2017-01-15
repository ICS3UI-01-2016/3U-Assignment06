
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q5 {

    /**
     * @param args the command line arguments
     */
    
    public static void chaotic(int numLines){
        //initialize variable for stars
        String stars ="";
        int a = 1;//lower limit
        int n= 5;//upper limit
        //create a for loop that prints lines of stars
        for(int i=1; i<=numLines; i++){
            //clean out string of stars
            stars="";
            //get random number between 1 and 5 with formula
            int randNum = (int)(Math.random()*(n - a + 1))+ a;
            //loop amount of stars on each line
            for(int j=1; j<=randNum; j++){
                stars = stars+"*";
            }
            //print lines of stars to screen
            System.out.println(stars);
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        //create input for user
         Scanner input = new Scanner(System.in);
         //let user input number of lines to print
         int numLines = input.nextInt();
         //call method
         chaotic(numLines);
         
         
         
         
    }
}
