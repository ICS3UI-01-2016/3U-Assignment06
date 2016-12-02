
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
public class Question7 {

    public static void firstDigit(int num1) {

        int num2 = num1 / 10;
        if (num2 > 10) {
            num2 = num2 / 10;
            if (num2 < 10) {

                System.out.println(num2);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // geo lives on
        Scanner geo = new Scanner(System.in);
        System.out.println("Yo put sum wack integer in");
        int num1 = geo.nextInt();
        firstDigit(num1);
    }

}
