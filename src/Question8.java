
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 * @author Tmister911
 */
public class Question8 {

    public static void season(int month, int day) {
        while (1 == 1) {
            if (month == 12 && day > 20) {
                System.out.println("Winter");
            }
            if (month == 1) {
                System.out.println("Winter");
            }
            if (month == 2) {
                System.out.println("Winter");
            }
            if (month == 3 && day <= 14) {
                System.out.println("Winter");
            }
            if (month == 3 && day >= 15) {
                System.out.println("Winter");
            }
            if (month == 4) {
                System.out.println("Spring");
            }
            if (month == 5) {
                System.out.println("Spring");
            }
            if (month == 6 && day <= 15) {
                System.out.println("Spring");
            }
            if (month == 6 && day >= 14) {
                System.out.println("Summer");
            }
            if (month == 7) {
                System.out.println("Summer");
            }
            if (month == 8) {
                System.out.println("Summer");
            }
            if (month == 9 && day >= 15) {
                System.out.println("Summer");
            }
            if (month == 9 && day <= 16) {
                System.out.println("Fall");
            }
            if (month == 10) {
                System.out.println("Fall");
            }
            if (month == 11) {
                System.out.println("Fall");
            }
            if (month == 12 && day <= 15) {
                System.out.println("Fall");
            }
            if (month == 12 && day >= 16) {
                System.out.println("Winter");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //geo lives on as a scanner
        Scanner geo = new Scanner(System.in);
        System.out.println("Please enter the month as a number. ie March is 3");
        int month = geo.nextInt();
        System.out.println("Please enter the day of the month");
        int day = geo.nextInt();
        season(day, month);

    }

}
