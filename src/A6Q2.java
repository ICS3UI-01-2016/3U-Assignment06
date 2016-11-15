
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A6Q2 {

    // create method
    public static void examGrade(double grade) {
       // if grade is less than 59 output F
       if(grade <50) {
           System.out.println("Your Exam grade is F");
       }
       // if grade is less than 59 output D
       if(grade >= 50 && grade <= 59){
           System.out.println("Your Exam grade is D");
       }
       // if grade is less than 69 output C
       if(grade >= 60 && grade <= 69){
           System.out.println("Your Exam grade is C");
       }
       // if grade is less than 79 output B
       if(grade >= 70 && grade <= 79){
           System.out.println("Your Exam grade is B");
       }
       // if graede is over 80 output A
       if (grade >= 80){
           System.out.println("Your Exam grade is A"); 
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // ask for the exam percentage
        System.out.println("What was your percentage on the exam?");
        double grade = input.nextInt();
        // run method
        examGrade(grade);
    }

}
