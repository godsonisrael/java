package BreakingCipher;


/**
 * Write a description of caeserBreaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caeserBreaker {
    
  public String decrypt(String encrypted,int key){
      
     CaeserCipher cc = new CaeserCipher();
     String message = cc.encrypt(encrypted,26-key);
     return message;   
    }
    
    public void testDecrypt(){
        int key = 7;
        String ipMessage = "Lujyfwapvu huk zljbypaf hyl mbukhtluahs whyaz vm avkhf'z Pualyula.";
        String decryptedMessage = decrypt(ipMessage,key);
        System.out.println(decryptedMessage);
    
    }
    
    public String halfOfString(String message, int start){
     
        StringBuilder newString = new StringBuilder();
        
        for(int i=start ; i < message.length();i=i+2){
         newString.append(message.charAt(i)); 
         
        }
          
        return newString.toString();
    }
    
    public int[] countLetters(String ip){
        int[] freq = new int[ip.length()];
       
     for(int i = 0 ; i< ip.length() ; i++){
         
        if(Character.isLetter(ip.charAt(i)))
        {
          freq[ip.charAt(i)]++;
        }
      } 
       return freq;
       
    }
    
    public void maxIndex(String[] freq){
    
        for(int i = 0 ; i < freq.length ;i++){
        
        
        }  
    }
    
    
    public void getKey(String s){
    
        int[] letterFrequencies = countLetters(s);
        
         for (int i = 0; i < s.length(); i++) {
            if (letterFrequencies[i] != 0) {
                System.out.println((char) i + " --> " + letterFrequencies[i]);
            }
        
        
    }
}
    
    public void test(){
    String s =  halfOfString("Qbkm Zgis",1);
    System.out.println(s);
    }

}
