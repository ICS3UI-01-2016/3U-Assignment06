
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q4 {
    
    public static void compoundInterest(int n, double P, double r){
        double B = 0;
        B=P*Math.pow((1+r), n);
        System.out.println(B);
        
    }
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input initial amount");
        double P = input.nextDouble();
        
        System.out.println("Please input interest rate");
        double r = input.nextDouble();
        
        System.out.println("Please input number of years");
        int n = input.nextInt();
        
        compoundInterest(n,P,r);
    }
}
