
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woodc9217
 */
public class a6q8test {

    /**
     * @param args the command line arguments
     */
    
    public static String season(int m, int d){
        String season = "";
        int doy= 0;//day of year
        //convert inputs into actual day of year than evaluate what season day of year falls under.
        //calculate day of year
        //create variable to hold #  days in month
        int md= 0;
        //create variable for month by input
        
        //figure out day of year (out of 365) depending on the month
        if(m==1)
            md=0;//january
        if(m==2)
            md=0+31;//feb
        if(m==3)
            md=31+28;//march
        if(m==4)
            md=59+31;//april
        if(m==5)
            md=90+30;//may
        if(m==6)
            md=120+31;//june
        if(m==7)
            md=151+30;//july
        if(m==8)
            md=181+31;//august
        if(m==9)
            md=212+30;//september
        if(m==10)
            md=242+31;//oct
        if(m==11)
            md=273+30;//nov
        if(m==12)
            md=303+31;//dec
        //
        doy= md+d;
        //based on doy determine season
        if(doy>=75 && doy<=165)
            season= "Spring";//date falls between 3/16(75) and 6/15(165)
        if(doy>=166 && doy<=257)
            season= "Summer";//date falls between  6/16(166)  and 9/15(257)
        if(doy>=258 && doy<=349)
            season= "Fall";//date falls between 9/16(258) and 12/15
        if(doy>=350 && doy<=74)
            season= "Winter";//date falls between 12/16(350) and 3/15(74)


        return season;
    } 
    
    
    
    
    public static void main(String[] args) {
        //create input for the user
        Scanner input= new Scanner(System.in);
        //ask user for month
        System.out.println("Please type in # month");
        //let user answer
        int month = input.nextInt();
        //ask user for day
        System.out.println("Please type in # day");
        //let user answer
        int day = input.nextInt();
        //call method
        String s = season(month,day);
        //print season
        System.out.println(s);
        //fix determination of season 3/15 shows empty

    }
}
