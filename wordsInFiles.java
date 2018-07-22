package GladLib;

/**
 * Write a description of wordsInFiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;
import edu.duke.*;

public class wordsInFiles {
    
    private HashMap<String,ArrayList<String>>map;

  public wordsInFiles(){
    
      map = new HashMap<String,ArrayList<String>>();   
    
  } 

    private void addWordsFromFile(File f){
       FileResource fr = new FileResource(f);
       String fileName = f.getName();
       for(String s : fr.words() ){
    
         if(!map.keySet().contains(s)){ 
        
            map.put(s,new ArrayList<String>());
            map.get(s).add(fileName);
        }
        
        else{
            
            map.get(s).add(fileName);
            
        }
       
        
      }
    
    
    }
    
    public void buildWordFileMap(){
       map.clear();
      DirectoryResource dr = new DirectoryResource();
       for(File f : dr.selectedFiles()){
     
        addWordsFromFile(f); 
     
     } 
    
   }

      public int maxNumber(){
       int max = 0;
       for(ArrayList<String> s: map.values()){
         
         if(s.size() > max){
            max = s.size(); 
            }
            
        }
        return max ;
     
   }
    
    public ArrayList<String> wordsInNumFiles(int number){
       ArrayList<String> listOfWords = new ArrayList<String>(); 
       for(String s : map.keySet()){
           
         int arraySize = map.get(s).size();  
         if(number == arraySize){
            listOfWords.add(s) ;
            }
        
           
    }
     return listOfWords ;
  }
  
  public void printFilesIn(String word){
      
     for(String s : map.keySet()) {
         if(s == word){
             
             ArrayList<String> val = map.get(s);
             for(int  i = 0; i<val.size() ; i++){
                 System.out.println(word+" appears in the file "+val.get(i));
                }
            }
         
        }
      
      
    }
    
    public void tester(){
     buildWordFileMap();
     int maximumNum = maxNumber();
     ArrayList<String> words = wordsInNumFiles(maximumNum);
     for(int j = 0 ; j < words.size() ; j++){
         
          printFilesIn(words.get(j));
          
        }
        
    }


  }
