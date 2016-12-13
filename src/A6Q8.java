
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author annt0773
 */
public class A6Q8 {
    //create a method that will tell you the season
    public static String season(int month, int day) {
        //if the date is between 12/16-3/15 it is winter
        if (month == 12 && day >= 16 && day <= 31 || month == 1 && day > 1 && day < 31 || month == 2 && day > 1 && day < 31 || month == 3 && day >= 1 && day <= 15) {
            //print out that it is winter
            return"Winter";
        }
        //if the date is between 3/16-6/15 it is spring
        if (month == 3 && day >= 16 && day <= 31 || month == 4 && day > 1 && day < 31 || month == 5 && day > 1 && day < 31 || month == 6 && day >= 1 && day <= 15) {
            //print out that it is spring
            return"Spring";
        }
        //if the date is between 6/16-9/15 it is summer
        if (month == 6 && day >= 16 && day <= 31 || month == 7 && day > 1 && day < 31 || month == 9 && day > 1 && day < 31 || month == 9 && day >= 1 && day <= 15) {
            //print out that it is summer
            return"Summer";
        }else{ 
            //print out that it is fall
            return"Fall";
        }
        
        //if the date is between 9/16-12/15 it is winter
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //ask for the month
        System.out.println("Please enter the month");
        //get the month
        int month = input.nextInt();
        //ask for the date
        System.out.println("Please enter the date");
        //get the date
        int day = input.nextInt();
        //use season method to get the season
        System.out.println(season(month,day));
        // TODO code application logic here
    }
}
