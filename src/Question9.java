
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
public class Question9 {

    public static void allDigitsOdd(String number) {
        if (number.contains("2") || number.contains("4") || number.contains("6") || number.contains("8") || number.contains("0")) {
             System.out.println("False");
        }else {
            System.out.println("True");;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some wack positive integer please");
        String number = input.nextLine();
        allDigitsOdd(number);
    }

}
