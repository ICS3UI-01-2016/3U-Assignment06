
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q8 {
    
    public static String season (int month, int day){
        // this if statements means that if the month starts with of december and the day is not greater or less than 16 or the day is greater and less than 31
        // if the month is january and the day is less than 1 and the day is greater than 31
        // if the month is february and the day is less than 1 an dthe day is greater than 31
        // if the month is march and the day starts with greater or less than 15 or the day is greater and less than 31
        if ((month == 12 && day >=16 && day <=31) || (month ==1 && day >1 && day <31) || (month ==2 && day >1 && day <31) || (month == 3 && day >=15 && day <=31)){
            // print if all the months are in winter season
           return "Winter";
        }
        // if the month starts with march and the day starts with gretear or less than 16 or the day is greater and les than 31
        // if the month starts with april and the day is less than 1 and the day is greater than 31
        // if the month starts with may and the day starts with less than 1 and the day is greater than 31
        // if the monthe starts with june and the day starts with gretear or less than 15 and less than greater and less than 31
            if ((month == 3 && day >=16 && day <=31) || (month == 4 && day > 1 && day < 31) || (month ==5 && day > 1 && day < 31) || (month == 6 && day >=15 && day <=31)) {
                // print if all the months are in spring season
                return "Spring";
              }
            // if the month starts with june and the day starts with gretear or less than 16 or the day is greater or less than 31
            // if the month starts with july and the day starts with less than 1 or greater than 31
            // if the month starts with august and the day with less than 1 or greater than 31
            // if the month starts with september and the day starts with greater or less than 1 or the day starts with less then or greter31
              if ((month  == 6 && day >=16 && day <=31) || (month == 7 && day > 1 && day < 31) || (month == 8 && day > 1 && day < 31) || (month == 9 && day >=15 && day <=31)){
                  // print iof all the months are in summer season
                     return "Summer";
              } else {
                  // else if the statements are not applied above
                  // print if the months are in fall season
                      return "Fall";
                  } 
              }
        
        
                
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an input for the user
        Scanner input = new Scanner (System.in);
        
        // ask the user for the month
        System.out.println("Please Enter the Month number:");
        int month = input.nextInt ();
        
        // ask the user for the day
        System.out.println("Please Enter the Day:");
        int day = input.nextInt();
        
        // check if the method are working using the string season above
        System.out.println(season(month,day));
    }
}
