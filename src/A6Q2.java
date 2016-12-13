
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q2 {
//create method that will give you a exam grade
    public static void examGrade(double grade) {
        //get the number
        double answer = grade;
        //if the mark is less than 50 it's F
        if (answer < 50) {
            //print out the answer
            System.out.println("F");
        }
        //if the mark is greater than 50 and less than 59 it's D
        if (50 < answer && answer < 59) {
            //print out the answer
            System.out.println("D");
        }
        //if the mark is greater than 60 and less than 69 it's C
        if (60 < answer && answer < 69) {
            //print out the answer
            System.out.println("C");
        }
        //if the mark is greater than 70 and less than 79 it's B
        if (70 < answer && answer < 79) {
            //print out the answer
            System.out.println("B");
        }
        //if the mark is greater than 80 it's A
        if (answer > 80) {
            //print out the answer
            System.out.println("A");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new scanner
        Scanner input = new Scanner(System.in);
        //ask for the marks
        System.out.println("Please enter your grade");
        //get the number
        double grade=input.nextDouble();
        //put the number to the method
        examGrade(grade);
        
        // TODO code application logic here
    }
}
