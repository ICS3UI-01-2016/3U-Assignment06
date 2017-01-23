
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void Season(int month, int day) {
        // if the month is 3 and the day the 16 to the 31
        if (month == 3 && day > 16 && day < 31) {
        }
        // if the month is 4 and the day the 1 to the 31
        if (month == 4 && day > 1 && day < 31) {
            System.out.println("The season is Spring");
        }
        // if the month is 5 and the day the 1 to the 31
        if (month == 5 && day > 1 && day < 31) {
            System.out.println("The season is spring");
        }
        // if the month is 6 and the day the 1 to the 15
        if (month == 6 && day > 1 && day < 16) {
        }
        // if the month is 7 and the day the 1 to the 31
        if (month == 7 && day > 1 && day < 31) {
            System.out.println("The season is summer");
        }
        // if the month is 8 and the day the 16 to the 31
        if (month == 8 && day > 1 && day < 31) {
            System.out.println("The season is summer");
        }
        // if the month is 9 and the day the 1 to the 15
        if (month == 9 && day > 1 && day < 16) {
        } // if the month is 10 and the day the 1 to the 31
        if (month == 10 && day > 1 && day < 31) {
            System.out.println("The season is fall");
        }
        // if the month is 11 and the day the 1 to the 31
        if (month == 11 && day > 1 && day < 31) {
            System.out.println("The season is fall");
        }
        // if the month is 12 and the day the 1 to the 15
        if (month == 12 && day > 1 && day < 16) {
        }
        // if the month is 1 and the day the 1 to the 31
        if (month == 1 && day > 1 && day < 31) {
            System.out.println("The season is winter");
        }
        // if the month is 2 and the day the 1 to the 31
        if (month == 2 && day > 1 && day < 31) {
            System.out.println("The season is winter");
        }
        // if the month is 12 and the day the 16 or the month is 3 and the day is less than the 15
        if (month == 12 && day == 16 || month == 3 && day == 15) {
            System.out.println(" The season is Winter");
        }
        // if the month is 3 and the day the 16 or the month is 6 and the day is less than the 15
        if (month == 3 && day == 16 || month == 6 && day == 15) {
            System.out.println(" The season is Spring");
        }
        // if the month is 6 and the day the 16 or the month is 9 and the day is less than the 15
        if (month == 6 && day == 16 || month == 9 && day == 15) {
            System.out.println(" The season is Summer");
        }
        // if the month is 9 and the day the 16 or the month is 12 and the day is less than the 15
        if (month == 9 && day == 16 || month == 12 && day == 15) {
            System.out.println(" The season is Fall");
        }
    }

    public static void main(String[] args) {
        // create a new Scanner
        Scanner input = new Scanner(System.in);
        // ask user for the month
        System.out.println("Please enter the month");
        // store user input with a variable
        int month = input.nextInt();
        // ask user for the day
        System.out.println("Please enter the day");
        // store user input with a variable
        int day = input.nextInt();
        //show user the answer
        Season(month, day);




    }
}
