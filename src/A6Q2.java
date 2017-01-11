/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A6Q2 {
    
    public static void examGrade (double grade){
        // if the user's grade is less than 50%
        if (grade < 50){
            System.out.println("The letter grade for your exam is F.");
        }
        // if the user's grade is 50%
        if (grade == 50){
            System.out.println("The letter grade for your exam is D.");
        }
        //if the user's grade is between 50% and 59%
        if (grade > 50  && grade < 59){
            System.out.println("The letter grade for your exam is D.");
        }
        // if the user's grade is 60%
         if (grade == 60){
            System.out.println("The letter grade for your exam is C.");
         }
         // if the user's grade is between 60% and 69%
        if (grade > 60  && grade < 69 ){
            System.out.println("The letter grade for your exam is C.");
        }
        // if the user's grade is 70%
         if (grade == 70){
            System.out.println("The letter grade for your examn is B.");
          }
         // if the user's grade is between 70% and 79%
        if (grade > 70  && grade < 79){
            System.out.println("The letter grade for your examn is B.");
        }
        // if the user's grade is 80 %
           if (grade == 80){
            System.out.println("The letter grade for your exam is A.");
           }
           //if the user's grade is higher than 80%
        if (grade > 80 ){
            System.out.println("The letter grade for your exam is A.");
        }
            
             
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // try to find if the method above is working
        examGrade (70);
      
    }
}
