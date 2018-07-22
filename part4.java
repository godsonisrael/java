package strings;


/**
 * Write a description of part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;

public class part4 {
    public String youTubeLink(String uTube)
    {
    URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
  
     String match = new String();
     for(String Link : ur.words())
     {
         Link = Link.toLowerCase();
         
         int index = Link.indexOf(uTube);
          
         if(index != -1){
             
             int firstIndex = Link.indexOf("\"");
             
             int lastIndex = Link.lastIndexOf("\"");
             
             
            match = Link.substring(firstIndex,index) + uTube + Link.substring(index+uTube.length(),lastIndex);
            
            }
        
         
         
        }
        return match ;
        
    }
    
    public void testRunning()
    {
      String matchFound = youTubeLink("youtube.com");
      System.out.println(matchFound);
      
    }
    
    
    

}
