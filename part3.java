
/**
 * Write a description of part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class part3 {
    public int printAllGenes(String dna){
            
         int startIndex = dna.indexOf("ATG");
         
         int stopIndex = dna.indexOf("TAA",startIndex+3 );
         
         
         
         int count = 0;
         while(true){
             
             
             if((stopIndex+3 - startIndex) % 3  == 0)
             {
                 count = count +1;
             
             
            }
             startIndex =dna.indexOf("ATG", stopIndex +3 );
             stopIndex = dna.indexOf("TAA",startIndex+3 );
             
             if(stopIndex == -1)return 0;
            
             
             if(startIndex == -1)break;
            }
         
            return count ; 
        }
           
        public int countGenes(String dna)
        {
         int geneNum = printAllGenes(dna);
         return geneNum;
         
         
        }
        
        public void testCountGenes(){
         String dna = "ATGTAAATGCGTA";
         int geneCount = countGenes(dna);
         System.out.println("The DNA is "+dna);
         System.out.println("The GeneCount = "+geneCount);
         
         /*dna = "ATGGTATAAGCTATGCGTTAA";
          geneCount = countGenes(dna);
         System.out.println("The DNA is "+dna);
         System.out.println("The GeneCount = "+geneCount);
         
         dna = "ATGGT";
          geneCount = countGenes(dna);
         System.out.println("The DNA is "+dna);
         System.out.println("The GeneCount = "+geneCount);
         
         dna = "GTATAA";
          geneCount = countGenes(dna);
         System.out.println("The DNA is "+dna);
         System.out.println("The GeneCount = "+geneCount);*/
        }
    
}
