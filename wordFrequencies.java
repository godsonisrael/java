
/**
 * Write a description of wordFrequencies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import edu.duke.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class wordFrequencies {
    
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public wordFrequencies(){
    
    myWords = new ArrayList<String>();
    myFreqs = new ArrayList<Integer>();
    
    }
    
    public void findUnique(){
      FileResource fr = new FileResource();
      myWords.clear();
      myFreqs.clear();
        
      for(String s : fr.words()){  
        
        String word = s.toLowerCase();
        int idx = myWords.indexOf(word);
        
        if(idx == -1)
        {
         myWords.add(word);
         myFreqs.add(1);
          
        }
        else{
            int val = myFreqs.get(idx);   
            myFreqs.set(idx,val+1);
        }
        }
       
    }
    public int findIndexOfMax(){
        
     int idx = Collections.max(myFreqs);
     
     return idx ;
   
    }
    
    public void tester(){
        
     findUnique();
     System.out.println("#Unique Words : " + myWords.size());
     for(int k=0 ; k < myWords.size() ; k++){
         
         
         System.out.println(myFreqs.get(k) +"\t" +myWords.get(k));         
         }
        
     int idx = findIndexOfMax();
     int loc = myFreqs.indexOf(idx);
     System.out.println("The word that Occurs most often and its count are :"+ myWords.get(loc) +"\t"+ idx);
        
    }

}
