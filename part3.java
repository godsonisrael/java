
/**
 * Write a description of part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class part3 {
    public String twoOccurences(String a,String b)
    {
     //int fisrtString = a.indexOf(a);
     int frstOccur = b.indexOf(a);
     int secOccur  = b.indexOf(a,frstOccur+a.length() );
     int thrdOccur = b.indexOf(a,secOccur+a.length() );
     
     if( frstOccur == -1 || secOccur == -1)
     {
         return "false";
        }
        
     else return "true";
     
    }
    
    public void testing()
    {
     String ex1 = twoOccurences("by","by abby");
     System.out.println(ex1);
     
     ex1 = twoOccurences("an","banana");
     System.out.println(ex1);
      
     
     ex1 = twoOccurences("atg","atgcgataa");
     System.out.println(ex1);
    }
    

}
