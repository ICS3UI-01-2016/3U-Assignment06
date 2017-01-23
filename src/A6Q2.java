
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

    public static double examGrade(double grade) {
        
        //if below 50
        if (grade < 50) {
            System.out.println("You failed.");

        }
        //if between 50-59
        if (grade >= 50 && grade < 60) {
            System.out.println("Your grade is D");

        }
        //if between 60-69
        if (grade >= 60 && grade < 70) {
            System.out.println("Your grade is C");
        }
        //if between 70-79
        if (grade >= 70 && grade < 80) {
            System.out.println("Your grade is B");
        }
        //if above 80 or above
        if (grade >= 80) {
            System.out.println("Your grade is A");
        }
        return grade;
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
        //output grade
        Double grade = input.nextDouble();
        examGrade(grade);
        

    }
}
