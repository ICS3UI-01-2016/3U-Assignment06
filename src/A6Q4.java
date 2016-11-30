
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
//        B = i(1 + r) ^ n

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the initial amount deposited");
        double i = input.nextDouble();
        System.out.println("Please input the anual intrest rate as a decimal");
        double r = input.nextDouble();
        System.out.println("Please input the number of years the money will be deposited for");
        double n = input.nextDouble();
        compoundInterest(i,r,n);
    }
     public static void compoundInterest(double i, double r, double n) {
        double R =(1 + r);
        double b = Math.pow(R,n);
        double B = i*b;
         System.out.println("your total amount is "+ B);
    }
}

