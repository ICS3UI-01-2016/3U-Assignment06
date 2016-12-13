
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q5 {
    //create a method that will give you random *
    public static void chaotic(int num1) {
        //count the line of the number
        for (int i = 0; i < num1; i = i + 1) {
            //get random number of *
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //if the random number is 5 print *****
            if (randNum == 5) {
                System.out.println("*****");
            }
            //if the random number equals 4 print out ****
            if (randNum == 4) {
                System.out.println("****");
            }
            //if the rand number is 3 print out ***
            if (randNum == 3) {
                System.out.println("***");
            }
            //if the rand number is 2 print out **
            if (randNum == 2) {
                System.out.println("**");
            }
            //if the rand number is 1 print out *
            if (randNum == 1) {
                System.out.println("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask for the number
        System.out.println("Please enter your maximum number");
        //get the number
        int numb1 = input.nextInt();
        //using chaotic method to get the answer
        chaotic(numb1);
        // TODO code application logic here
    }
}
