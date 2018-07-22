import edu.duke.*;
import java.io.*;
public class part2 {
    public String findSimpleGene(String dna,String startCodon,String stopCodon)
    {
        
    if(dna == dna.toLowerCase()){
    startCodon = startCodon.toLowerCase();
    stopCodon = stopCodon.toLowerCase();
    }
    
    int startIndex = dna.indexOf(startCodon);
    if(startIndex == -1){
     return "";
    }
   int stopIndex = dna.indexOf(stopCodon,startIndex+3);
    if(stopIndex == -1){
     return "";
    }
    String result = "";
    result = dna.substring(startIndex,stopIndex+3);
    int diff = stopIndex+3  - startIndex;
    
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
        String gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("The Gene is "+gene);
        
        dna = "ATGGCTACGTAAAT";
        System.out.println("The DNA is " +dna );
        gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("The Gene is "+gene);
        
         dna = "atggcataa";
        System.out.println("The DNA is " +dna );
         gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("The Gene is "+gene);
        
         dna = "TAAATGGCTACGTAAAT";
        System.out.println("The DNA is " +dna );
         gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("The Gene is "+gene);
        
         dna = "GCTAGTAAAT";
        System.out.println("The DNA is " +dna );
         gene = findSimpleGene(dna,"ATG","TAA");
        System.out.println("The Gene is "+gene);
        
    }
}
    
    


