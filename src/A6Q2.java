
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q2 {
    
    public static void examGrade(int grade){
        if(grade < 50){
            System.out.println("F");
        }
        if(grade <= 59 && grade >= 50){
            System.out.println("D");
        }
        if(grade <= 69 && grade >= 60){
            System.out.println("C");
        }
        if(grade <= 79 && grade >= 70){
            System.out.println("B");
        }
        if(grade >= 80){
            System.out.println("A");
        }
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = input.nextInt();
        examGrade(grade);
    }
}
