/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl
 */
public class A6Q8 {
    public static void Season(int month, int day){
        //
        if (day >= 16 || day <= 15) {
            if (month >= 12 || month <= 3) {
                System.out.println("The season is winter");
            }
        }
        //
        if (day >= 16 || day <= 15) {
            if (month >= 3 || month <= 6) {
                System.out.println("The season is spring");
            }
        }
        //
        if (day >= 16 || day <= 15) {
            if (month >= 6 || month <= 9) {
                System.out.println("The season is summer");
            }
        }
        //
        if (day >= 16 || day <= 15) {
            if (month >= 9 || month <= 1) {
                System.out.println("The season is fall");
            }
        }
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
