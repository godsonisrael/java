package earthQuake;


/**
 * Write a description of class QuakeSortInPlace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class QuakeSortInPlace {
    public QuakeSortInPlace() {
        // TODO Auto-generated constructor stub
    }
   
    public int getSmallestMagnitude(ArrayList<QuakeEntry> quakes, int from) {
        int minIdx = from;
        for (int i=from+1; i< quakes.size(); i++) {
            if (quakes.get(i).getMagnitude() < quakes.get(minIdx).getMagnitude()) {
                minIdx = i;
            }
        }
        return minIdx;
    }
    
    public void sortByMagnitude(ArrayList<QuakeEntry> in) {
       
       for (int i=0; i< in.size(); i++) {
            int minIdx = getSmallestMagnitude(in,i);
            QuakeEntry qi = in.get(i);
            QuakeEntry qmin = in.get(minIdx);
            in.set(i,qmin);
            in.set(minIdx,qi);
        }
        
    }
    
    public int getLargestDepth(ArrayList<QuakeEntry> in,int index){
         int maxIdx = index;
        for (int i=index+1; i < in.size(); i++) {
            if (in.get(i).getDepth() > in.get(maxIdx).getDepth()) {
                maxIdx = i;
            }
        }
        return maxIdx;
        
    }
     
    public void sortByLargestDepth(ArrayList<QuakeEntry> in) {
       
       for (int i=0; i< in.size(); i++) {
            int maxIdx = getLargestDepth(in,i);
            QuakeEntry qi = in.get(i);
            QuakeEntry qmax = in.get(maxIdx);
            in.set(i,qmax);
            in.set(maxIdx,qi);
        }
        
    }
    
    public int onePassBubbleSort(ArrayList<QuakeEntry> quakeData,int numTimes){
         int k = numTimes;
        for (int i=k+1; i < quakeData.size(); i++) {
            if (quakeData.get(i).getMagnitude() < quakeData.get(k).getMagnitude()) {
                k = i;
            }
        }
        return k;
        
    }
    
    public void sortByMagnitudeWithBubbleSort(ArrayList<QuakeEntry> in) {
       int N = in.size();
       
       
       
       for (int i=0; i < N-1; i++) {
            int minIdx = onePassBubbleSort(in,i);
            QuakeEntry qi = in.get(i);
            QuakeEntry qmin = in.get(minIdx);
            in.set(i,qmin);
            in.set(minIdx,qi);
            
            String check = checkInSortedOrder(in);
           /*  System.out.println("Printing Quakes after pass "+ i);
           for(QuakeEntry qe : in){
            
            System.out.println(qe);
          }*/
           
        } 
        
       
    }
    
    public String checkInSortedOrder(ArrayList<QuakeEntry>quake){
        
      for(QuakeEntry qe : quake){
          
          
          
          
        }
        
        return "";
    }

    public void testSort() {
        EarthQuakeParser parser = new EarthQuakeParser(); 
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        String source = "nov20quakedatasmall.atom";
        //String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);  
       
        System.out.println("read data for "+list.size()+" quakes");
        
      /*  for (QuakeEntry qe: list) { 
            System.out.println(qe);
        }*/
        //sortByLargestDepth(list);
        sortByMagnitudeWithBubbleSort(list);
       /* for (QuakeEntry qe: list) { 
            System.out.println(qe);
        } */
        
    }
    
    public void createCSV() {
        EarthQuakeParser parser = new EarthQuakeParser();
        //String source = "data/nov20quakedata.atom";
        String source = "data/nov20quakedatasmall.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        dumpCSV(list);
        System.out.println("# quakes read: " + list.size());
    }
    
    public void dumpCSV(ArrayList<QuakeEntry> list) {
		System.out.println("Latitude,Longitude,Magnitude,Info");
		for(QuakeEntry qe : list){
			System.out.printf("%4.2f,%4.2f,%4.2f,%s\n",
			                  qe.getLocation().getLatitude(),
			                  qe.getLocation().getLongitude(),
			                  qe.getMagnitude(),
			                  qe.getInfo());
	    }
		
	}
}
