
import java.util.Scanner;

/**A6Q3
 *
 * @author micla1676
 */
public class A6Q3 {
    
    public static void factors(int paramater){
        //let x be equal to the paramater
        int x = paramater;
        //create a loop that coninues until i = x - 1. 
        for(int i = 1; i < x; i = i + 1){
            //check to see if x/i has any remainders 
            double a = x%i;
             
            //if a has no remainder, print out I.
          if(a == 0){
                 System.out.println(i);
         }
        }
        //print out x
          System.out.println(x);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanenr
        Scanner input = new Scanner(System.in);
        
        //create an infinite loop
        while(true){
            //ask user for the number to factor
            System.out.println("Please enter the paramater you wish to factor");
            
            //store the input into an integer
            int paramater = input.nextInt();
            
            //run the factors method to calculate factors of paramater
            factors(paramater);
        }
        
    }
    
}
