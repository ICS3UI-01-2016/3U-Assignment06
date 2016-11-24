/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class A6Q9 {
    //
    public static void allDigitsOdd(int number){
        //
        int last = number % 10;
        //
        while (last % 2 == 1){
            number = number / 10;
            last = number % 10;
        }
        //
        if (number <= 10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        allDigitsOdd(9145293);
    }
}
