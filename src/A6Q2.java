
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q2 {

    // create a method to store what grade corresponds to each mark 
    public static void examGrade(int mark) {
        // if the mark is less than a 50, then the user got a F
        if (mark < 50) {
            // output that the user got an F
            System.out.println("F");
        }
        // if the mark is 50-59 then the user got a D
        if (mark >= 50 && mark <= 59) {
            // output that the user got a D
            System.out.println("D");
        }
        // if the mark is 60-69 then the user got a C
        if (mark >= 60 && mark <= 69) {
            // output that the user got a C
            System.out.println("C");
        }
        // if the mark is 70-79 then the user got a B
        if (mark >= 70 && mark <= 79) {
            // output that the user got a B
            System.out.println("B");
        }
        // if the mark is an 80 ar above the user got an A
        if (mark >= 80) {
            // output that the user got an A
            System.out.println("A");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to store input from the user
        Scanner input = new Scanner(System.in);
        // ask user for their grade on their exam
        System.out.println("What grade did you get on your exam?");
        // store the mark they got
        int mark = input.nextInt();
        // run the method
        examGrade(mark);


    }
}
