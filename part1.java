
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class part1 {
    public int findStopCodon(String dna,int startIndex,String stopCodon)
    {
        int stopIndex = dna.indexOf(stopCodon,startIndex+3);
        
        if(stopIndex == -1){
         return dna.length();   
        }
        
        int diff = stopIndex+3 - startIndex ;
        
        if(diff % 3 == 0 ){
         return stopIndex;   
        }
        
        return 0;
         
        
     
        
    }
    
    public void testFindStopCodon(){
        String dna = "ATGGTATAATGACGTATCGA";
        int gene = findStopCodon(dna,0,"GTA");
        System.out.println(gene);
        
    }
    
    public String findGene(String dna){
     int startIndex = dna.indexOf("ATG");
     if(startIndex == -1){
         return "";
        }
     int stopIndex1 = findStopCodon(dna,startIndex,"TAA");
     
     
     int stopIndex2 = findStopCodon(dna,startIndex,"TAG");
    
     int stopIndex3 = findStopCodon(dna,startIndex,"TGA");
     
     int minIndex1 = Math.min(stopIndex2,stopIndex3);
     int minIndex = Math.min(stopIndex1,minIndex1);
     if(minIndex == dna.length())return "";
     
     String gene = dna.substring(startIndex,minIndex+3);
     
     
     
    // if(!gene.contains("TAA") && !gene.contains("TAG") && !gene.contains("TGA"))return"";
      return gene;  
    }
    
    public void testFindGene(){
        String dna = "ATGTAACGTATGTAA";
        String gene = findGene(dna);
        System.out.println(gene);
        
        
        }
        
        public void printAllGenes(String dna){
            
         int startIndex = dna.indexOf("ATG"); 
         int stopIndex = dna.indexOf("TAA",startIndex+3 );
         
         while(true){
             
             String gene = dna.substring(startIndex,stopIndex+3);
             if((stopIndex+3 - startIndex) % 3  == 0)
             {
             
             System.out.println(gene);
            }
             startIndex =dna.indexOf("ATG", stopIndex +3 );
             stopIndex = dna.indexOf("TAA",startIndex+3 );
            
             
             if(startIndex == -1)break;
            }
         
            
        }
        
        public void maintestPrint()
        {
         part1 pt = new part1();
         String dna = "ATGTAACGTATGTAA";
         pt.printAllGenes(dna);
        }
        
       

}
