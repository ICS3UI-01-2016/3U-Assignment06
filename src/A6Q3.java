/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q3 {
    
    public static void factor (int number){
        // using the for loops to got thorugh the charcters
        for(int i = 1; i < 10; i++){
            //divide the number by i to find the remainder
            int remainder = number % i;
            if (remainder == 0){
                System.out.println("Factors of " + number + " are:" + i);
            }
    }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        factor (10);
        
    }
}
