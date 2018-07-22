package logFiles;


/**
 * Write a description of class LogAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
    
     
     public LogAnalyzer(){
         
       records = new ArrayList<LogEntry>();
       
     }
        
     public void readFile(String filename) {
         FileResource fr = new FileResource(filename);
         for(String s : fr.lines()){
             
               LogEntry l = WebLogParser.parseEntry(s);
               records.add(l);
     
            }
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     
     public int countUniqueIPs(){
        ArrayList<String> uniqueIPs = new ArrayList<String>();
        
        for(LogEntry le : records){
            String ipAddress = le.getIpAddress();
            if(!uniqueIPs.contains(ipAddress)){
             uniqueIPs.add(ipAddress);   
            }
            
        }
        
        return uniqueIPs.size();
        
        }
        
        public void printAllHigherThanNum(int num){
            for(LogEntry le : records){
                
             int status = le.getStatusCode();
             if(status > num){
                System.out.println(status);
                }  
            }
            
            }
     
            public ArrayList<String> uniqueIPVisitsOnDay(String someDay){
                ArrayList<String> uniqueIPs = new ArrayList<String>();
              for(LogEntry le : records){
                  String ipAddress = le.getIpAddress();
                  Date logDate = le.getAccessTime();
                  if(logDate.equals(someDay))
                    if(!uniqueIPs.contains(ipAddress)){
                     uniqueIPs.add(ipAddress);
                }
                
                
            } 
            return uniqueIPs ;
        }
        
        public int countUniqueIPsInRange(int low ,int high){
           
          ArrayList<String> uniqueIPs = new ArrayList<String>();
        
          for(LogEntry le : records){
            int status = le.getStatusCode();
            String ipAddress = le.getIpAddress();
            
            if(status > low && status < high)
            if(!uniqueIPs.contains(ipAddress)){
             uniqueIPs.add(ipAddress);   
            }
            
          }
        
          return uniqueIPs.size(); 
             
        }
        
        public HashMap<String,Integer> countVisitsPerIP(){
            
          HashMap<String,Integer> map = new HashMap<String,Integer>();  
          for(LogEntry le : records){
           
           String ipAddress = le.getIpAddress();
           if(!map.keySet().contains(ipAddress)){
               
              map.put(ipAddress , 1) ;
            }
            else{
                
                map.put(ipAddress , map.get(ipAddress)+1 );
                }
            
          }
          return map;  
        }
        
        public int mostNumberVisitsByIP(HashMap<String,Integer> map){
            int max = 0;
           for(Integer v : map.values()){
             
             if(v > max){
                 max = v ;
                }
            }
            return max;
        }
        
        public ArrayList<String> IPsMostVisits(HashMap<String,Integer> map){
          ArrayList<String> ipAddress = new ArrayList<String>();  
          int mostVisits = mostNumberVisitsByIP(map);  
          for(String s : map.keySet()){
              if(map.get(s) == mostVisits){
                  
                  ipAddress.add(s);
                }
              
            }
           return ipAddress; 
        }
        
        public HashMap<String,ArrayList<Strnig>> ipsForDays(){
            
            
            
            
            
            
            
        }
        
    }
