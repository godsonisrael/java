package GladLib;


/**
 * Write a description of consecutive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class consecutive {
    public String consecutive(int[] arr){
         int  i = 0;
        while(i < arr.length - 1){
            
            
            
            if(arr[i+1] != -1){
                
            if(arr[i+1] == arr[i] + 1) {
              i++;
            }
            else{
             return "The Array is not Consecutive";
               
            }
            
        }
           
    }
    return "The array is Consecutive";
}

     public void tester(){
         int[] arr = {1,2,4};
         System.out.println( consecutive(arr) );
        }

}
