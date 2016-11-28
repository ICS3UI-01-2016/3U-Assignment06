
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question8 {

    public static void season(int month, int day) {
        //determine which month it is
        if ((month == 12 && day > 15) || (month == 1) || (month == 2) || (month == 3 && day < 16)) {
            //tell the user which season it is
            System.out.println("The season is winter");
        } else if ((month == 3 && day > 15) || (month == 4) || (month == 5) || (month == 6 && day < 16)) {
            //tell the user which season it is
            System.out.println("The season is spring");
        } else if ((month == 6 && day > 15) || (month == 7) || (month == 8) || (month == 9 && day < 16)) {
            //tell the user which season it is
            System.out.println("The season is summer");
        } else if ((month == 9 && day > 15) || (month == 10) || (month == 11) || (month == 12 && day < 16)) {
            //tell the user which season it is
            System.out.println("The season is fall");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask the user for the year and day
        System.out.println("Please enter the month (1 - 12) and day (1 - 31) (respectively)");
        //get inputs from user
        int month = input.nextInt();
        int day = input.nextInt();
        //use method
        season(month, day);
    }
}
