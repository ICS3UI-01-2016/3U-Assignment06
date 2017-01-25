
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class A6Q3 {
    public static int factor (int num){
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
        factor(num);
        System.out.println("" + num);
        
        
    }
}
