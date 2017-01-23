
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q8 {
    public static void seasons (int month, int day){
     if(month == 12){
        if(day <= 16){
            System.out.println("Winter.");
     } 
     }
     if(month == 1){
         System.out.println("Winter.");
     }
     if(month == 2){
         System.out.println("Winter.");
    }
     if(month == 3){
         if(day >= 15){
             System.out.println("Winter.");
         }
     }
     if (month == 3){
         if(day <= 16){
             System.out.println("Spring.");
         }
     }
     if(month == 4){
         System.out.println("Spring.");
    }
     if (month == 5){
         System.out.println("Spring.");
     }
     if (month == 6){
         if(day <= 15){
             System.out.println("Spring.");
         }
     }
     if(month == 6){
         if(day <= 16){
             System.out.println("Summer.");
         }
     }
     if(month == 7){
         System.out.println("Summer.");
     }
     if(month == 8){
         System.out.println("Summer.");
     }
     if(month == 9){
         if(day >= 16){
             System.out.println("Fall.");
         }
     }
     if(month == 10){
         System.out.println("Fall.");
     }
     if(month == 11){
         System.out.println("Fall.");
     }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create scanner for user input
        Scanner input = new Scanner(System.in);
        //ask user for month
        System.out.println("Which month is it?");
        int month = input.nextInt();
        //ask user for day
        System.out.println("What day is it?");
        int day = input.nextInt();
        seasons(month,day);
        
    }
}
