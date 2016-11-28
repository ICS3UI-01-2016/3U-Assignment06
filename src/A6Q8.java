
import java.util.Scanner;

/**
 * A6Q8 return to the user what season a month is in
 *
 * @author micla1676
 */
public class A6Q8 {
    //create method called seasons
    public static void seasons(int month, int day) {
        
        //return winter when the month is december, and the day is greater then 16
        //or return winter when the month is before march, and the day is less then 15
        if (month == 12 && day >= 16 || month <= 3 && day <= 15) {
            System.out.println("The season is winter");
        }
        //return spring when the month is march, and the day is greater then 16
        //or return spring when the month is before june, and the day is less then 15
        if (month == 3 && day >= 16  || (month == 4 || month == 5) || (month == 6 && day <= 15)) {
            System.out.println("The season is spring");
        }
        //return summer when the month is june, and the day is greater then 16
        //or return summer when the month is before september, and the day is less then 15
        if (month == 6 && day >= 16  || (month == 7 || month == 8) || (month == 9 && day <= 15)) {
            System.out.println("The season is summer");
        }
        //return summer when the month is september, and the day is greater then 16
        //or return summer when the month is before december, and the day is less then 15
        if (month == 9 && day >= 16  || (month == 10 || month == 11) || (month == 12 && day <= 15)) {
            System.out.println("The season is autumn");
        }

        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //create a repeating loop
        while (true) {
            //ask user for a month
            System.out.println("Please enter a month in number format:");
            //store interger into a variable
            int month = input.nextInt();

            //ask user for day
            System.out.println("Please enter a day in number format:");
            //store interger into a variable
            int day = input.nextInt();

            //run method seasons
            seasons(month, day);

        }
    }
}
