package earthQuake;


/**
 * Write a description of largestQuake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

 
public class largestQuake {
    
 public void findLargestquakes(){
     EarthQuakeParser parser = new EarthQuakeParser();
     String source = "nov20quakedatasmall.atom";
     ArrayList<QuakeEntry> list = parser.read(source);
    int largeIdx = indexOfLargest(list);
     
    /* ArrayList<QuakeEntry> largestQuakes = getLargest(list,5);
     for(QuakeEntry qe : largestQuakes){
     System.out.println(qe);
    }*/
     System.out.println("the largest earthQuake is at Location "+ (largeIdx) +" and the Magnitude "+list.get(largeIdx).getMagnitude() );
     
    }
    
    
    public int indexOfLargest(ArrayList<QuakeEntry> quakeData){
       int largeIndex =0;
     for(QuakeEntry qe : quakeData){
     
       double qeMag = qe.getMagnitude();
        double large = 0;
         
         if(large < qeMag){
             
             large = qeMag;
            
             largeIndex = quakeData.indexOf(qe);
            
             
            }
         
          } 
        return largeIndex;
        }
        
      public ArrayList<QuakeEntry> getLargest(ArrayList<QuakeEntry> quakeData,int howMany){
          
          ArrayList<QuakeEntry> ret = new ArrayList<QuakeEntry>();
          
          if(quakeData.size() > howMany)
          {
          for(int i = 0 ; i < howMany ; i++ )
         {
           int largeIndex =  indexOfLargest(quakeData);
           
           ret.add(quakeData.get(largeIndex));
           
           quakeData.remove(largeIndex);
          
         }
        
        }
        else
        {
            return quakeData ;
        }
        
        return ret;  
        }
        
        
        
      
    }


