/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitaa8228
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call method
        System.out.println(circleArea(12));
    }
    //Make method
    public static double circleArea(double radius) {
        //Find area of the circle
        double area = Math.pow(radius, 2) * Math.PI;
        //return the area
        return area;
    }
}
