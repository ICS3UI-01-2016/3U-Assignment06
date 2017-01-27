
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ayyaf3300
 */
public class A6Q8 {
    // create a method that will give the user the season after the date has been inputed by the user

    public static void season(int month, int day) {
        // create an if statment for if the month is equal to 1 or 2 which then the season would be winter
        if (month == 1 || month == 2) {
            System.out.println("It is Winter");
        }
        // create an if statment for if the month is equal to 3 and the day is less than 16 which then the season would be winter
        if (month == 3 && day < 16) {
            System.out.println("It is Winter");
        }
        // create an if statment for if the month is equal to 4 and the day is more than 15 which then the season would be spring
        if (month == 4 && day > 15) {
            System.out.println("It is Spring");
        }
        // create an if statment for if the month is equal to 4 or 5 which then the season would be spring
        if (month == 4 || month == 5) {
            System.out.println("It is Spring");
        }
        // create an if statment for if the month is equal to 6 and the day is less than 16 which then the season would be spring
        if (month == 6 && day < 16) {
            System.out.println("It is Spring");
        }
        // create an if statment for if the month is equal to 7 and the day is more than 15 which then the season would be summer
        if (month == 7 && day > 15) {
            System.out.println("It is Summer");
        }
        // create an if statment for if the month is equal to 8 which then the season would be summer
        if (month == 8) {
            System.out.println("It is Summer");
        }
        // create an if statment for if the month is equal to 9 and the day is less than 16 which then the season would be summer
        if (month == 9 && day < 16) {
            System.out.println("It is Summer");
        }
        // create an if statment for if the month is equal to 9 and the day is more than 15 which then the season would be fall
        if (month == 9 && day > 15) {
            System.out.println("It is Fall");
        }
        // create an if statment for if the month is equal to 10 which then the season would be fall
        if (month == 10) {
            System.out.println("It is Fall");
        }
        // create an if statment for if the month is equal to 12 and the day is less than 16 which then the season would be fall
        if (month == 12 && day < 16) {
            System.out.println("It is Fall");
        }
        // create an if statment for if the month is equal to 12 and the day is more than 15 which then the season would be winter
        if (month == 12 && day > 15) {
            System.out.println("It is Winter");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        Scanner input = new Scanner(System.in);
        // ask the user for the month and day
        {
            season(12, 16);
        }
    }
}
