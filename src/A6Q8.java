/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A6Q8 {

    public static void season(int month, int day) {
        // If day/month falls in 12/16 to 3/16 it is winter
        if (day >= 16 || day <= 15) {
            if (month >= 12 || month <= 3) {
                System.out.println("The season is winter");
            }
        }
        // If day/month falls in 3/16 to 6/15 it is spring
        if (day >= 16 || day <= 15) {
            if (month >= 3 || month <= 6) {
                System.out.println("The season is spring");
            }
        }
        // If day/month falls in 6/16 to 9/15 it is summer
        if (day >= 16 || day <= 15) {
            if (month >= 6 || month <= 9) {
                System.out.println("The season is summer");
            }
        }
        // If day/month falls in 9/16 to 1/15 it is fall
        if (day >= 16 || day <= 15) {
            if (month >= 9 || month <= 1) {
                System.out.println("The season is fall");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        season(12, 16);
    }
}
