
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question5 {
    
    public static void Chaotic(int num){
        while (num != 0){
            //get a random number
            int randomNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
            //create a string representing the nubmer of asterisks
            String asterisks = "";
            //create a loop that ends when it is out of random numbers
            while (randomNum > 0){
                //add an asterick to the string
                asterisks = asterisks + "*";
                //this will ensure this process will stop when randomNum runs out
                randomNum = randomNum - 1;
            }
            //print the answer
            System.out.println("" + asterisks);
            //ensure this process will stop when user's desired num of lines runs out
            num = num - 1;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user how many lines asterisks they want
        System.out.println("How many lines of asterisk do you want?");
        //get input from user
        int num = input.nextInt();
        //use the method
        Chaotic(num);
    }
}
