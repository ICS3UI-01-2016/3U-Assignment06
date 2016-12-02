
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
public class Question3 {

    public static void factors(int numbToFactor) {
        int f = 1;
        while (f < numbToFactor) {
            int factor = numbToFactor % f;
            if (factor == 0) {
                System.out.println(f);

            }
            f++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number to factor");
        int numbToFactor = input.nextInt();
        factors(numbToFactor);
    }

}
