package GladLib;

import edu.duke.*;
import java.util.*;


public class codonCount {
    private HashMap<String,Integer>mapCount;
    
    public codonCount(){
     mapCount = new HashMap<String,Integer>();   
    }

    public void buildCodonMap(int start,String dna){
       mapCount.clear();
       int unique = 0;
       int i = start;
       while(i < dna.length()){
         
      String codon = dna.substring(i,i+3);
      
      
      if(mapCount.keySet().contains(codon))
       {
         mapCount.put(codon,mapCount.get(codon)+1); 
        }
        else
        {
            mapCount.put(codon,1);
            
            unique++ ;
        }
        
       i = dna.indexOf(codon)+3; 
       
       if(i == -1)
       break;
       
     }
      System.out.println("Reading frame Starting with "+start+" results in "+unique); 
    }
    
    public String getMostCommonCodon(){
     int max = Collections.max(mapCount.values());
      
      return "";       
    } 
    
   public void tester(){
       
     buildCodonMap(0,"CGTGCACGT");
    
       
    }
    
}
