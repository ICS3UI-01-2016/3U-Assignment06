

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khant5061
 */
public class Question1 {

    /**
     * @param args the command line arguments
     *
     */
    
    public static double circleArea(double radius){
        double area;
        area = Math.PI*radius*radius;
            return area;
        
                
        
    }
    
    
    public static void main(String[] args) {
        double ans = circleArea(5);
        System.out.println(ans);
    }
}
