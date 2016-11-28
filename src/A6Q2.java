
import java.util.Scanner;

/**A6Q2
 *
 * @author micla1676
 */
public class A6Q2 {

    //method to calculate exam grade
    public static void examGrade(int mark){
        /*if the value of mark is less then 50,
           tell user their mark is an F */
        if(mark < 50){
            System.out.println("Your mark is F");
        }
        /*else if the value of mark is greater then or equal to 50,
           but less then or equal to 59, tell user their mark is
           a D*/
        else if (mark >=50 && mark <= 59){
            System.out.println("Your mark is D");
    }
        /*else if the value of mark is greater then or equal to 60,
           but less then or equal to 69, tell user their mark is
           a D*/
        else if (mark >=60 && mark <= 69){
            System.out.println("Your mark is C");
        
    }
        /*else if the value of mark is greater then or equal to 70,
           but less then or equal to 79, tell user their mark is
           a D*/
        else if (mark >=70 && mark <= 79){
            System.out.println("Your mark is B");
        
    }
        /*else if the value of mark is greater then or equal to 80,
           but less then or equal to 100, tell user their mark is
           a A*/
        else if (mark >=80 && mark <= 100){
            System.out.println("Your mark is A");
        
    }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner
        Scanner input = new Scanner(System.in);
        
        //create an infinite loop
        while(true){
            
            //ask user for their exam grade
            System.out.println("Please enter your exam grade:");
            //store user input
            int mark = input.nextInt();
            
            //run the examGrade mathod
            examGrade(mark);
            
        }
    }
}
