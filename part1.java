
/**
 * Write a description of part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;

public class part1 
{
    public String findSimpleGene(String dna){
    int startCodon = dna.indexOf("ATG");
    if(startCodon == -1){
     return "";
    }
   int stopCodon = dna.indexOf("TAA",startCodon+3);
    if(stopCodon == -1){
     return "";
    }
    String result = "";
    result = dna.substring(startCodon,stopCodon+3);
    int diff = stopCodon+3  - startCodon;
    if(diff % 3 == 0 ) 
    {
        return result;
    }
    else return "";
    
    

    }
    
    public void testSimpleGene()
    {
    
        String dna = "ATGGCTAGTAAAT";
        System.out.println("The DNA is " +dna );
        String gene = findSimpleGene(dna);
        System.out.println("The Gene is "+gene);
        
        dna = "ATGGCTACGTAAAT";
        System.out.println("The DNA is " +dna );
        gene = findSimpleGene(dna);
        System.out.println("The Gene is "+gene);
        
         dna = "ATGGCTAGAT";
        System.out.println("The DNA is " +dna );
         gene = findSimpleGene(dna);
        System.out.println("The Gene is "+gene);
        
         dna = "TAAATGGCTACGTAAAT";
        System.out.println("The DNA is " +dna );
         gene = findSimpleGene(dna);
        System.out.println("The Gene is "+gene);
        
         dna = "GCTAGTAAAT";
        System.out.println("The DNA is " +dna );
         gene = findSimpleGene(dna);
        System.out.println("The Gene is "+gene);
        
    }
}
