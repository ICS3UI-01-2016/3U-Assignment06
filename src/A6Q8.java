
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manok5757
 */
public class A6Q8 {

    public static void season(int month, int day) {
        // systmatically check each month to see what season it falls under

        // if the month is January (1)
        if (month == 1) {
            // output the season is Winter
            System.out.println("The season is: Winter");
        }
        // if the month is February (2)
        if (month == 2) {
            // output the season is Winter
            System.out.println("The season is: Winter");
        }
        // if the month is March (3) and the date is less than or equal to 16
        if (month == 3 && day <= 16) {
            // output the season is Winter
            System.out.println("The season is: Winter");

        } else {
            // if the month is still March (3) and the date is greater more than 15
            if (month == 3 && day > 15) {
                // output the season is Spring
                System.out.println("The season is: Spring");
            }
        }
        // if the month is April (4)
        if (month == 4) {
            // output the season is Spring
            System.out.println("The season is: Spring");
        }
        // if the month is May (5)
        if (month == 5) {
            // output the season is Spring
            System.out.println("The season is: Spring");
        }
        // if the month is June (6) and the date is less than or equal to 16
        if (month == 6 && day <= 16) {
            // output the season is Spring
            System.out.println("The season is: Spring");
        } else {
            // if the month is still June (6) and the date is greater more than 15
            if (month == 6 && day > 15) {
                // output the season is Summer
                System.out.println("The season is: Summer");
            }
        }
        // if the month is July (7)
        if (month == 7) {
            // output the season is Summer
            System.out.println("The season is: Summer");
        }
        // if the month is August (8)
        if (month == 8) {
            // output the season is Summer
            System.out.println("The season is: Summer");
        }
        // if the month is September (9) and the date is less than or equal to 16
        if (month == 9 && day <= 16) {
            // output the season is Summer
            System.out.println("The season is: Summer");
        } else {
            // if the month is still September (9) and the date is greater more than 15
            if (month == 9 && day > 15) {
                // output the season is Fall
                System.out.println("The season is: Fall");
            }
        }
        // if the month is October (10)
        if (month == 10) {
            // output the season is Fall
            System.out.println("The season is: Fall");
        }
        // if the month is November (11)
        if (month == 11) {
            // output the season is Fall
            System.out.println("The season is: Fall");
        }
        // if the month is December (12) and the date is less than or equal to 16
        if (month == 12 && day <= 16) {
            // output the season is Fall
            System.out.println("The season is: Fall");
        } else {
            // if the month is still December (12) and the date is greater more than 15
            if (month == 12 && day > 15) {
                // output the season is Winter
                System.out.println("The season is: Winter");
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        // ask the user for the month
        System.out.println("Please enter the month: ");
        // store the month
        int month = input.nextInt();
        // ask the user for the day
        System.out.println("Plesee enter the day: ");
        // store the day
        int day = input.nextInt();
        // run the method
        season(month, day);
    }
}
