
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
    
        
    public static String examGrade(double grade){
    	//define letter
    	String letter = "";
    	//create conditions
    	if(grade<50){
        	letter = "F";
    	}else if(grade<59){
        	letter = "D";
    	}else if(grade<69){
        	letter = "C";
    	}else if(grade<79){
        	letter = "B";
    	}else
        	letter = "A";
    	return letter;
    	
	}
   	
	
	public static void main(String[] args) {
    	// TODO code application logic here
    	//create input for the user
    	Scanner input= new Scanner(System.in);
    	System.out.println("Please type in exam grade in %");
    	//let user answer
    	int grade = input.nextInt();
    	//call method and print to test
    	String l = examGrade(grade);
    	
        	System.out.println(l);
    	
    	
    	
    	
	}
}





