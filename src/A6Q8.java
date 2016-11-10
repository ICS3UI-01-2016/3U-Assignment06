/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call method
        date(12, 16);
    }

    public static void date(int month, int day) {
        //For the people that think December is a fall month
        boolean fakeSeasons = true;
        if (fakeSeasons == true) {
            //if statements for months that fall completely in one season
            //winter
            if (month == 1 || month == 2) {
                System.out.println("Winter");
            }
            //spring
            if (month == 4 || month == 5) {
                System.out.println("Spring");
            }
            //summer
            if (month == 7 || month == 8) {
                System.out.println("Summer");
            }
            //fall
            if (month == 10 || month == 11) {
                System.out.println("Fall");
            }
            //if statements for conflicted months according to some
            //winter/spring
            if (month == 3) {
                //winter
                if (day < 16) {
                    System.out.println("Winter");
                }
                //spring
                if (day > 15) {
                    System.out.println("Spring");
                }
            }
            //spring/summer
            if (month == 6) {
                //spring
                if (day < 16) {
                    System.out.println("Spring");
                }
                //summer
                if (day > 15) {
                    System.out.println("Summer");
                }
            }
            //summer/fall
            if (month == 9) {
                //summer
                if (day < 16) {
                    System.out.println("Summer");
                }
                //fall
                if (day > 15) {
                    System.out.println("Fall");
                }
            }
            //fall/winter
            if (month == 12) {
                //fall
                if (day < 16) {
                    System.out.println("Fall");
                }
                //winter
                if (day > 15) {
                    System.out.println("Winter");
                }
            }
        }
        //For the real seasons
        if (fakeSeasons == false) {
            //winter
            if (month == 1 || month == 2 || month == 12) {
                System.out.println("Winter");
            }
            //spring
            if (month == 4 || month == 5 || month == 3) {
                System.out.println("Spring");
            }
            //summer
            if (month == 7 || month == 8 || month == 6) {
                System.out.println("Summer");
            }
            //fall
            if (month == 10 || month == 11 || month == 19) {
                System.out.println("Fall");
            }
        }
    }
}
