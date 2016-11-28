
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author slatz8075
 */
public class Question2 {
    
    public static String examGrade(double score){
        String grade = "";
        if (score < 50){            
            grade = "F";
        }else if (score > 50 && score < 60 || score == 100) {
            grade = "D";
        }else if (score > 60 && score < 70 || score == 100) {
            grade = "C";
        }else if (score > 70 && score < 80 || score == 100) {
            grade = "B";
        }else if (score > 80 && score < 100 || score == 100) {
            grade = "A";
        }
        return grade;       
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask them to input the score of their exam
        System.out.println("Please enter the score of the exam");
        //store score
        double score = input.nextDouble();
        //use method
        String grade = examGrade(score);
        //tell the user the grade
        System.out.println("The exam score was " + grade);
    }
}
