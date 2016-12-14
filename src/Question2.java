
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class Question2 {

    public static void examGrade(int grade) {
        if (grade < 50) {
            System.out.println("F");
        }
        if (grade >= 50 && grade < 59) {
            System.out.println("D");
        }
        if (grade >= 60 && grade < 69) {
            System.out.println("C");
        }
        if (grade >= 70 && grade < 79) {
            System.out.println("B");
        }
        if (grade > 80){
            System.out.println("A");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your grade");
        int mark = input.nextInt();
        examGrade(mark);
        
    }
}
