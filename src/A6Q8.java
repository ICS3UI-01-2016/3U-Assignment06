
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q8 {
    
    public static void season(int m, int d){
        
        if((m == 12 && d >= 15) || m == 1 || m == 2 || (m == 3 && d <= 15)){
            System.out.println("Winter");
    }
        if((m == 3 && d >= 16) || m == 4 || m == 5 || (m == 6 && d <= 15)){
            System.out.println("Spring");
    }
        if((m == 6 && d >= 16) || m == 7 || m == 8 || (m == 9 && d <= 15)){
            System.out.println("Summer");
    }
        if((m == 9 && d >= 16) || m == 10 || m == 11 || (m == 12 && d <= 15)){
            System.out.println("Fall");
    }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input months");
        int m = input.nextInt();
        
        System.out.println("Please input days");
        int d = input.nextInt();
        
        season(m,d);
        
        
        
        
    }
}
