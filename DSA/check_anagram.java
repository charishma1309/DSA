// Given an integer N, check whether it's an Armstrong number or not.
// Note: Armstrong number is a number that is equal to the sum of cubes of its digits.

import java.util.*;
public class check_anagram{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long a;
        Scanner s=new Scanner(System.in);
         long t=s.nextInt();
        long result=0;
        long n=t;
        
         while(t>0)
         {
              a=t%10;
             //System.out.println("a" +a);
             result+=(a*a*a);
             //System.out.println("result" +result);
             t=t/10;
             //System.out.println("t" +t);
         }
        if(n==result)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}