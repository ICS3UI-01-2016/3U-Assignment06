
import java.util.Scanner;

/**A6Q6
 *
 * @author micla1676
 */
public class A6Q6 {
    //create method lastDigit
public static void lastDigit(int nx){
    
    //convert number to positive if negative
    if(nx < 0){
        //multiply by -1
        nx = nx * -1;
    }
    
    //mod the integer by 10
    nx= nx % 10;
    
    //print out the answer
    System.out.println("The last digit is:" + nx);
     
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //create a repeating loop
        while(true){
            //ask user for integer
            System.out.println("Please enter a integer:");
            //store interger into a variable
            int nx = input.nextInt();
            //run method lastDigit
            lastDigit(nx);
            
        }
        
    }
}
