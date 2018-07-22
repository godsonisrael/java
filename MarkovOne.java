package markovTextGenerator;


/**
 * Write a description of MarkovOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.*;

public class MarkovOne {
    
     private String myText;
       private Random myRandom;
	
	public MarkovOne() {
		myRandom = new Random();
	}
	
	public void setRandom(int seed){
		myRandom = new Random(seed);
	}
	
	public void setTraining(String s){
		myText = s.trim();
	}
	
	public ArrayList<String> getFollows(String key){
	    
	    ArrayList<String> follows = new ArrayList<String>();
	    int pos = 0;
	    
	    
	    while(pos < myText.length()){
	        
	     int index = myText.indexOf(key,pos);
	     
	     if(index != -1){
	     follows.add(myText.substring(index+1,index+2));
	    }
	   
	        
	     pos = index ;  
	        
	       }
	    
	    
	    
	    
	    return follows;
	   }
	
	public String getRandomText(int numChars){
		if (myText == null){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		
		for(int k=0; k < numChars; k++){
			int index = myRandom.nextInt(myText.length());
			sb.append(myText.charAt(index));
		}
		
		return sb.toString();
	}

}
