
/**
 * Write a description of part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class part2 {

    public float cgRatio(String dna)
    {
     int cIndex = dna.indexOf("C");
     int gIndex = dna.indexOf("G");
     float count = 0 ;
     
     while(cIndex != -1 ){
         
       count = count+1;
       cIndex = dna.indexOf("C",cIndex+1);
      
        }
         while( gIndex!=-1){
         
       count = count+1;
      
       gIndex = dna.indexOf("G",gIndex+1);
        }
       
      int dnaSize = dna.length();
      float cgRatio = count/dnaSize ;
      return cgRatio;
      
    }
    
    public void testCGRatio()
    {
     String dna = "ACGTAACGT";
     float ratio = cgRatio(dna);
     System.out.println(ratio);
    }
    
    
}
