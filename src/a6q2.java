
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q2 {

    /**
     * @param args the command line arguments
     */
    
        
    public static double examGrade(double examgrade){
        double answer = Math.pow(examgrade,2);
        return answer;
        
    }
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        //create input for the user
        Scanner input= new Scanner(System.in);
        System.out.println("Please type in exam grade in %");
        //let user answer
        int grade = input.nextInt();
        //create conditions
        if(grade<50){
            System.out.println("F");
        }else if(grade<59){
            System.out.println("D");
        }else if(grade<69){
            System.out.println("C");
        }else if(grade<79){
            System.out.println("B");
        }else
            System.out.println("A");
        
        
        
        
    }
}
