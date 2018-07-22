package BreakingCipher;


/**
 * Write a description of wordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;


public class CaeserCipher {
   /* private String alphabet;
    private String shiftedAlphabet;
    private int mainKey;
    
    public CaeserCipher(int key){
      alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
 
        
    }
    
   public String decrypt(String input){
        
      CaeserCipher cc = new CaeserCipher(26-mainKey);
     String message = cc.encrypt(input);
    return message;   
        
        
        
    }
    
    */
    
    
    public String isVowel(char ch){
        
     char vowels[] = {'a','e','i','o','u'};
     
         if(Character.isUpperCase(ch)==true)
       {
        ch = Character.toLowerCase(ch);   
           
        }
      
     for(int i=0 ; i < vowels.length ; i++){
    
      
        
       if(ch == vowels[i] ) return "true";
       
    
    }

      return "false";
    }


      



public String replaceVowels(String phrase,char ch){
 StringBuilder sb = new StringBuilder(phrase);
 
 for(int i =0;i < sb.length() ;i++)
 {
  
  String check = isVowel(sb.charAt(i));  
  if(check == "true"){ 
    
         sb.setCharAt(i,ch);
    }
  
    
    }

    return sb.toString();   
    
    
    
    
}

public String emphasize(String phrase,char ch){
StringBuilder sb = new StringBuilder(phrase);

 for(int i =0;i <sb.length() ;i++)
 {
  
  if(sb.charAt(i) == ch) 
  {
  if(i%2 == 0){ 
    
         sb.setCharAt(i,'*');
    }
     else
      {
       sb.setCharAt(i,'+');
      
      }
    }
    
    
    }

    return sb.toString(); 
 }
 
public String encrypt(String message,int key){
    
    
 StringBuilder encrypted = new StringBuilder(message);   
 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
 String shifted = alphabet.substring(key)+alphabet.substring(0,key);
 
  
    
 for(int i=0;i<encrypted.length();i++){
     
     char curr = encrypted.charAt(i);
     int index = alphabet.indexOf(curr);
     
     if(index != -1){
         char shiftedChar = shifted.charAt(index);
         encrypted.setCharAt(i,shiftedChar);
      }
    else{
        
     char uCurr = Character.toUpperCase(curr);
      int uIndex =alphabet.indexOf(uCurr);  
      if(uIndex != -1){  
      char shiftedChar = shifted.charAt(uIndex);
         encrypted.setCharAt(i,Character.toLowerCase(shiftedChar));  
        }   
    }
    }
   return encrypted.toString(); 
}

public String encryptTwoKeys(String message,int key1,int key2){
    
StringBuilder encrypted = new StringBuilder(message);    
    
 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
 String shifted1 = alphabet.substring(key1)+alphabet.substring(0,key1);
 String shifted2 = alphabet.substring(key2)+alphabet.substring(0,key2);
 
  
    
 for(int i=0;i<encrypted.length();i++){
     
   char curr = encrypted.charAt(i);
   int index = alphabet.indexOf(curr);
     if(index != -1){
       if(i%2==0){
         char shiftedChar1 = shifted1.charAt(index);
         encrypted.setCharAt(i,shiftedChar1);
        }
         else{
            char shiftedChar2 = shifted2.charAt(index);
            encrypted.setCharAt(i,shiftedChar2);
            }
      }
    else{
        
        char uCurr = Character.toUpperCase(curr);
        int uIndex =alphabet.indexOf(uCurr);  
       if(uIndex != -1){
          if(i%2==0){     
         char shiftedChar1 = shifted1.charAt(uIndex);
         encrypted.setCharAt(i,Character.toLowerCase(shiftedChar1));  
        } 
       else{
       char shiftedChar2 = shifted2.charAt(uIndex);
         encrypted.setCharAt(i,Character.toLowerCase(shiftedChar2)); 
    
         }
        }
      }

     
    }
     return encrypted.toString();
}


public void testCaesar() 
{
    int key = 7;
//FileResource fr = new FileResource();
//String message = fr.asString();
String encrypted = encrypt("Encryption and security are fundamental parts of today's Internet.", key);
//String encrypt = encryptTwoKeys("First Legion",23,17);
System.out.println("key is " + key + "\n" + encrypted );        
}

public void tester2(){
    
 String s = replaceVowels("Hello World",'*');
 System.out.println(s);
 
 s = emphasize("dna ctgaaactga",'a');
 System.out.println(s);
 
 s = emphasize("Mary Bella Abracadabra",'a');
 System.out.println(s);
 
}


public void tester(){
    
String vowel = isVowel('D');    
    
 System.out.println(vowel);   
      
}

}





