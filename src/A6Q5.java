
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl
 */
public class A6Q5 {

    // create method
    public static void chaotic(int lines) {
        // make loop to generate random numbers
        for (int loop = 0; loop < lines; loop = loop++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // assign the number of stars to the number generated
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
        // create scanner
        Scanner in = new Scanner(System.in);

        // ask number of lines user would like 
        System.out.println("How Many Lines of asterisk would you like?");
        int lines = in.nextInt();

        // run method
        chaotic(lines);
    }
}
