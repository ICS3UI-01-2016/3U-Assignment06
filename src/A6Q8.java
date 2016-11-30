
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void season(int month, int day) {
        // if the dates fall between the days of spring say so
        if (month <= 6 && month >= 3) {
            if (month == 3 && day >= 16) {
                System.out.println("spring");
            }
            if (month == 6 && day < 15) {
                System.out.println("spring");
            }
            if (month == 3 && day < 16) {
                System.out.println("winter");
            }
        }
        // if the dates fall between the days of summer say so
        if (month <= 9 && month >= 6) {
            if (month == 6 && day <= 16) {
                System.out.println("summer");
            }
            if (month == 9 && day < 15) {
                System.out.println("summer");
            }
            if (month == 9 && day >= 16) {
                System.out.println("fall");
            }
        }
        // if the dates fall between the days of fall say so
        if (month <= 12 && month >= 9) {
            if (month == 12 && day <= 15) {
                System.out.println("fall");
            }
            if (month == 12 && day > 15) {
                System.out.println("winter");
            }
        }
        // if the dates fall between the days of winter say so
        if (month == 12 && month <= 3) {
            if (month == 12 && day >= 16) {
                System.out.println("winter");
            }
            if (month == 3 && day <= 15) {
                System.out.println("winter");
            }
        }
         // if the dates fall between the months of winter say so       
        if(month == 2||month == 1){
            System.out.println("winter");
        }
        // if the dates fall between the months of spring say so
        if(month == 4||month == 5){
            System.out.println("spring");
        }
        // if the dates fall between the months of summer say so
        if(month == 7||month == 8){
            System.out.println("summer");
        }
        // if the dates fall between the months of fall say so
        if(month == 10||month == 11){
            System.out.println("fall");
        }
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            // get the dates
            System.out.println("what month is it in numbers");
            int month = input.nextInt();
            System.out.println("what day is it in numbers");
            int day = input.nextInt();
            // call the method
            season(month, day);
        }

    }
}
