
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q5 {

    public static void chaos(int lines) {
        while (1 == 1){
        int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
        if (randNum == 1) {
            System.out.println("*");
        }
        if (randNum == 2) {
            System.out.println("**");
        }
        if (randNum == 3) {
            System.out.println("***");
        }
        if (randNum == 4) {
            System.out.println("****");
        }
        if (randNum == 5) {
            System.out.println("*****");
            
        }
        
        
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask how many lines
        System.out.println("How many lines?");
        int lines =input.nextInt();
        chaos(lines);
        
        
        
        
       
    }
}
