
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author messr2578
 */
public class A6Q3 {

    public static void factors(int Int) {
        int fact = 1;
        int c = 1;
        //check the integers until you find 1
        while (fact != 0) {
            c = c + 1;
            fact = Int / c;
    //check to see if it is a factor 
            if (c * fact == Int) {
                System.out.println(fact);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input an integer");
        int Int = input.nextInt();
        factors(Int);


    }
}
