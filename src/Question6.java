
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
public class Question6 {

    public static void lastNum(int num1) {
      int num2 = num1 % 10; 
        System.out.println(num2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Yo put some wack integer in");
        int num1 = input.nextInt();
        lastNum(num1);

    }

}
