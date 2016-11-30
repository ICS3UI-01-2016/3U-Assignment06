/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author messr2578
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static int ExamGrade(double grade) {
        Scanner input = new Scanner(System.in);
        if (grade <= 100 && grade >= 80) {
            int mark = 8;
            return mark;
        }
        if (grade <= 79 && grade >= 70) {
            int mark = 7;
            return mark;
        }
        if (grade <= 69 && grade >= 60) {
            int mark = 6;
            return mark;
        }
        if (grade <= 59 && grade >= 50) {
            int mark = 5;
            return mark;
        }
        if (grade < 50) {
            int mark = 4;
            return mark;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the percent mark");
        double grade = input.nextDouble();
        int mark = ExamGrade(grade);
        if (mark == 4) {
            System.out.println("you failed");
        }
        if (mark == 5) {
            System.out.println("you got a D");
        }
        if (mark == 6) {
            System.out.println("you got a C");
        }
        if (mark == 7) {
            System.out.println("you got a B");
        }
        if (mark == 8) {
            System.out.println("you got a A");
        }
    }
}
