
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khant5061
 */
public class A6Q2 {

    public static double examMark(double mark) {
        
        //if mark less than 50
        if (mark < 50) {
            System.out.println("You failed.");

        }
        //if mark 50-59
        if (mark >= 50 && mark < 60) {
            System.out.println("Your grade is D ");

        }
        //if mark 60-69
        if (mark >= 60 && mark < 70) {
            System.out.println("Your grade is C ");
        }
        //if mark 70-79
        if (mark >= 70 && mark < 80) {
            System.out.println("Your grade is B ");
        }
        //if mark above 80 or above
        if (mark >= 80) {
            System.out.println("Your grade is A ");
        }
        return mark;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask for percentage
        System.out.println("Enter exam percentage: ");
        //output mark
        Double mark = input.nextDouble();
        examMark(mark);
        
        

    }
}
