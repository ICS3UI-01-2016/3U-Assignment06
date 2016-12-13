/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int bul) {
        //
        for (int num = 0; num < bul; num = num + 1) {
            //produce random num between 1 and 5
            int ran = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //show asterix for values
            if (ran == 1) {
                //show 1 asterix and 2 for 2 etc
                System.out.println("*");
            }
            if (ran == 2) {
                System.out.println("**");
            }
            if (ran == 3) {
                System.out.println("***");
            }
            if (ran == 4) {
                System.out.println("****");
            }
            if (ran == 5) {
                System.out.println("*****");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //show 7 random asterix counts
        chaotic(7);
    }
}
