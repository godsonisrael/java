
/**
 * Write a description of part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class part3 {
    public void processGenes(StorageResource sr){
    
        for(String longer : sr.data()){
            
            if(longer.length() > 9)
            System.out.println(longer);
            
        }
        int count = 0;
         for(String longer : sr.data()){
            
            if(longer.length() > 9)
            count = count+1;
          
        }
        System.out.println(count);
        
        for(String ratio : sr.data()){
            float CGRatio = cgRatio(ratio);
            
            if(CGRatio > 0.35)
            {
              System.out.println(CGRatio);  
            }
        
            
            
            
        }
        
        for(String ratio : sr.data()){
            float CGRatio = cgRatio(ratio);
            
            if(CGRatio > 0.35)
            {
              System.out.println(ratio);  
            }
        
            
            
            
        }
        
        int maxLength = 0;
        String longest = null; 
        for(String longestString : sr.data())
        {
         
         if(longestString.length()  >  maxLength)
         
         {
         maxLength = longestString.length();
         
         longest = longestString ;
        }
         
        }
        
        System.out.println(longest);
        
        
    }
    
    
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
    
    public void testProcessGenes()
    {
        part3 pt = new part3();
     StorageResource sr = new StorageResource();
     sr.add("ATGCGATAA");
     sr.add("ATGCGAATGCGTAAT");
     
     pt.processGenes(sr);
        
    }

}
