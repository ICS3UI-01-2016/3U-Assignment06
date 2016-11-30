

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messr2578
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void Chaotic() {
        int loop = 5;
        // create a pattern of random amounts of stars up to five
        while (loop > 0 && loop <= 5) {
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            if (randNum == 1) {
                System.out.println("*");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if (randNum == 5) {
                System.out.println("*****");
            }
            loop = loop - 1;
        }
    }
    public static void main(String[] args) {
        // call method
        Chaotic();
        
    }
}
