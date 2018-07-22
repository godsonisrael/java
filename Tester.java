package markovTextGenerator;


/**
 * Write a description of Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.util.*;

public class Tester {
    
  public void testGetFollows(){
      
    /*   FileResource fr = new FileResource();
		String st = fr.asString();
		st = st.replace('\n', ' '); */
	String	st = "this is a test yes this is a test.";
		MarkovOne markov = new MarkovOne();
		markov.setTraining(st);
		
		ArrayList<String> s = markov.getFollows("t");
		
		for(String q : s){
		System.out.println(s);
}
	/*	for(int k=0; k < 3; k++){
			String text = markov.getRandomText(42);
			System.out.println(text);
		}*/
      
      
      
    }

}
