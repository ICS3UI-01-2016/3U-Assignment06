/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A6Q8 {

    public static void seasons(int month, int day) {

        // if the month is december
        if (month == 12) {
            // if the day is greater than or equal to 16
            if (day >= 16) {
                // output season
                System.out.println("The season is winter");
            }
        }
        // if the month is january
        if (month == 1) {
            // output season
            System.out.println("The season is winter");
        }
        // if the month is February
        if (month == 2) {
            // output season
            System.out.println("The season is winter");
        }
        // if the month is March
        if (month == 3) {
            // if the day is greater than or equal to 1 and less than or equal to 15
            if (day >= 1 && day <= 15) {
                // output season
                System.out.println("The season is winter");
            }
        }
        // if the month is March
        if (month == 3) {
            // if the day is greater than or equal to 16
            if (day >= 16) {
                // output season
                System.out.println("The season is spring");
            }
        }
        // if the month is april
        if (month == 4) {
            // output season
            System.out.println("The season is spring");
        }
        // if the month is may
        if (month == 5) {
            // output season
            System.out.println("The season is spring");
        }
        // if the month is june
        if (month == 6) {
            // if the day is greater than or equal to 1 or less than equal to 15
            if (day >= 1 && day <= 15) {
                // output season
                System.out.println("The season is spring");
            }
        }
        // if the month is june
        if (month == 6) {
            // if the day is greater than or equal to 16
            if (day >= 16) {
                // output season
                System.out.println("The season is summer");
            }
            // if the month is july
            if (month == 7) {
                // output season
                System.out.println("The season is summer");
            }
        }
        // if the month is auguest
        if (month == 8) {
            // output season
            System.out.println("The season is summer");
        }
        // if the month is september
        if (month == 9) {
            // if the day is equal to or greater than 1 or less than or equal to 15
            if (day >= 1 && day <= 15) {
                // output season
                System.out.println("The season is summer");
            }
        }
        // if the month is september
        if (month == 9) {
            // if the day is equal to or greater than 16
            if (day >= 16) {
                // output season
                System.out.println("The season is fall");
            }
        }
        // if the month is october
        if (month == 10) {
            // output season
            System.out.println("The season is fall");
        }
        // if he month is november
        if (month == 11) {
            // output season
            System.out.println("The season is fall");
        }
        // if the month is december
        if (month == 12) {
            // if the day is equal to or greater than 1 or less than or equal to 15
            if (day >= 1 && day <= 15) {
                // output season
                System.out.println("The season is fall");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set the value of the month
        int month = 12;
        // set the value of the day
        int day = 16;
        // output method
        seasons(month, day);

    }
}
