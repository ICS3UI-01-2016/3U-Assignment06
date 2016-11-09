/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call method
        examGrade(75);
    }
    //Make method

    public static void examGrade(double grade) {
        //Check what the grade is and output a letter accordingly
        if (grade < 50) {
            System.out.println("F");
        } else if (grade >= 50
                && grade <= 59) {
            System.out.println("D");
        } else if (grade >= 60
                && grade <= 69) {
            System.out.println("C");
        } else if (grade >= 70
                && grade <= 79) {
            System.out.println("B");
        } else if (grade >= 80
                && grade <= 100) {
            System.out.println("A");
            //in case someone tries to break the system
        } else if (grade > 100) {
            System.out.println("Cheater");
        }
    }
}
