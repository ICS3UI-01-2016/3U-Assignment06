/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A6Q2 {
    // making a method that will return the user's mark in lettered form
    // The "double percent" is where the user is going to input theur information 

    public static void markedletter(double percent) {
        //if the user's input is less than the number 50, return the letter F 
        if (percent < 50) {
            System.out.println(" The percent that you got on the test translates to a F ");
        }
        //if the user's input is equal to the number 50, return the letter F  
        if (percent == 50) {
            System.out.println(" The percent that you got on the test translates to a F ");
        }
        //if the user's input is between the number 50 and 59, return the letter D   
        if (percent > 50 && percent < 59) {
            System.out.println(" The persencent that you got on the test translate to the letter D ");
        }
        //if the user's input is equal to 50 or 59, return the letter D 
        if (percent == 50 && percent == 59) {
            System.out.println(" The persencent that you got on the test translate to the letter D ");
        }
        //if the user's input is between the number 60 and 69, return the letter D  
        if (percent > 60 && percent < 69) {
            System.out.println(" The persencent that you got on the test translate to the letter C");
            //if the user's input equals the number 60 and 69, return the letter C 
        }
        //if the user's input equal 60 or 69, return the letter C
        if (percent == 60 && percent == 69) {
            System.out.println(" The persencent that you got on the test translate to the letter C");
        }
        //if the user's input is between the number 70 and 79, return the letter B
        if (percent > 70 && percent < 79) {
            System.out.println(" The persencent that you got on the test translate to the letter B");
        }
        //if the user's input is equal to the number 70 or 79, return the letter B 
        if (percent == 70 && percent == 79) {
            System.out.println(" The persencent that you got on the test translate to the letter B");
        }
        //if the user's input is more than the number 80, return the letter A   
        if (percent > 80) {
            System.out.println(" The persencent that you got on the test translate to the letter A");
        }
        //if the user's input is equal to the number 50, return the letter A
        if (percent == 80) {
            System.out.println(" The persencent that you got on the test translate to the letter A");
        }
    }

    /**
     * @param args the command line arguments
     */
    //Test the number and make sure that it works
    public static void main(String[] args) {
    //Apply the method
    markedletter(80);

    }
}
