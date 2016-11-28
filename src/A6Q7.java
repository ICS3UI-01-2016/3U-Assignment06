import java.util.Scanner;

/**A6Q7
 * Find the first digit
 * @author micla1676
 */
public class A6Q7 {
    //create method firstDigit
public static void firstDigit(int nswitch){
    //convert number to positive if negative
    if(nswitch < 0){
        //multiply by -1
        nswitch = nswitch * -1;
    }
    
    //create a loop that loops until nswitch is less then 10
        while(nswitch > 9){
    //divide the integer by 10
    nswitch = nswitch / 10;
        }
        
    //print out the answer
    System.out.println("The first digit is:" + nswitch);
     
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
            int nswitch = input.nextInt();
            //run method lastDigit
            firstDigit(nswitch);
            
        }
        
    }
}
