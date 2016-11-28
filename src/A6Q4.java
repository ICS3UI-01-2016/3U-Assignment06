
import java.util.Scanner;

/**A6Q4
 *
 * @author micla1676
 */
public class A6Q4 {

    //create method to calculate the compound interest
    public static void compoundInterest (double P, double R, int N){
        //B=P(1+r)^n
        
        //add 1 to R
        R = R+1;
        //set R equal to R to the power of N
        R = Math.pow(R,N);
        
        //create double to represent account balance, and set it equal to
        //P * R
        double B = P * R;
        
        //round to nearest hundredth
        //multiply by 100
         B = B * 100;
         //round
         B = Math.round(B);
         
         //divide by 100
         B = B / 100;
        
        //print out the result
        System.out.println("Your balance is " + B);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //create an infinite loop
        while(true){
            //ask user for the inital amount in their balance
            System.out.println("Please enter your inital account balance:");
            //store user input into a double
            double P = input.nextDouble();
           
            //ask user for the interest rates
            System.out.println("Please enter the interest rate in decimal"
                    + " format:");
            //store user input into a double
            double R = input.nextDouble();
            
            //ask user for the number of years the interest is applied
            System.out.println("Please enter the number of years the interest"
                    + " is applied:");
            //store user input into an integer
            int N = input.nextInt();
            
            //execute the compound interest method
            compoundInterest(P,R,N);
        }
    }
}
