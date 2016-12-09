/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavra1870
 */
public class A6Q1 {
    // create a method  called area cric that calculates the area of a circle

    public static double areacirc(double radius) {
        double answer = (radius * radius) * 3.14;
        // return the answer in order the the method to be applied     
        return answer;
    }

    // Test out the method to make sure that is works   
    public static void main(String[] args) {
        double area = areacirc(3.5);
        // print out the answer that the medoth calculated  
        System.out.println(" The area of the circle is " + area);

    }
}
