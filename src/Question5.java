
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    // new method that prints radom paterns of asterisks 
    public static void chaotic(int repeat) {
        int count=1;
        while (count <=repeat){
            // this is the random number generator
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        if (randNum == 5) {
            System.out.println( "* * * * *");
        } else if (randNum == 4) {
            System.out.println( "* * * * ");
        } else if (randNum == 3) {
            System.out.println( "* * *");
        } else if (randNum == 2) {
            System.out.println( "* *" );
        } else if (randNum == 1) {
            System.out.println( "*" );
        } 
        count= count+1;
    }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many times you want to repeat the code");
      int repeat = input.nextInt();
      chaotic(repeat);
    }
}
