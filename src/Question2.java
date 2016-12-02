
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class Question2 {

    public static String examGrade(double percent) {
        double mark = percent;
        //IF, assigning a grade
        if (mark >= 80) {
            String grade = "A";
            return grade;
        }
        if (mark <= 79 && mark >= 70) {
            String grade = "B";
            return grade;
        }
        if (mark <= 69 && mark >= 60) {
            String grade = "C";
            return grade;
        }
        if (mark <= 59 && mark >= 50) {
            String grade = "D";

            return grade;
        }
        if (mark < 50) {
            String grade = "F";
            return grade;
        }
        String A = new String ("george");
   return A;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the % mark you got on the exam");
        double percent = input.nextDouble();
        String grade = examGrade(percent);
        System.out.println("Your mark is "+ grade);
    }

}
