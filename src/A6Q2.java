
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q2 {
    // create a variable to store the precentage

    public static void examGrade(double precentage) {
        // create an if statment if precentage is lower than 50
        if (precentage < 50) {
            // display to the user that the mark they got is an F
            System.out.println("Your mark is an F");
        }
        // create an if statment for if the precentage is higher than 50 but lower than 59 
        if (precentage >= 50 && precentage <= 59) {
            // display to the user that the mark they got is a D
            System.out.println("Your mark is an D");
        }
        // create an if statment for if the precentage is higher than 60 but lower than 69
        if (precentage >= 60 && precentage <= 69) {
            // display to the user that the mark they got is a C
            System.out.println("Your mark is an C");
        }
        // create an if statment for if the precentage is higher than 70 but lower than 79
        if (precentage >= 70 && precentage <= 79) {
            // display to the user that the mark they got is a B
            System.out.println("Your mark is an B");
        }
        // create an if statment for if the precentage is higher than 80
        if (precentage >= 80) {
            // display to the user that the mark they got is an A
            System.out.println("Your mark is an A");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        // create a scanner
        Scanner input = new Scanner(System.in);
        // tell the user to input their precentage
        System.out.println("What is your precentage?");
        // create a variable to store the precentage
        int precentage = input.nextInt();
        // put the precentage you want the program to run or put variable precentage
        examGrade(precentage);
    }
}
