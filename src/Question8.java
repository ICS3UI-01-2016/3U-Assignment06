
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    //new method that determines the season
    public static void season(int month, int day) {
      // spliting up the months
        if (month==12 && day>=16 && day<=31){
          System.out.println("The season is winter");
      }
      if (month==1&& day <31 ){
          System.out.println("The season is winter");  
      }
      if (month==2&& day <31){
          System.out.println("The season is winter");
      }
      if (month==3 && day<=15){
          System.out.println("The season is winter");  
      }
      if (month==3 && day>=16 && day<=31){
          System.out.println("The season is Spring");
      }
      if (month==4&& day <31){
          System.out.println("The season is Spring");  
      }
      if (month==5&& day <31){
          System.out.println("The season is Spring");
      }
      if (month==6 && day<=15){
          System.out.println("The season is Spring");  
      }
      if (month==6 && day>=16 && day<=31){
          System.out.println("The season is Summer");
      }
      if (month==7&& day <31 ){
          System.out.println("The season is Summer");
          
      }
      if (month==8&& day <31 ){
          System.out.println("The season is Summer");
          
      }
      if (month==9 && day<=15){
          System.out.println("The season is Summer");  
      }
      if (month==9 && day>=16 && day<=31){
          System.out.println("The season is Fall");
      }
      if (month==10&& day<=31){
          System.out.println("The season is Fall");
      }
      if (month==11&& day<=31){
          System.out.println("The season is Fall");
      }
      if (month==12&& day<=15){
          System.out.println("The season is Fall");
      }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please the Month");
        int month = input.nextInt();
        System.out.println("Please the Day");
        int day = input.nextInt();
        season(month, day);
    }
}
