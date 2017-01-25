
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khans4349
 */
public class A6Q2 {

    public static String examGrade(int mark) {
        // if the mark is 50 or lower
        if (mark < 50) {
            // return grade of F
            String grade = "F";
            // Print it out
            System.out.println("Your grade is " + grade);
            return grade;
            // if the mark is between 50 and 59
        } else if (mark >= 50 && mark <= 59) {
            // return grade of D
            String grade = "D";
            // Print it out
            System.out.println("Your grade is " + grade);
            return grade;
            // if the mark is between 60 and 69
        } else if (mark >= 60 && mark <= 69) {
            // return grade of C
            String grade = "C";
            // Print it out
            System.out.println("Your grade is " + grade);
            return grade;
            // if the mark is between 70 and 79
        } else if (mark >= 70 && mark <= 79) {
            // return grade of B
            String grade = "B";
            // Print it out
            System.out.println("Your grade is " + grade);
            return grade;
            // if the mark is 80 or higher
        } else {
            // return grade of A
            String grade = "A";
            // Print it out
            System.out.println("Your grade is " + grade);
            return grade;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create system input
        Scanner input = new Scanner(System.in);

        // Ask the user for their grade
        System.out.println("What is the mark you recieved on your exam?");
        int mark = input.nextInt();

        // method command
        String grade = examGrade(mark);

    }
}
