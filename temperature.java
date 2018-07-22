package temperatureMeasure;


/**
 * Write a description of temperature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;

public class temperature {
    public CSVRecord coldestHourInFile(CSVParser parser){
       
       CSVRecord smallestSoFar = null;  
       
       for(CSVRecord rec : parser)
       {
          
         smallestSoFar = smallestOf(rec,smallestSoFar); 
        }
       return smallestSoFar; 
    }
    
    public CSVRecord smallestOf(CSVRecord rec,CSVRecord smallestSoFar){
        
       
      if(smallestSoFar == null) 
            smallestSoFar = rec ;
            else
            {
               
             double temp = Double.parseDouble(rec.get("TemperatureF"));
             double smallTemp = Double.parseDouble(smallestSoFar.get("TemperatureF"));
              if(temp < smallTemp){
                  
                  smallestSoFar = rec;
                  
                  }
                
            }  
        
        
        
        
      return smallestSoFar;  
    }
    
    public void testColdestHourInFile(){
     FileResource fr = new FileResource();
     CSVParser parser = fr.getCSVParser();
        
     CSVRecord coldest = coldestHourInFile(parser);
     System.out.println("The Coldest Temperature was "+ coldest.get("TemperatureF")+"at"+coldest.get("TimeEST"));;
        
     
        
    }
    
    public void testFileWithColdestTemp(){
     
     String coldFile = fileWithColdestTemp();   
        
     System.out.println("The coldest day was in file " + coldFile);
     
     
  /*   FileResource fr = new FileResource(coldFile);
     CSVParser parser = fr.getCSVParser();
     
      CSVRecord coldest = coldestHourInFile(parser);
      System.out.println("The coldest temperature on that day was " + coldest.get("TemperatureF"));
     
      System.out.println("All the temperatures on that day were: ");
      for(CSVRecord rec : parser){
         System.out.println( rec.get("DateUTC")+"\t"+rec.get("TemperatureF") ); 
        } */
    }
    
    public String fileWithColdestTemp(){
        
        
        File temp = null; 
        double smallestSoFar = 0.0;
        CSVRecord coldest =  null;
        
     DirectoryResource dr = new DirectoryResource(); 
     
     for(File f : dr.selectedFiles()){
    
         FileResource fr = new FileResource(f);
        coldest = coldestHourInFile(fr.getCSVParser());
        
        double coldestTemp = Double.parseDouble(coldest.get("TemperatureF"));
        
        if(smallestSoFar == 0.0) 
            smallestSoFar = coldestTemp ;
           
               
        if(smallestSoFar < coldestTemp){
                 temp = f;
                }
             
        
        }
     return temp.getName();
    }

}
