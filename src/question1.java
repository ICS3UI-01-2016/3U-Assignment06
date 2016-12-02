
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tmister911
 */
public class question1 {

    public static double circleArea(double radius) {
        double area = (radius * radius) * 3.14;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double area;
        System.out.println("Enter the radius of your circle");

        double radius = input.nextDouble();
        double area1 = circleArea(radius);
        System.out.println("the area of your circle is " + area1);

    }

}
