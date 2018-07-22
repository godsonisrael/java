
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class part1 {
     public void getAllGenes(String dna){
            
         int startIndex = dna.indexOf("ATG"); 
         int stopIndex = dna.indexOf("TAA",startIndex+3 );
         StorageResource sr = new StorageResource();
         while(true){
             
             String gene = dna.substring(startIndex,stopIndex+3);
             if((stopIndex+3 - startIndex) % 3  == 0)
             {
             sr.add(gene);
             
            }
             startIndex =dna.indexOf("ATG", stopIndex +3 );
             stopIndex = dna.indexOf("TAA",startIndex+3 );
            
             
             if(startIndex == -1)break;
            }
            
            for(String getGene : sr.data()){
                System.out.println(getGene);
                
            }
         
            
       }
       
       public void testGetGenes()
       {
         part1 pt = new part1();
         String dna = "ATGCGTTAA";
         pt.getAllGenes(dna);
         dna = "ATTCGATGCGTAACGTATGCGTATCTAA";
         pt.getAllGenes(dna);
         
        }

}
