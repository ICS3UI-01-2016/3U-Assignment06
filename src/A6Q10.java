/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call method
        boolean thing = sameDashes("criminal-plan", "(206)555-1284");
        System.out.println(thing);
    }

    public static boolean sameDashes(String first, String second) {
        //initialize dashCheck variable
        int dashCheck = -1;
        //while loop until something returns
        while (true) {
            /**
             * Check to see if there is another dash.
             * dashCheck + 1 to check for dashes starting
             * right after the last dash.
             */
            if (first.indexOf("-", dashCheck + 1) == -1) {
                //Check to see if there's another dash in the second string
                if (second.indexOf("-", dashCheck + 1) == -1) {
                    /** 
                     * if there isn't any more dashes in either string then
                     * return true.
                     */
                    return true;
                } else {
                    //otherwise return false
                    return false;
                }
            }
            //Mark where the next/first dash is
            dashCheck = first.indexOf("-", dashCheck + 1);
            /** 
             * if there isn't a dash in the second string where there is in the
             * first string return false.
             * Otherwise loop.
             */
            if (second.charAt(dashCheck) != '-') {
                return false;
            }
        }
    }
}
