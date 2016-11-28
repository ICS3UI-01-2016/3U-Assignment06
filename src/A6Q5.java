
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**A6Q5
 * generate random number of asterisks
 * @author micla1676
 */
public class A6Q5 {

    //System.out.print("hello ");
       // System.out.println("world");
    public static void chaotic(int lines){
        //loop until x reaches integer lines
        for(int x = 0; x < lines; x = x + 1){
        //generate a random number between 1 and 5
        int randNum = (int)(Math.random()*(5-1+1))+1;
        
        //create a loop that loops upto the random number
        for(int y = 0; y < randNum; y = y + 1){
        
        //print a astrisk
        System.out.print("*");
        }
        //goto the next line
        System.out.println("");
        }
        
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
            int lines = input.nextInt();      
            //run the chaotic method
            chaotic(lines);
           
            }
        }
    }

