// In a given integer N, check whether the ith bit is set or not.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class check_bit{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        int b=0;
        if(n==0)
        {
            a.add(0,0);
        }
        while(n>0)
        {
            b=n%2;
            a.add(0,b);
            n=n/2;
        }
       if(k<a.size())
       {
            int d=a.size()-k-1;
        if(a.get(d)==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
       }
        else
        {
            System.out.println("false");
        }
    }
}