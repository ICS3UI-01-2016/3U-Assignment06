/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A6Q3 {
// make a method that takes the useress input and the computer will responed with all of the numbers that can evenly divide  

    public static void factor(int number) {
        // make a for loop count
        for (int count = 1; count < 10; count = count + 1) {
            // Divide the user's input by all of the numbers the 1 and 10      
            int remainder = number % count;
            // Keep doing that until the result equals 0       
            if (remainder == 0) {
                // restate the numbers that divide evenly 
                System.out.println("the factor that geos into the number area " + count);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    //test the method to make sure that it worked
    public static void main(String[] args) {
        //Apply method
        factor(10);
    }
}
