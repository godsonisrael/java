
/**
 * Write a description of part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class part2 {
    public int howMany(String a,String b)
    {
     int count = 0;
     int Occur = b.indexOf(a);
     
    while(Occur != -1){
        
        count = count+1;
        
        Occur = b.indexOf(a , Occur + a.length());
        
        
     
     
    }
     
     return count;
     
    }
    
    public void testhowMany(){
     
        int numOfOccurences  = howMany("GAA","GAACGTTAAGAA");
        System.out.println(numOfOccurences);
    }
    
    
    
    

}
