
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author slatz8075
 */
public class Question3 {

    public static void factors(int num) {
        //create a string to be the factors of the number (already including 1)
        String Factors = "1";
        //Create a for loop that divides the numder by numbers 
        //until number is being divided by half of itself 
        for (int i = 2; i <= num / 2; i = i + 1) {
            //create a integer to find a factor
            int x = num % i;
            //if there is not a remainder add I to the list of factors
            if (x == 0){
            //modify the string to include the new factor
            Factors =  Factors + ", " + i;
            }
        }
        System.out.println("The factors of " + num + " are " + Factors + ", " + num);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner for input
        Scanner input = new Scanner(System.in);
        //ask them to input the number they want the factors of
        System.out.println("Please enter the number you wish to find the factors of");
        //store number
        int num = input.nextInt();
        //use method
        factors(num);
    }
}
