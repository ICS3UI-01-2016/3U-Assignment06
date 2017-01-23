
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void examGrade(int grade) {
        // if grade is less that 50%, print the grade as a F
        if (grade < 50) {
            System.out.println("Your Grade is a F");
        }
        // if grade is less that 59%, but more than 50%, print the grade as a D
        if (grade > 50 && grade <= 59) {
            System.out.println("Your Grade is a D");
        }
        // if grade is less that 69%, but more than 60%, print the grade as a C
        if (grade > 60 && grade <= 69) {
            System.out.println("Your Grade is a C");
        }
        // if grade is less that 79%, but more than 70%, print the grade as a B
        if (grade > 70 && grade <= 79) {
            System.out.println("Your Grade is a B");
        }
        // if grade is less that 100%, but more than 80%, print the grade as a A
        if (grade > 80 & grade <= 100) {
            System.out.println("Your Grade is a A");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your exam percent.");
        int grade = input.nextInt();
        examGrade(grade);

    }
}
