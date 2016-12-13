
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bulka4927
 */
public class A6Q2 {
    
    //method to ask for users grade
    public static void examGrade(){
        System.out.println("Please enter your grade ");
    }
     
    
    /**
     * @param args the command line arguments
     */
      
    //find grade range and output letter grade 
        public static int examGrade (int gr){
            if (gr < 50){
                System.out.println("F");
            }
            if(gr >= 50 && gr < 60){
                System.out.println("D"); 
            
            }
            if(gr >= 60 && gr < 70){
                System.out.println("C");
            
            }
            if(gr >= 70 && gr < 80){
                System.out.println("B");
                
            }
            if(gr >= 80){
                System.out.println("A");
            
        }
            return gr;
        
    }
        public static void main(String[] args) {
        // TODO code application logic here
//get grade percentage from user        
Scanner input = new Scanner(System.in);
        
System.out.println("Enter exam grade percentage");
int gr = input.nextInt();

int examGrade = examGrade(gr);
}
}




