package WordGrams;


import java.util.*;

public class MarkovWordTwo implements IMarkovModel {
    private String[] myText;
    private Random myRandom;
    
    public MarkovWordTwo() {
        myRandom = new Random();
    }
    
    public void setRandom(int seed) {
        myRandom = new Random(seed);
    }
    
    public void setTraining(String text){
		myText = text.split("\\s+");
	}
	
	private int indexOf(String[] words,String target1,String target2,int start)
	{
	    
	  for (int i = start; i < words.length ;i++){
	      
	    if( words[i].equals(target1) && words[i+1].equals(target2) ) {
	        
	        return i;
	       }
	      
	   }
	   
	   return -1;
}


	
	public String getRandomText(int numWords){
		StringBuilder sb = new StringBuilder();
		int index = myRandom.nextInt(myText.length-1);
		String key1 = myText[index];
		
		int followIndex = index+key1.length() ;
		if(followIndex == -1)
		{
		    return "";
		  }
		
		String key2 = myText[followIndex];
		
		
		sb.append(key1);
		
		sb.append(" ");
		
		sb.append(key2);
		
		
		sb.append(" ");
		
		
		
		for(int k=0; k < numWords-1; k++){
		    ArrayList<String> follows = getFollows(key1,key2);
		    
		    if (follows.size() == 0) {
		        break;
		    }
			index = myRandom.nextInt(follows.size());
			
			
			String next = follows.get(index);

			sb.append(next);
			
			sb.append(" ");
			
			key1 = next;
		        key2 = follows.get(index+1);
			
			
			
		}
		
		return sb.toString().trim();
	}
	
	private ArrayList<String> getFollows(String key1,String key2) {
	  ArrayList<String> follows = new ArrayList<String>();
	   
	  int pos = 0;
	    
	    
	  while(pos < myText.length){
	        
	      int index =indexOf(myText,key1,key2,pos);
	     
	       if((index == -1) && (index + key1.length()+key2.length() >= myText.length-1)){
	         
	         break;
	      
              }
	     
	   
	        follows.add(myText[index+2]); 
	        
	      pos = pos + index + key1.length() + key2.length();  
	        
	      }
	    
	    
	    
	    
	    
	    return follows;
    }

}
