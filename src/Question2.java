
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    // new method that determines what grade you have
    public static void examGrade(int grade) {
        if (grade < 50) {
            // sorting the grades out by marks
            System.out.println("Your Grade is a F");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println("Your Grade is a D");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your Grade is a C");
        } else if (grade >= 70 && grade <=79) {
            System.out.println("Your Grade is a B");
        } else if (grade >=80) {
            System.out.println("Your Grade is a A");
        }
    }
     public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
                System.out.println("please enter your precentage");
                int grade = input.nextInt();
               examGrade(grade);
               
    }
     
}
