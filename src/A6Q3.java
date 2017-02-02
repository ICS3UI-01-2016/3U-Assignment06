
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shieg0688
 */
public class A6Q3 {
    public static int factors (int num){
        num = num%2;
        return num;
      
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num =input.nextInt();
        factors(num);
        System.out.println("" + num);
    }
}
