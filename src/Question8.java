

import java.util.Scanner;

/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wangk9757
 */
public class Question8 {

    public static void season(int month, int day) {
        if (month == 3) {
            if (day >= 16 && day < 32) {
                System.out.println("Spring");
            }
        }
        if (month == 4) {

            System.out.println("Spring");
        }
        if (month == 5) {

            System.out.println("Spring");
        }
        if (month == 6) {
            if (day <= 15 && day > 0) {
                System.out.println("Spring");
            }
        }
        if (month == 6) {
            if (day >= 16 && day < 32) {
                System.out.println("Summer ");
            }
        }
        
        if (month == 7) {

            System.out.println("Summer");
        }
        if (month == 8) {

            System.out.println("Summer ");
        }
        if (month == 9) {
            if (day <= 16 && day > 0) {
                System.out.println("Summer");
            }
        }
        if (month == 9) {
            if (day >= 16 && day < 31) {
                System.out.println("Fall ");
            }
        }
        if (month == 10) {
            System.out.println("Fall ");
        }

        if (month == 11) {
            System.out.println("Fall ");
        }
        if (month == 12) {
            if (day < 16 && day > 0) {
                System.out.println("Fall ");
            }
        }

        if (month == 12) {
            if (day >= 16 && day < 31) {
                System.out.println("Winter");
            }
        }
        if (month == 1) {

            System.out.println("Winter ");
        }
        if (month == 2) {

            System.out.println("Winter ");
        }
        if (month == 3) {
            if (day < 16 && day > 0) {
                System.out.println("Winter ");
            }
        }
    
}

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        //ask user for month 
        System.out.println("Enter month");
        //save the integer as last 
        int month = input.nextInt();
        System.out.println("Enter Day");
        int day = input.nextInt();
          season(month,day);
    }
}