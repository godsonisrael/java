package multi;


/**
 * Write a description of multiplesOf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class multiplesOf
 {
    public static int multiples(int t , int f)
    {
        int sum=0;
    for(int i=1;i <= 1000;i++)
    { 
    if((i%t)==0||(i%f)==0)
    {
       sum = sum + i ;
    }
    else
    {
        return 0;
    }
    }
     return sum ;
        
    }
    public static void main()
    {
        multiplesOf mul = new multiplesOf();
        int ans = mul.multiples(3,5);
        System.out.println("The Sum is"+ans);
    }

}
