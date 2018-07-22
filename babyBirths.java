package babyNames;


/**
 * Write a description of babyBirths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
import org.apache.commons.csv.*;

public class babyBirths {
    
    public void totalBirths(CSVParser parser){
        int maleBabyCount = 0;
        int femaleBabyCount = 0;
        int totalBirths = 0;
        
       for(CSVRecord rec:parser)
       { 
           
        String gender = rec.get(1);
        int numBorn = Integer.parseInt(rec.get(2));
        totalBirths += numBorn;
        
        //int count  = Integer.parseInt(rec.get(2));
        if(gender == "M"){
         maleBabyCount += numBorn ;   
        }
        
        else{
         femaleBabyCount += numBorn ;   
        }
        
         
        }
        System.out.println("The Total Birth = "+ totalBirths +"\n"+"maleBabies = "+maleBabyCount + "\n" + "FemaleBabies = "+femaleBabyCount);
        
        
    }
    
    public int getRank(int year,String name,String gender){
        
    int largeMaleValue =  0;
    int  LargefemaleValue = 0;
    int rank = 0;
    for(CSVRecord rec : parser){
        
        
        
        
        if(rec.get(1)==gender && rec.get(0)==name){
        return rank;
        
          }  
    }
public void tester(){
 
 babyBirths bb = new babyBirths();
 FileResource fr = new FileResource();
 CSVParser parser = fr.getCSVParser(false);
 
 bb.totalBirths(parser);
 
    
    
    
    
}
}
