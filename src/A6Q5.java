/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call method
        chaotic(9);
    }

    public static void chaotic(int lines) {
        //Make a for loop for the amount of lines required
        for (int start = 0; start <= lines; start++) {
            //Create a random number between 0 and 4
            int random = (int) (Math.random() * (4 - 0 + 1)) + 0;
            //have a string of 5 asterisks
            String asterisk = "*****";
            //split the string according to the random number
            String split = asterisk.substring(random);
            System.out.println(split);
        }
    }
}
