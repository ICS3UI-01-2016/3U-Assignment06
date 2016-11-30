
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keyew7019
 */
public class A6Q5 {
    
    public static void chaotic(){
        
        int randNum = (int)(Math.random()*(5 - 1 + 1)) + 1;
        int n = randNum;
        if(n == 5){
            System.out.println("*****");
        }
        if(n == 4){
            System.out.println("****");
        }
        if(n == 3){
            System.out.println("***");
        }
        if(n == 2){
            System.out.println("**");
        }
        if(n == 1){
            System.out.println("*");
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
        chaotic();
    }
}
