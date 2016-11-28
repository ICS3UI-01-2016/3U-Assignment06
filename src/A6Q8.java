
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
        
        if ((month == 12 && day >=16 && day <=31) || (month ==1 && day >1 && day <31) || (month ==2 && day >1 && day <31) || (month == 3 && day >=15 && day <=31)){
           return "Winter";
        }
            if ((month == 3 && day >=16 && day <=31) || (month == 4 && day > 1 && day < 31) || (month ==5 && day > 1 && day < 31) || (month == 6 && day >=15 && day <=31)) {
                return "Spring";
              }
              if ((month  == 6 && day >=16 && day <=31) || (month == 7 && day > 1 && day < 31) || (month == 8 && day > 1 && day < 31) || (month == 9 && day >=15 && day <=31)){
                     return "Summer";
              } else {
                      return "Fall";
                  } 
              }
        
        
                
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter the Month number:");
        int month = input.nextInt ();
        
        System.out.println("Please Enter the Day:");
        int day = input.nextInt();
        
        System.out.println(season(month,day));
    }
}
