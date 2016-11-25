
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author baayl3669
 */
public class Lesson {

    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static double calcRectArea(double length, double width) {

        double answer = length + width;
        return answer;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHello();
        sayHello("Subaru");
        sayHello("Rem");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name1 = input.nextLine();
        System.out.println("Hello " + name1);
        sayHello(name1);

        System.out.println("Please input a length");
        double length = input.nextDouble();
        System.out.println("Please input a width");
        double width = input.nextDouble();

        double area = calcRectArea(length, width);
        System.out.println("Area is " + area);


    }
}
