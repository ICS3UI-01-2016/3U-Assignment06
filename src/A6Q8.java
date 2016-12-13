
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static int season(int month, int day, int sea) {
        //set variables for month, day, season and then return the time of season
        int m = month;
        int d = day;
        int s = sea;
        return sea;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month of date: ");
        int m = input.nextInt();
        System.out.println("Enter day of date: ");
        int d = input.nextInt();
        while (true) {
            //check if winter
            if (m == 12 && d == 16 - 31 || (m >= 1 && m <= 3 && d == 15)) {
                System.out.println("The Season is winter");
            }
            //check if spring
            if (m == 3 && d == 16 || (m >= 6 && d >= 15)) {
                System.out.println("The Season is spring");
            }
            //check if summer
            if (m == 6 && d == 16 || (m >= 9 && d >= 15)) {
                System.out.println("The Season is summer");
            }
            //check if fall
            if (m == 9 && d == 16 || (m >= 12 && d >= 15)) {
                System.out.println("The Season is fall");
            }
            break;
        }
    }
}
