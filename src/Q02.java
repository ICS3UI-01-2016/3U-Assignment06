
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awadb3223
 */
public class Q02 {

    //Create the method called examGrade
    public static void examGrade (int grade){
        //Create all possibilities
        //If grade lower than 50, Sout F
        if (grade < 50){
            System.out.println("F");
        }
        //If grade between 50-59, Sout D
        if (grade == 50 && grade <= 59){
            System.out.println("D");
        }
        //If grade between 60-69, Sout C
        if (grade == 60 && grade <= 69){
            
        }
        //If grade between 70-79, Sout B
        if (grade == 70 && grade <= 79){
            
        }
        //If grade above 80, Sout A
        if (grade >= 80){
            System.out.println("A");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test method
        //Create scanner
        Scanner input = new Scanner (System.in);
        //ask for the grade
        System.out.println("Please enter your grade");
        //Store grade in variable
        int grade = input.nextInt();
        //use the examGrade method to convert to letter, and print to screen
        examGrade(grade);
    }
}
