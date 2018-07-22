
/**
 * Write a description of charactersInplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import edu.duke.*;
import java.util.ArrayList;

public class charactersInplay {
    
     private ArrayList<String>names;
     private ArrayList<Integer>counts;
    
    public charactersInplay(){
       names = new  ArrayList<String>();
       counts = new  ArrayList<Integer>();
        
     }
    
    
    public void update(String person){
       
        int idx = names.indexOf(person);
        
        if(idx == -1)
        {
         names.add(person);
         counts.add(1);
          
        }
        else{
            int val = counts.get(idx);   
            counts.set(idx,val+1);
        }
          
    }
    
    public void  findAllCharacters(){
     FileResource fr = new FileResource();
      names.clear();
      counts.clear();
           
       for(String s : fr.lines()){  
        
         int periodIndex = s.indexOf(".");
         if(periodIndex != -1){
         String person = s.substring(0,periodIndex);
         update(person);
        }
        } 
        
        
        
        
        
    }
    public void charactersWithNumParts(int num1,int num2){
       for(int k=0 ; k < names.size() ; k++){
           
           
          if((counts.get(k) >= num1)&&(counts.get(k) <= num2))   
        
          System.out.println("If we print those with count greater than "
                     +num1+"and lesser than "+num2+",then our Output is "+names.get(k) +"\t" +counts.get(k));
          
         
              
         } 
    
    }
    public void tester(){
     findAllCharacters();
     
     for(int k=0 ; k < names.size() ; k++){
         
         
         System.out.println(names.get(k) +"\t" +counts.get(k));         
         }
        
        
     charactersWithNumParts(2,3);   
        
        
        
        
    }
    
    
}
