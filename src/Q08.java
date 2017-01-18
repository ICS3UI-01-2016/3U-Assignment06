
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author awadb3223
 */
public class Q08 {

    //create a method to detect the season based on the date]
    public static void season(int month, int day) {
        //create if statements to determine the season, then print to user
        //**WINTER**
        //December
        if (month == 12) {
            if (day >= 16 && day <= 31) {
                System.out.println("The season is Winter");
            }
        }
        //January
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Winter");
            }
        }
        //February
        if (month == 2) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Winter");
            }
        }
        //March
        if (month == 3) {
            if (day >= 1 && day <= 15) {
                System.out.println("The season is Winter");
            }
        }

        //**SPRING**
        //March
        if (month == 3) {
            if (day >= 16 && day <= 31) {
                System.out.println("The season is Spring");
            }
        }
        //April
        if (month == 4) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Spring");
            }
        }
        //May
        if (month == 5) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Spring");
            }
        }
        //June
        if (month == 6) {
            if (day >= 1 && day <= 15) {
                System.out.println("The season is Spring");
            }
        }

        //**SUMMER**
        //June
        if (month == 6) {
            if (day >= 16 && day <= 31) {
                System.out.println("The season is Summer");
            }
        }
        //July
        if (month == 7) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Summer");
            }
        }
        //August
        if (month == 8) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Summer");
            }
        }
        //September
        if (month == 9) {
            if (day >= 1 && day <= 15) {
                System.out.println("The season is Summer");
            }
        }

        //**FALL**
        //September
        if (month == 9) {
            if (day >= 16 && day <= 31) {
                System.out.println("The season is Fall");
            }
        }
        //October
        if (month == 10) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Fall");
            }
        }
        //November
        if (month == 11) {
            if (day >= 1 && day <= 31) {
                System.out.println("The season is Fall");
            }
        }
        //December
        if (month == 12) {
            if (day >= 1 && day <= 15) {
                System.out.println("The season is Fall");
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Method
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Loop
        while (true) {
            //ask user for Month in number
            System.out.println("Please enter the Month in integer form. Ex. January is 1, March is 3");
            //store value
            int month = input.nextInt();
            //ask user for Day in number
            System.out.println("Please enter the day in integer");
            //store value
            int day = input.nextInt();
            //run method
            season(month, day);
        }
    }
}