/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khans4349
 */
public class A6Q10 {
    
    public static void sameDashes(String wordOne, String wordTwo){
        
        // make an integer for length of word one
        int lengthWordOne = wordOne.length();
        
        // make an integer for length of word two
        int lengthWordTwo = wordTwo.length();
        
        // if the length of the first word is not equal to the length of the second word
        if (lengthWordOne != lengthWordTwo){
            System.out.println(false);
        }
        // while the length of both words are the same
        int dashesOne = 1;
        int dashesTwo = 0;
        
        while(lengthWordOne == lengthWordTwo){
            for(int i = 0; i <= lengthWordOne; i++){
                if (wordOne.indexOf(i) == ('-')){
                    dashesOne = wordOne.indexOf(i);
                }
            }
            for(int i = 0; i <= lengthWordTwo; i++){
                if(wordOne.indexOf(i) == ('-')){
                    dashesTwo = wordTwo.indexOf(i);
                }
            }
            if(dashesOne == dashesTwo){
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
                break;
            }
            
        }
        
        
        
//        int length = names1.length();
//        for (int i = 1; i < length; i++){
//                names1.indexOf('-');
//                System.out.println();
//        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String wordOne = "hi-";
        String wordTwo = "by-";
        sameDashes(wordOne, wordTwo);
    }
}
